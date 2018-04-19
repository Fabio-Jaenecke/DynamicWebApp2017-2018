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
	 * TODO add other html files
	 */
	@Test
	public void testConvert() {
		assertNotNull(converter.convert(new File("src/webapp/html/faq.html")));
	}
}
