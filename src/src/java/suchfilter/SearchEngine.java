package suchfilter;

import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/*
 * searches a list of xmlSites for a certain key word
 */
public class SearchEngine {

	private String keyWord;
	private ArrayList<Searchresult> searchResults;

	/*
	 * eine ArrayList von xml-Seiten und das Suchwort werden übergeben
	 */
	public SearchEngine(String keyword) {
		this.keyWord = keyWord;
	}
	
	/*
	 * searches every document for fitting headings, paragraphs,
	 * list elements and buttons
	 */
	public void sucheNachText(ArrayList<Document> xmlSites) {
		for(Document document: xmlSites) {
			ArrayList<Element> results = new ArrayList<>();
			results.addAll(sucheNachUeberschriften(document));
			results.addAll(sucheNachParagraphen(document));
			results.addAll(sucheNachListenelementen(document));
			results.addAll(sucheNachButtons(document));
			if(!results.isEmpty()) {
				searchResults.add(new Searchresult(document, results));
			}
		}
	}


	/*
	 * searches for headings
	 */
	public ArrayList<Element> sucheNachUeberschriften(Document site) {
		ArrayList<Element> results = new ArrayList<>();
		
		results.addAll(searchForTag(site, "h1"));
		results.addAll(searchForTag(site, "h2"));
		results.addAll(searchForTag(site, "h3"));
		results.addAll(searchForTag(site, "h4"));
		
		return results;

	}

	/*
	 * searches for paragraphs
	 */
	public ArrayList<Element> sucheNachParagraphen(Document site) {
		ArrayList<Element> results = new ArrayList<>();
		results.addAll(searchForTag(site, "p"));
		return results;
	}
	
	/*
	 * searches for list elements
	 */
	public ArrayList<Element> sucheNachListenelementen(Document site) {
		ArrayList<Element> results = new ArrayList<>();
		results.addAll(searchForTag(site, "li"));
		return results;

	}

	/*
	 * searches for buttons
	 */
	public ArrayList<Element> sucheNachButtons(Document site) {
		ArrayList<Element> results = new ArrayList<>();
		results.addAll(searchForTag(site, "button"));
		return results;
	}

	/*
	 * searches site for certain tag
	 */
	public ArrayList<Element> searchForTag(Document site, String tag) {
		ArrayList<Element> results = new ArrayList<>();
		for (Element result : site.getElementsByTag(tag)) {
			if (result.text().equals(keyWord)) {
				results.add(result);
			}
		}

		return results;
	}
}
