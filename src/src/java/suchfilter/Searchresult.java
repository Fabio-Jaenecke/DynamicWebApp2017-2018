package suchfilter;

import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/*
 * represents search result for a certain keyword
 * result which is displayed on website is formatted in the variable previews
 */
public class Searchresult {

	private Document xmlSite;
	private ArrayList<Element> keyElements = new ArrayList<>();
	private ArrayList<ResultPreview> previews = new ArrayList<>();

	public Searchresult(Document document, ArrayList<Element> results) {
		this.xmlSite = document;
		this.keyElements = results;
	}

	/*
	 * returns url of xmlSite and the tag containing the keyword for reasons of
	 * place at maximum two elements are returned
	 */
	public void prepareResult() {
		for (int idx = 0; idx < 2 && idx < keyElements.size(); idx++) {
			ResultPreview preview = new ResultPreview(getUrl(), getResultText(keyElements.get(idx)));
			previews.add(preview);
		}
	}

	public String getResultText(Element element) {
		return element.text();
	}
	
	/*
	 * converts html link to jsp link
	 * removes parent path and html-suffix
	 */
	public String getUrl() {
		int firstIndex = xmlSite.baseUri().lastIndexOf("\\");
		return xmlSite.baseUri().substring(firstIndex + 1, xmlSite.baseUri().length() - 5);
	}
	
	public Document getXmlSite() {
		return xmlSite;
	}

	public ArrayList<Element> getKeyElements() {
		return keyElements;
	}

	public ArrayList<ResultPreview> getPreviews() {
		return previews;
	}
}
