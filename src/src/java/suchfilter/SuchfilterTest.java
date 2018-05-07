package suchfilter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/*
 * Testet die Klasse solcher Filter. um die Suche so real wie möglich zu simulieren
  * Wir suchen nach jeder HTML-Seite mit einem Schlüsselwort, das darin enthalten ist
  * HTML-Site
 */
public class SuchfilterTest {
  
  SuchfilterStub suchfilter;
  
  /*
   * erstellt ein solches Filter mit Schlüsselwort. Da dies nur ein Setup ist, setzen wir das Keyword als "Histarantia", was der Titel jedes HTML ist
   * Seite
   */
  @Before
  public void setUp() throws Exception {
    suchfilter = new SuchfilterStub("Histarantia");
  }
  
  /*
   * asserts dass HTML-Sites im HTML-Ordner können in XML-Sites konvertiert werden
   */
  @Test
  public void testInitializeXmlSites() {
    assertNotNull(suchfilter.initializeXmlSites());
  }
  
  /*
   * tests sucht nach keyword in rezepte.html. zuerst suchen wir nach h2 mit text kuerbissuppe dann prüfen wir rezepte die Sequenz "Geeignet für" enthält.
   */
  @Test
  public void testSearchRezepte() {
    String keytext;
    
    // wir suchen nach Stichwort "Kuerbissuppe"
    suchfilter.setKeyword("Kuerbissuppe");
    suchfilter.search();
    ArrayList<Searchresult> results = suchfilter.getSearcher().getSearchResults();
    keytext = results.get(0).getKeyElements().get(0).text();
    assertEquals("Kuerbissuppe", keytext);
    
    // leere Suchergebnisse für den nächsten Test
    suchfilter.getSearcher().emptySearchResults();
    
    // wir suchen nach Stichwort "Geeignet für"
    suchfilter.setKeyword("Geeignet fuer");
    assertEquals("Geeignet fuer", suchfilter.getSearcher().getKeyword());
    suchfilter.search();
    assertNotNull(suchfilter.getSearcher().getSearchResults());
    results = suchfilter.getSearcher().getSearchResults();
    keytext = results.get(0).getKeyElements().get(0).text();
    assertTrue(keytext.contains("Geeignet fuer"));
    
    // leere Suchergebnisse für den nächsten Test
    suchfilter.getSearcher().emptySearchResults();
  }
  
  /*
   * wir suchen nach der ersten Sequenz von "Gibt es", das gibt den ersten h2-tag zurück, den wir assert haben den richtigen Text
   */
  @Test
  public void testSearchFaq() {
    String keytext;
    suchfilter.setKeyword("Gibt es");
    suchfilter.search();
    ArrayList<Searchresult> results = suchfilter.getSearcher().getSearchResults();
    keytext = results.get(0).getKeyElements().get(0).text();
    assertEquals("Gibt es Labortests zur Diagnose der Histaminunvertraeglichkeit?", keytext);
    
    // leere Suchergebnisse für den nächsten Test
    suchfilter.getSearcher().emptySearchResults();
  }
  
  /*
   * Wir suchen nach h3-Tags, die den Text "Lebensmittelliste" enthalten, um zu bestätigen, dass es gefunden wird. Wir zählen auch die gefundenen Tags
    * elterliche Elemente sind ausgewählt, die Anzahl ist 4 TODO fix Suche, so dass Tag allein zurückgegeben wird und nicht auch seine Eltern-Tags
   */
  @Test
  public void testSearchLebensmittel() {
    int countH3Tags;
    suchfilter.setKeyword("Lebensmittelliste");
    suchfilter.search();
    ArrayList<Searchresult> results = suchfilter.getSearcher().getSearchResults();
    countH3Tags = results.get(0).getKeyElements().size();
    assertEquals(4, countH3Tags);
  }
  
  /*
   * wir suchen nach der ersten Sequenz von "Suche nach Lebensmitteln", dies liefert den ersten h3-Tag, den wir assert haben
    * und den richten Text hat
   */
  @Test
  public void testSearchLebensmittelsuche() {
    String keytext;
    suchfilter.setKeyword("Suche nach Lebensmitteln");
    suchfilter.search();
    ArrayList<Searchresult> results = suchfilter.getSearcher().getSearchResults();
    keytext = results.get(0).getKeyElements().get(0).text();
    assertEquals("Suche nach Lebensmitteln", keytext);
    
    // leere Suchergebnisse für den nächsten Test
    suchfilter.getSearcher().emptySearchResults();
  }
  
  /*
   * Wir suchen nach Tags, die den Text "aendern" haben. um zu testen, dass auch Teilfolgen gefunden werden, suchen wir nach ändern es 2 gibt
   */
  @Test
  public void testSearchMahlzeitassistent() {
    int keyCounter;
    String keytext;
    suchfilter.setKeyword("ndern");
    suchfilter.search();
    ArrayList<Searchresult> results = suchfilter.getSearcher().getSearchResults();
    keyCounter = results.get(0).getKeyElements().size();
    keytext = results.get(0).getKeyElements().get(1).text();
    // es gibt 16 Tags, die die Sequenz "aendern" enthalten
    assertEquals(16, keyCounter);
    // irgendwie kann der html nicht "ae" anzeigen, also schneiden wir den ersten Buchstaben von "aedern"
    assertEquals("ndern", keytext.substring(1, keytext.length()));
    
    // leere Suchergebnisse für den nächsten Test
    suchfilter.getSearcher().emptySearchResults();
  }
  
  /*
   * wir suchen nach h3-tag, der den Text "Haeufige Zugriffe" hat und behaupten, dass es nur ein result TODO gibt, um die Suchmaschine zu reparieren
   * Es gibt nur ein Schlüsselelement und nicht 3 zurück
   */
  @Test
  public void testSearchZugriffsskala() {
    int keyCounter;
    String keytext;
    suchfilter.setKeyword("Haeufige Zugriffe");
    suchfilter.search();
    ArrayList<Searchresult> results = suchfilter.getSearcher().getSearchResults();
    keyCounter = results.get(0).getKeyElements().size();
    keytext = results.get(0).getKeyElements().get(0).text();
    // rgendwie enthalten drei Tags ein Schlüsselwort
    assertEquals(3, keyCounter);
    assertEquals("Haeufige Zugriffe", keytext);
    
    // leere Suchergebnisse für den nächsten Test
    suchfilter.getSearcher().emptySearchResults();
  }
}
