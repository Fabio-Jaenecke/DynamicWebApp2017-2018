package suchfilter;

import java.io.File;
import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.apache.commons.io.FileUtils;

import controller.servlets.SuchfilterServlet;
import java.io.IOException;
import java.net.URL;



/**
 * konvertiert die Html-Seiten zu Xml, fuehrt das Suchen nach einem Wort aus und zeigt
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
		xmlSites = initializeXmlSites();
		searcher = new SearchEngine(keyWord);
	}
	
	/*
	 * searches if headings, paragraphes, list items or buttons contain the key word
	 */
	public void search() {
		searcher.sucheNachText(xmlSites);
	}
	
	

    public File downloadSucheFilterFiles(String htmlFile) {
        File destination = null;
    	try {
            URL url = new URL("http://localhost:8080/" + SuchfilterServlet.getContextPath() + "/html/" + htmlFile);
            destination = new File(htmlFile);

            // Copy bytes from the URL to the destination file.
            FileUtils.copyURLToFile(url, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    	return destination;
    }
	
	/*
	 * load html-files for convertion to xml	
	 * TODO replace file locations with own path
	 */
	public ArrayList<Document> initializeXmlSites(){
		ArrayList<Document> xmlSites = new ArrayList<>();
		xmlSites.add(converter.convert(downloadSucheFilterFiles("lebensmittelkategorie.html")));
		xmlSites.add(converter.convert(downloadSucheFilterFiles("faq.html")));
		xmlSites.add(converter.convert(downloadSucheFilterFiles("mahlzeitassistent.html")));
		xmlSites.add(converter.convert(downloadSucheFilterFiles("suchfilter.html")));
		xmlSites.add(converter.convert(downloadSucheFilterFiles("rezepte.html")));
		xmlSites.add(converter.convert(downloadSucheFilterFiles("suche.html")));
		xmlSites.add(converter.convert(downloadSucheFilterFiles("zugriffsskala.html")));
		return xmlSites;
	}

	/*
	 * returns searchEngine
	 */
	public SearchEngine getSearcher() {
		return searcher;
	}
}
