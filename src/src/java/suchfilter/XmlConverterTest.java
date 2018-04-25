package suchfilter;


import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;

public class XmlConverterTest {

	XmlConverter converter;
	Document document;
	
	@Before
	public void setUp() throws Exception {
		converter = new XmlConverter();
	}

	/*
	 * tests if html elements in hmtl folder can be converted and asserts that converted
	 * document is not null
	 * TODO add missing html files
	 */
	@Test
	public void testConvert() {
		assertNotNull(converter.convertToXml(new File("src/webapp/html/faq.html")));
		assertNotNull(converter.convertToXml(new File("src/webapp/html/lebensmittelkategorie.html")));
		assertNotNull(converter.convertToXml(new File("src/webapp/html/mahlzeitassistent.html")));
		assertNotNull(converter.convertToXml(new File("src/webapp/html/rezepte.html")));
		assertNotNull(converter.convertToXml(new File("src/webapp/html/suche.html")));
		assertNotNull(converter.convertToXml(new File("src/webapp/html/zugriffsskala.html")));
		
	}
}
