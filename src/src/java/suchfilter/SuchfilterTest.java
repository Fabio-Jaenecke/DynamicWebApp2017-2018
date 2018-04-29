package suchfilter;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/*
 * tests the class suchfilter. for simulating the search as real as possible
 * we make a search for every html site with a keyword which is in that 
 * html site
 */
public class SuchfilterTest {

	Suchfilter suchfilter;

	/*
	 * creates suchfilter with keyword. as this is only a setup,
	 * we set the keyword as "Histarantia" which is the title of every html page.
	 */
	@Before
	public void setUp() throws Exception {
		suchfilter = new Suchfilter("Histarantia");
	}

	/*
	 * asserts that html-sites in html folder can be converted to xml-sites
	 */
	@Test
	public void testInitializeXmlSites() {
		assertNotNull(suchfilter.initializeXmlSites());
	}

	/*
	 * tests searching for keyword in rezepte.html
	 * first we search for h2 with text Kuerbissuppe
	 */
	@Test
	public void testSearchFaq() {
		suchfilter.setKeyword("Kuerbissuppe");
		
	}
	
	@Test
	public void testSearchLebensmittel() {
		
	}
	
	@Test
	public void testSearchLebensmittelsuche() {
		
	}
	
	@Test
	public void testSearchMahlzeitassistent() {
		
	}
	
	@Test
	public void testSearchRezepte() {
		
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
