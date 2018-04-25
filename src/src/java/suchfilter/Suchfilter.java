package suchfilter;

import java.io.File;
import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.apache.commons.io.FileUtils;

import controller.servlets.SuchfilterServlet;
import java.io.IOException;
import java.net.URL;

/**
 * konvertiert die Html-Seiten zu Xml, fuehrt das Suchen nach einem Wort aus und
 * zeigt die Suchresultate an
 * 
 * @author Raphael
 *
 */
public class Suchfilter {

	private ArrayList<Document> xmlSites = new ArrayList<>();
	private XmlConverter converter = new XmlConverter();
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
		ArrayList<Document> xmlSites = new ArrayList<>();
		xmlSites.add(converter.convertHtmlToXml("lebensmittelkategorie.html"));
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
}
