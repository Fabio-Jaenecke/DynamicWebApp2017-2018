package suchfilter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;

/*
 * Testet, ob die Suchergebnisse für ein Keyword korrekt gespeichert werden
 * Für Matching-Kriterien von searchEngine wird ein Mockup-HTML verwendet
 * Zuerst suchen wir nach dem ganzen Wort "Lorem ipsum"
 */
public class ResultPreviewTest {
  
  ResultPreview resultPreview;
  
  /*
   * Erstellt ein Dokument aus einer HTML-Datei, sucht nach einem Schlüsselwort in searchEngine, erstellt searchresult und fügt es zu resultpreview hinzu
   */
  @Before
  public void setUp() throws Exception {
    XmlConverter converter = new XmlConverter();
    ArrayList<Document> document = new ArrayList<>();
    Searchresult searchresult;
    ArrayList<Searchresult> result = new ArrayList<>();
    
    SearchEngine searcher = new SearchEngine("Lorem ipsum");
    document.add(converter.convertToXml(new File("src/java/suchfilter/testing/mockup.html")));
    searcher.sucheNachText(document);
    result.addAll(searcher.getSearchResults());
    searchresult = new Searchresult(document.get(0), result.get(0).getKeyElements());
    searchresult.prepareResult();
    resultPreview = new ResultPreview(searchresult.getPreviews().get(0).getUrl(), searchresult.getPreviews().get(0).getMetaData());
  }
  
  /*
   * assert dass URL existiert und richtigen Inhalt hat
   */
  @Test
  public void testUrlWholeWord() {
    assertNotNull(resultPreview.getUrl());
    assertEquals("mockup", resultPreview.getUrl());
  }
  
  /*
   * assert dass Metadaten existieren und den richtigen Inhalt haben
   */
  @Test
  public void testMetaDataWholeWord() {
    assertNotNull(resultPreview.getMetaData());
    assertEquals("Lorem ipsum", resultPreview.getMetaData());
  }
  
  @Test
  /*
   * Wir suchen nach der Sequenz von "Lorem ipsum". Dann überprüfen wir, ob das Ergebnis die richtige URL und die richtigen Metadaten hat
   */
  public void testSequence() {
    XmlConverter converter = new XmlConverter();
    ArrayList<Document> document = new ArrayList<>();
    Searchresult searchresult;
    ArrayList<Searchresult> result = new ArrayList<>();
    
    SearchEngine searcher = new SearchEngine("Lor");
    document.add(converter.convertToXml(new File("src/java/suchfilter/testing/mockup.html")));
    searcher.sucheNachText(document);
    result.addAll(searcher.getSearchResults());
    searchresult = new Searchresult(document.get(0), result.get(0).getKeyElements());
    searchresult.prepareResult();
    resultPreview = new ResultPreview(searchresult.getPreviews().get(0).getUrl(), searchresult.getPreviews().get(0).getMetaData());
    
    assertNotNull(resultPreview.getUrl());
    assertEquals("mockup", resultPreview.getUrl());
    
    assertNotNull(resultPreview.getMetaData());
    assertEquals("Lorem ipsum", resultPreview.getMetaData());
  }
}
