package suchfilter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/*
 * tests the class suchfilter. for simulating the search as real as possible
 * we make a search for every html site with a keyword which is in that
 * html site
 */
public class SuchfilterTest {
  
  SuchfilterStub suchfilter;
  
  /*
   * creates suchfilter with keyword. as this is only a setup, we set the keyword as "Histarantia" which is the title of every html
   * page.
   */
  @Before
  public void setUp() throws Exception {
    suchfilter = new SuchfilterStub("Histarantia");
  }
  
  /*
   * asserts that html-sites in html folder can be converted to xml-sites
   */
  @Test
  public void testInitializeXmlSites() {
    assertNotNull(suchfilter.initializeXmlSites());
  }
  
  /*
   * tests searching for keyword in rezepte.html first we search for h2 with text Kuerbissuppe then we check if text for rezepte
   * contains the sequence "Geeignet fuer"
   */
  @Test
  public void testSearchRezepte() {
    String keytext;
    
    // we search for keyword "Kuerbissuppe"
    suchfilter.setKeyword("Kuerbissuppe");
    suchfilter.search();
    ArrayList<Searchresult> results = suchfilter.getSearcher().getSearchResults();
    keytext = results.get(0).getKeyElements().get(0).text();
    assertEquals("Kuerbissuppe", keytext);
    
    // empty search results for next test
    suchfilter.getSearcher().emptySearchResults();
    
    // we search for keyword "Geeignet fuer"
    suchfilter.setKeyword("Geeignet fuer");
    assertEquals("Geeignet fuer", suchfilter.getSearcher().getKeyword());
    suchfilter.search();
    assertNotNull(suchfilter.getSearcher().getSearchResults());
    results = suchfilter.getSearcher().getSearchResults();
    keytext = results.get(0).getKeyElements().get(0).text();
    assertTrue(keytext.contains("Geeignet fuer"));
    
    // empty search results for next test
    suchfilter.getSearcher().emptySearchResults();
  }
  
  /*
   * we search for the first sequence of "Gibt es", this returns the first h2-tag, which we asserrt has the right text
   */
  @Test
  public void testSearchFaq() {
    String keytext;
    suchfilter.setKeyword("Gibt es");
    suchfilter.search();
    ArrayList<Searchresult> results = suchfilter.getSearcher().getSearchResults();
    keytext = results.get(0).getKeyElements().get(0).text();
    assertEquals("Gibt es Labortests zur Diagnose der Histaminunvertraeglichkeit?", keytext);
    
    // empty search results for next test
    suchfilter.getSearcher().emptySearchResults();
  }
  
  /*
   * we search for h3 tag which contains text "Lebensmittelliste to assert that it is found we count the tags found because also
   * parent elements are chosen the count is 4 TODO fix search so that tag alone is returned and not also its parent tags
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
  
  @Test
  public void testSearchLebensmittelsuche() {
    
  }
  
  @Test
  public void testSearchMahlzeitassistent() {
    
  }
  
  @Test
  public void testSearchSuche() {
    
  }
  
  @Test
  public void testSearchSuchfilter() {
    
  }
  
  @Test
  public void testSearchZugriffsskala() {
    
  }
}
