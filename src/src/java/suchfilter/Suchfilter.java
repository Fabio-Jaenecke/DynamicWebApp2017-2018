package suchfilter;
import java.io.File;
import java.util.ArrayList;

import org.jsoup.nodes.*;

/**
 * konvertiert die Html-Seiten zu Xml, führt das Suchen nahc einem Wort aus und zeigt
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
	 */
	public Suchfilter(String keyWord) {
		initializeXmlSites();
		searcher = new SearchEngine(xmlSites, keyWord);
	}
	
	/*
	 * sucht zuerst nach Überschriften, dann nach Paragraphen, dann nach Listenelementen und nach
	 * Buttons
	 */
	public void search() {
		searcher.sucheNachText();
	}
	
	public void initializeXmlSites(){
		xmlSites.add(converter.convert(new File("src/webapp/html/lebensmittelkategorie.html")));
		xmlSites.add(converter.convert(new File("src/webapp/html/faq.html")));
		xmlSites.add(converter.convert(new File("src/webapp/html/mahlzeitassistent.html")));
		xmlSites.add(converter.convert(new File("src/webapp/html/rezepte.html")));
		xmlSites.add(converter.convert(new File("src/webapp/html/suche.html")));
		xmlSites.add(converter.convert(new File("src/webapp/html/zugriffsskala.html")));
	}
}
