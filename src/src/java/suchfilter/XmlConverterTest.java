package suchfilter;

import static org.junit.Assert.*;

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

	@Test
	public void testConvert() {
		assertNotNull(converter.convert(new File("src/webapp/html/faq.html")));
	}
	
	@Test
	public void testDocument() {
		assertNotNull(document.text());
		assertNotNull(document.val());
	}

}
