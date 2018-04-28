package suchfilter;



import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/*
 * tests the class Suchfilter. converts html-sites to xml-sites and searches for keyword
 */
public class SuchfilterTest {

	Suchfilter suchfilter;
	
	/*
	 * creates suchfilter with keyword. for receiving at least one result, 
	 * we choose "Rezepte" as keyword which is text of a heading h2 in rezepte.html
	 */
	@Before
	public void setUp() throws Exception {
		suchfilter = new Suchfilter("Rezepte");
	}

	/*
	 * asserts that html-sites in html folder can be converted to xml-sites
	 */
	@Test
	public void testInitializeXmlSites() {
		assertNotNull(suchfilter.initializeXmlSites());
	}
	
	/*
	 * tests searching through all xml-sites for keyword "Rezepte"
	 */
	@Test
	public void testSearch() {
		suchfilter.search();
		assertNotNull(suchfilter.getSearcher().getSearchResults());
	}
}
