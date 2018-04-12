package suchfilter;
import java.io.File;
import java.util.ArrayList;

import org.jsoup.nodes.*;

/**
 * konvertiert die Html-Seiten zu Xml, führt das Suchen nach einem Wort aus und zeigt
 * die Suchresultate an
 * @author Raphael
 *
 */
public class Suchfilter {
	
	private ArrayList<Document> xmlSites = new ArrayList<>();
	private XmlConverter converter = new XmlConverter();
	private SearchEngine searcher;
	
	/*
	 * converts all sites in html-folder to xml-files and adds them to xmlSites
	 * initializes new search engine with keyword and xml-files
	 */
	public Suchfilter(String keyWord) {
		initializeXmlSites();
		searcher = new SearchEngine(keyWord);
	}
	
	/*
	 * searches if headings, paragraphes, list items or buttons contain the key word
	 */
	public void search() {
		searcher.sucheNachText(xmlSites);
	}
	
	/*
	 * load html-files for convertion to xml	
	 */
	public void initializeXmlSites(){
		xmlSites.add(converter.convert(new File("src/webapp/html/lebensmittelkategorie.html")));
		xmlSites.add(converter.convert(new File("src/webapp/html/faq.html")));
		xmlSites.add(converter.convert(new File("src/webapp/html/mahlzeitassistent.html")));
		xmlSites.add(converter.convert(new File("src/webapp/html/rezepte.html")));
		xmlSites.add(converter.convert(new File("src/webapp/html/suche.html")));
		xmlSites.add(converter.convert(new File("src/webapp/html/zugriffsskala.html")));
	}

	/*
	 * returns searchEngine
	 */
	public SearchEngine getSearcher() {
		return searcher;
	}
}
