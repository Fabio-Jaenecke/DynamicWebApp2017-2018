package suchfilter;

import java.io.File;
import java.util.ArrayList;

import org.jsoup.nodes.Document;

/*
 * Für laufende Unit-Tests erstellen wir einen Filter-Stub
   das HTML-Dateien vom lokalen Dateisystem  bekommt und nicht vom Browser
  * ansonsten hat diese Klasse das gleiche Verhalten wie die normale Klasse Suchfilter.java
 */
public class SuchfilterStub {
  
  private ArrayList<Document> xmlSites = new ArrayList<>();
  private final SearchEngine searchEngine;
  
  /*
   * konvertiert alle Seiten im HTML-Ordner in xml-Dateien und fügt sie zu xmlSites hinzu initialisiert die neue Suchmaschine mit Schlüsselwort
   */
  public SuchfilterStub(String keyWord) {
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
   * erstellt HTML-Dateien, die in XML konvertiert werden sollen
   */
  public ArrayList<Document> initializeXmlSites() {
    XmlConverter converter = new XmlConverter();
    ArrayList<Document> xmlSites = new ArrayList<>();
    
    // for converting html files we first create file with correct path and then convert it
    xmlSites.add(converter.convertToXml(new File("src/webapp/html/lebensmittel.html")));
    xmlSites.add(converter.convertToXml(new File("src/webapp/html/faq.html")));
    xmlSites.add(converter.convertToXml(new File("src/webapp/html/mahlzeitassistent.html")));
    xmlSites.add(converter.convertToXml(new File("src/webapp/html/rezepte.html")));
    xmlSites.add(converter.convertToXml(new File("src/webapp/html/lebensmittelsuche.html")));
    xmlSites.add(converter.convertToXml(new File("src/webapp/html/zugriffsskala.html")));
    return xmlSites;
  }
  
  /*
   * gibt searchEngine zurück
   */
  public SearchEngine getSearcher() {
    return searchEngine;
  }
  
  /*
   * Setzt ein neues Keyword für Testzwecke
   */
  public void setKeyword(String keyword) {
    this.searchEngine.setKeyword(keyword);
  }
}
