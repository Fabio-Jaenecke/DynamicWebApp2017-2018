package suchfilter;

import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/*
 * Durchsucht eine Liste von xmlSites nach einem bestimmten Schlüsselwort
 */
public class SearchEngine {
  
  private String keyword;
  private final ArrayList<Searchresult> searchResults = new ArrayList<>();
  
  /*
   * keyword für die Suchmaschine
   */
  public SearchEngine(String keyword) {
    this.keyword = keyword;
  }
  
  /*
   * Durchsucht jedes Dokument nach passenden Überschriften, Absätzen, Listenelementen und Schaltflächen
   */
  public void sucheNachText(ArrayList<Document> xmlSites) {
    for (Document document : xmlSites) {
      ArrayList<Element> results = new ArrayList<>();
      results.addAll(sucheNachUeberschriften(document));
      results.addAll(sucheNachParagraphen(document));
      results.addAll(sucheNachListenelementen(document));
      results.addAll(sucheNachButtons(document));
      results.addAll(sucheNachDivs(document));
      if (!results.isEmpty()) {
        searchResults.add(new Searchresult(document, results));
      }
    }
  }
  
  /*
   * Sucht nach Überschriften
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
   * Sucht nach Absätzen
   */
  public ArrayList<Element> sucheNachParagraphen(Document site) {
    ArrayList<Element> results = new ArrayList<>();
    results.addAll(searchForTag(site, "p"));
    return results;
  }
  
  /*
   * sucht nach Listenelementen
   */
  public ArrayList<Element> sucheNachListenelementen(Document site) {
    ArrayList<Element> results = new ArrayList<>();
    results.addAll(searchForTag(site, "li"));
    return results;
    
  }
  
  /*
   * Sucht nach buttons
   */
  public ArrayList<Element> sucheNachButtons(Document site) {
    ArrayList<Element> results = new ArrayList<>();
    results.addAll(searchForTag(site, "button"));
    return results;
  }
  
  /*
   * sucht nach divs
   */
  public ArrayList<Element> sucheNachDivs(Document site) {
    ArrayList<Element> results = new ArrayList<>();
    results.addAll(searchForTag(site, "div"));
    return results;
  }
  
  /*
   * searches site für bestimmte Tags
   */
  public ArrayList<Element> searchForTag(Document site, String tag) {
    ArrayList<Element> results = new ArrayList<>();
    for (Element result : site.getElementsByTag(tag)) {
      if (result.text().contains(keyword)) {
        results.add(result);
      }
    }
    return results;
  }
  
  public ArrayList<Searchresult> getSearchResults() {
    return searchResults;
  }
  
  /*
   * leere Suchergebnisse für Testzwecke
   */
  public void emptySearchResults() {
    this.searchResults.clear();
  }
  
  public String getKeyword() {
    return keyword;
  }
  
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }
}
