package suchfilter;

import java.io.File;
import java.util.ArrayList;

import org.jsoup.nodes.Document;

/*
 * for running unit tests, we create a suchfilter stub
 * which gets html-files from local file-system and not from browser
 * otherwise this class has the same behaviour as the normal class Suchfilter.java
 */
public class SuchfilterStub {

	private ArrayList<Document> xmlSites = new ArrayList<>();
	private SearchEngine searchEngine;

	/*
	 * converts all sites in html-folder to xml-files and adds them to xmlSites
	 * initializes new search engine with keyword
	 */
	public SuchfilterStub(String keyWord) {
		xmlSites = initializeXmlSites();
		searchEngine = new SearchEngine(keyWord);
	}

	/*
	 * searches if headings, paragraphes, list items or buttons contain the key word
	 */
	public void search() {
		searchEngine.sucheNachText(xmlSites);
	}

	/*
	 * create html files to be converted to xml
	 */
	public ArrayList<Document> initializeXmlSites() {
		XmlConverter converter = new XmlConverter();
		ArrayList<Document> xmlSites = new ArrayList<>();
		
		// for converting html files we first create file with correct path and then convert it 
		xmlSites.add(converter.convertToXml(new File("src/webapp/html/lebensmittel.html")));
		xmlSites.add(converter.convertToXml(new File("src/webapp/html/faq.html")));
		xmlSites.add(converter.convertToXml(new File("src/webapp/html/mahlzeitassistent.html")));
		xmlSites.add(converter.convertToXml(new File("src/webapp/html/suchfilter.html")));
		xmlSites.add(converter.convertToXml(new File("src/webapp/html/rezepte.html")));
		xmlSites.add(converter.convertToXml(new File("src/webapp/html/suche.html")));
		xmlSites.add(converter.convertToXml(new File("src/webapp/html/zugriffsskala.html")));
		return xmlSites;
	}

	/*
	 * returns searchEngine
	 */	
	public SearchEngine getSearcher() {
		return searchEngine;
	}
	
	/*
	 * set new keyword for testing purposes
	 */
	public void setKeyword(String keyword) {
		this.searchEngine.setKeyword(keyword);
	}
}
