package suchfilter;

import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/*
 * repräsentiert das Suchergebnis für ein bestimmtes Keyword
 * Das Ergebnis, das auf der Webseite angezeigt wird, ist in den variablen fromatiert
 */
public class Searchresult {
  
  private Document xmlSite;
  private ArrayList<Element> keyElements = new ArrayList<>();
  private ArrayList<ResultPreview> previews = new ArrayList<>();
  
  public Searchresult(Document document, ArrayList<Element> results) {
    this.xmlSite = document;
    this.keyElements = results;
  }
  
  /*
   * Gibt url von xmlSite zurück und das Tag, das das Schlüsselwort enthält, wird aus Platzgründen bei maximal zwei Elementen zurückgegeben.
   */
  public void prepareResult() {
    for (int idx = 0; idx < 2 && idx < keyElements.size(); idx++) {
      ResultPreview preview = new ResultPreview(getUrl(), getResultText(keyElements.get(idx)));
      previews.add(preview);
    }
  }
  
  public String getResultText(Element element) {
    return element.text();
  }
  
  /*
   * konvertiert HTML-Link zu JSP-Link entfernt übergeordneten Pfad und HTML-Suffix
   */
  public String getUrl() {
    int firstIndex = xmlSite.baseUri().lastIndexOf("\\");
    return xmlSite.baseUri().substring(firstIndex + 1, xmlSite.baseUri().length() - 5);
  }
  
  public Document getXmlSite() {
    return xmlSite;
  }
  
  public ArrayList<Element> getKeyElements() {
    return keyElements;
  }
  
  public ArrayList<ResultPreview> getPreviews() {
    return previews;
  }
}
