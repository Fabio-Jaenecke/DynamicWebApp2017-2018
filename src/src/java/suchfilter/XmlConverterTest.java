package suchfilter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

/*
 * Konvertiert HTML-Dateien in Dokumente
 * Für jede HTML-Datei ein eigener Test und Test von
 * Eigenschaften im Dokument
 */
public class XmlConverterTest {
  
  XmlConverter converter;
  
  @Before
  public void setUp() throws Exception {
    converter = new XmlConverter();
  }
  
  /*
   * testet, ob HTML-Elemente im HTML-Ordner konvertiert werden können und bestätigt, dass das konvertierte Dokument nicht null ist
   */
  @Test
  public void testFileloading() {
    assertNotNull(new File("src/webapp/html/faq.html"));
    assertNotNull(new File("src/webapp/html/lebensmittelsuche.html"));
    assertNotNull(new File("src/webapp/html/mahlzeitassistent.html"));
    assertNotNull(new File("src/webapp/html/rezepte.html"));
    assertNotNull(new File("src/webapp/html/suche.html"));
    assertNotNull(new File("src/webapp/html/zugriffsskala.html"));
  }
  
  /**
   * testet die Konvertierung der Datei faq.html im HTML-Ordner. Der Body ist nicht null und doc hat den richtigen Titel
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
   * tested convertion von file lebensmittel.html im html-ordner behauptet, dass doc einige daten und einen body hat
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
   * testet Konvertierung der Datei mahlzeit assistant.html im HTML-Ordner bestätigt, dass das Dokument einen Body hat und eine Zeichenkette extrahiert werden kann
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
   * tests Konvertierung von file rezepte.html im html-ordner bestätigt, dass datei outerHtml und einige elemente hat
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
   * testet die Konvertierung der Datei lebensmittel suche.html im html-Ordner, dass doc über einen Body und ein h3-Tag verfuegt
   */
  @Test
  public void testConvertSuche() {
    File file = new File("src/webapp/html/lebensmittelsuche.html");
    Document document = converter.convertToXml(file);
    Element body = document.body();
    Element h3tag = document.getElementsByTag("h3").first();
    assertNotNull(body);
    assertEquals("Suche nach Lebensmitteln", h3tag.text());
  }
  
  /*
   * testet die Konvertierung der Datei zugriffsskala.html im HTML-Ordner bestaetigt, dass der Body nicht null ist und dass das Dokument den richtigen Tabellenzellen-Text hat
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
