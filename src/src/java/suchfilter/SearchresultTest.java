package suchfilter;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.nodes.Document;

/*
 * tests if search results for a keyword are correctly saved
 * for matching criterias of searchEngine a mockup-html is used
 */
public class SearchresultTest {
  
  ArrayList<Searchresult> result = new ArrayList<>();
  SearchEngine searcher = new SearchEngine("Lorem ipsum");
  
  /*
   * creates a document from html file, makes search for keyword in searchEngine and add results to engine
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
   * tests if array of xmlSites in search result is correctly handled. as only one html-site is searched through, array only
   * contains one document
   */
  @Test
  public void testGetXmlSite() {
    assertNotNull(result.get(0).getXmlSite());
  }
  
  /*
   * tests if array of keyElements in search result is correctly handled.
   */
  @Test
  public void testGetKeyElements() {
    assertNotNull(result.get(0).getKeyElements());
  }
  
}
