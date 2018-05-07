package suchfilter;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.nodes.Document;

/*
 * Testet, ob die Suchergebnisse für ein Keyword korrekt gespeichert werden
  * Für Matching-Kriterien von searchEngine wird ein Mockup-HTML verwendet
 */
public class SearchresultTest {
  
  ArrayList<Searchresult> result = new ArrayList<>();
  SearchEngine searcher = new SearchEngine("Lorem ipsum");
  
  /*
   * Erstellt ein Dokument aus einer HTML-Datei, sucht nach einem Schlüsselwort in searchEngine und fügt der Suchmaschine Ergebnisse hinzu
   */
  @Before
  public void setUp() throws Exception {
    XmlConverter converter = new XmlConverter();
    ArrayList<Document> document = new ArrayList<>();
    document.add(converter.convertToXml(new File("src/java/suchfilter/testing/mockup.html")));
    searcher.sucheNachText(document);
    result.addAll(searcher.getSearchResults());
  }
  
  /*
   * Testet, ob das Array von xmlSites im Suchergebnis korrekt behandelt wird. da nur eine html-Site durchsucht wird.
   * Das Array enthält ein Dokument. 
   */
  @Test
  public void testGetXmlSite() {
    assertNotNull(result.get(0).getXmlSite());
  }
  
  /*
   * testet, ob das Array von keyElements im Suchergebnis korrekt behandelt wird.
   */
  @Test
  public void testGetKeyElements() {
    assertNotNull(result.get(0).getKeyElements());
  }
  
}
