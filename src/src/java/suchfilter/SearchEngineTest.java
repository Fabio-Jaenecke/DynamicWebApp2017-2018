package suchfilter;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;

/*
 * testet, ob Tags in konvertierter HTML-Datei gefunden werden können. Für alle Kriterien wird
 * Ein Mock-Up-HTML getestet.
 */
public class SearchEngineTest {
  
  SearchEngine searcher;
  Document document;
  
  @Before
  public void setUp() throws Exception {
    XmlConverter converter = new XmlConverter();
    document = converter.convertToXml(new File("src/java/suchfilter/testing/mockup.html"));
    searcher = new SearchEngine("Lorem ipsum");
  }
  
  @Test
  public void testSucheNachUeberschriften() {
    assertNotNull(searcher.sucheNachUeberschriften(document));
  }
  
  @Test
  public void testSucheNachParagraphen() {
    assertNotNull(searcher.sucheNachParagraphen(document));
  }
  
  @Test
  public void testSucheNachListenelementen() {
    assertNotNull(searcher.sucheNachListenelementen(document));
  }
  
  @Test
  public void testSucheNachButtons() {
    assertNotNull(searcher.sucheNachButtons(document));
  }
  
  @Test
  public void testeTeilsuche() {
    searcher.setKeyword("rem");
    assertNotNull(searcher.sucheNachListenelementen(document).get(0));
  }
}
