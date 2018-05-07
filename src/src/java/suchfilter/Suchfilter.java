package suchfilter;

import java.util.ArrayList;

import org.jsoup.nodes.Document;

/**
 * wandelt HTML-Seiten in XML um, sucht nach Schlüsselwörtern und speichert Suchergebnisse im Variablensuchprogramm
 */
public class Suchfilter {
  
  private ArrayList<Document> xmlSites = new ArrayList<>();
  private final SearchEngine searchEngine;
  
  /*
   * konvertiert alle Seiten im HTML-Ordner in xml-Dateien und fügt sie zu xmlSites hinzu initialisiert die neue Suchmaschine mit Schlüsselwort
   */
  public Suchfilter(String keyWord) {
    xmlSites = initializeXmlSites();
    searchEngine = new SearchEngine(keyWord);
  }
  
  /*
   * Sucht, ob Überschriften, Paragraphen, Listenelemente oder Schaltflächen das Schlüsselwort enthalten
   */
  public void search() {
    searchEngine.sucheNachText(xmlSites);
  }
  
  /*
   * Download HTML-Dateien für die Konvertierung in XML-Dateien
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
    xmlSites.add(converter.convertHtmlToXml("lebensmittelsuche.html"));
    xmlSites.add(converter.convertHtmlToXml("zugriffsskala.html"));
    return xmlSites;
  }
  
  /*
   * gibt searchEngine zurück
   */
  public SearchEngine getSearcher() {
    return searchEngine;
  }
  
  /*
   * Setzen Sie ein neues Keyword für Testzwecke
   */
  public void setKeyword(String keyword) {
    this.searchEngine.setKeyword(keyword);
  }
}
