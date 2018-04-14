package suchfilter;

import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Searchresult {
	
	private Document xmlSite;
	private ArrayList<Element> keyElements = new ArrayList<>();
	private ArrayList<ResultPreview> previews = new ArrayList<>();
	
	public Searchresult(Document document, ArrayList<Element> results) {
		this.xmlSite = document;
		this.keyElements = results;
	}
	
	/*
	 * returns url of xmlSite and the tag containing the keyword
	 * for reasons of place at maximum two elements are returned
	 */
	public void prepareResult() {
		for(int idx = 0; idx <  2 && idx < keyElements.size(); idx++ ) {
			ResultPreview preview = new ResultPreview(xmlSite.baseUri(), keyElements.get(idx).text());
			previews.add(preview);
		}
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
