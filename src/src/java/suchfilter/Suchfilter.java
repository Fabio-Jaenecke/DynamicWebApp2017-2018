package suchfilter;

import java.util.ArrayList;

import org.jsoup.nodes.Document;

/**
 * converts html sites to xml, searches for keyword and saves search results
 * in variable searcher
 */
public class Suchfilter {

	private ArrayList<Document> xmlSites = new ArrayList<>();
	private SearchEngine searcher;

	/*
	 * converts all sites in html-folder to xml-files and adds them to xmlSites
	 * initializes new search engine with keyword
	 */
	public Suchfilter(String keyWord) {
		xmlSites = initializeXmlSites();
		searcher = new SearchEngine(keyWord);
	}

	/*
	 * searches if headings, paragraphes, list items or buttons contain the key word
	 */
	public void search() {
		searcher.sucheNachText(xmlSites);
	}

	/*
	 * download html-files for convertion to xml files
	 */
	public ArrayList<Document> initializeXmlSites() {
		XmlConverter converter = new XmlConverter();
		ArrayList<Document> xmlSites = new ArrayList<>();
		// for getting right url, we name the file with its url pattern
		xmlSites.add(converter.convertHtmlToXml("lebensmittel.html"));
		xmlSites.add(converter.convertHtmlToXml("faq.html"));
		xmlSites.add(converter.convertHtmlToXml("mahlzeitassistent.html"));
		xmlSites.add(converter.convertHtmlToXml("suchfilter.html"));
		xmlSites.add(converter.convertHtmlToXml("rezepte.html"));
		xmlSites.add(converter.convertHtmlToXml("suche.html"));
		xmlSites.add(converter.convertHtmlToXml("zugriffsskala.html"));
		return xmlSites;
	}

	/*
	 * returns searchEngine
	 */	
	public SearchEngine getSearcher() {
		return searcher;
	}
	
	/*
	 * set new keyword for testing purposes
	 */
	public void setKeyword(String keyword) {
		this.searcher.setKeyword(keyword);
	}
}
