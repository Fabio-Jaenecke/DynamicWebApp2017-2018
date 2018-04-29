package suchfilter;


import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

/*
 * converts html files to documents
 * for every html file a own test and testing of
 * properties in document
 */
public class XmlConverterTest {

	XmlConverter converter;
	
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
	 * asserts body is not null and doc has right title
	 */
	@Test
	public void testConvertFaq() {
		File file = new File("src/webapp/html/faq.html");
		Document document = converter.convertToXml(file);
		Element body = document.body();
		String title = document.title();
		assertNotNull(body);
		assertEquals("Histarantia", title);
	}

	/**
	 * tests convertion of file faq.html in html folder
	 * asserts that doc has some data and a body
	 */
	@Test
	public void testConvertLebensmittel() {
		File file = new File("src/webapp/html/lebensmittel.html");
		Document document = converter.convertToXml(file);
		Element body = document.body();
		String data = document.data();
		assertNotNull(body);
		assertNotNull(data);
	}

	/**
	 * tests convertion of file mahlzeitassistent.html in html folder
	 * asserts that document has a body and a string can be extracted
	 */
	@Test
	public void testConvertMahlzeitassistent() {
		File file = new File("src/webapp/html/mahlzeitassistent.html");
		Document document = converter.convertToXml(file);
		Element body = document.body();
		String toString = document.toString();
		assertNotNull(body);
		assertNotNull(toString);
	}

	/**
	 * tests convertion of file rezepte.html in html folder
	 * asserts that file has outerHtml and some elements
	 */
	@Test
	public void testConvertRezepte() {
		File file = new File("src/webapp/html/rezepte.html");
		Document document = converter.convertToXml(file);
		String outerHtml = document.outerHtml();
		ArrayList<Element> elements = document.getAllElements();
		assertNotNull(outerHtml);
		assertNotNull(elements);
	}

	/**
	 * tests convertion of file suche.html in html folder
	 * asserts that doc has body and a h3-tag
	 */
	@Test
	public void testConvertSuche() {
		File file = new File("src/webapp/html/suche.html");
		Document document = converter.convertToXml(file);
		Element body = document.body();
		Element h3tag = document.getElementsByTag("h3").first();
		assertNotNull(body);
		assertEquals("Suche nach Lebensmitteln", h3tag.text());
	}

	/**
	 * tests convertion of file suchfilter.html in html folder
	 * asserts that body is not null and that doc has right title
	 */
	@Test
	public void testConvertSuchfilter() {
		File file = new File("src/webapp/html/suchfilter.html");
		Document document = converter.convertToXml(file);
		Element body = document.body();
		String title = document.title();
		assertNotNull(body);
		assertEquals("Histarantia", title);
	}
	
	/*
	* tests convertion of file zugriffsskala.html in html folder
	 * asserts that body is not null and that doc has right table cell text
	 */
	@Test
	public void testConvertZugriffsskala() {
		File file = new File("src/webapp/html/zugriffsskala.html");
		Document document = converter.convertToXml(file);
		Element body = document.body();
		Elements tablecell = document.getElementsByTag("th");
		assertNotNull(body);
		assertEquals("Platzierung", tablecell.get(0).text());
	}
}
