package suchfilter;


import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
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
	 */
	@Test
	public void testFileloading() {
		assertNotNull(new File("src/webapp/html/faq.html"));
		assertNotNull(new File("src/webapp/html/lebensmittel.html"));
		assertNotNull(new File("src/webapp/html/mahlzeitassistent.html"));
		assertNotNull(new File("src/webapp/html/rezepte.html"));
		assertNotNull(new File("src/webapp/html/suche.html"));
		assertNotNull(new File("src/webapp/html/zugriffsskala.html"));
		assertNotNull(new File("src/webapp/html/suchfilter.html"));
		
	}
	
	/**
	 * tests convertion of file faq.html in html folder
	 * assigns file to document
	 */
	@Test
	public void testConvertFaq() {
		File file = new File("src/webapp/html/faq.html");
		document = converter.convertToXml(file);
		Element body = document.body();
		String title = document.title();
		assertNotNull(body);
		assertEquals("Histarantia", title);
	}

	/**
	 * tests convertion of file faq.html in html folder
	 * assigns file to document
	 */
	@Test
	public void testConvertLebensmittel() {
		File file = new File("src/webapp/html/lebensmittel.html");
		document = converter.convertToXml(file);
		Element body = document.body();
		String data = document.data();
		assertNotNull(body);
		assertNotNull(data);
	}

	/**
	 * tests convertion of file faq.html in html folder
	 * assigns file to document
	 */
	@Test
	public void testConvertMahlzeitassistent() {
		File file = new File("src/webapp/html/mahlzeitassistent.html");
		document = converter.convertToXml(file);
		Element body = document.body();
		String toString = document.toString();
		assertNotNull(body);
		assertNotNull(toString);
	}

	/**
	 * tests convertion of file faq.html in html folder
	 * assigns file to document
	 */
	@Test
	public void testConvertRezepte() {
		File file = new File("src/webapp/html/rezepte.html");
		document = converter.convertToXml(file);
		String outerHtml = document.outerHtml();
		ArrayList<Element> elements = document.getAllElements();
		assertNotNull(outerHtml);
		assertNotNull(elements);
	}

	/**
	 * tests convertion of file faq.html in html folder
	 * assigns file to document
	 */
	@Test
	public void testConvertSuche() {
		File file = new File("src/webapp/html/suche.html");
		document = converter.convertToXml(file);
		Element body = document.body();
		Element h3tag = document.getElementsByTag("h3").first();
		assertNotNull(body);
		assertEquals("Suche nach Lebensmitteln", h3tag.text());
	}

	/**
	 * tests convertion of file faq.html in html folder
	 * assigns file to document
	 */
	@Test
	public void testConvertSuchfilter() {
		File file = new File("src/webapp/html/suchfilter.html");
		document = converter.convertToXml(file);
		Element body = document.body();
		String title = document.title();
		assertNotNull(body);
		assertEquals("Histarantia", title);
	}
}
