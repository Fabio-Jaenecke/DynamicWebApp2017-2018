package suchfilter;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import controller.servlets.SuchfilterServlet;

/**
 * lädt HTML-Dateien herunter und konvertiert sie in eine XML-Dokumentdatei
 */
public class XmlConverter {
  
  private static final Logger LOGGER = Logger.getLogger(XmlConverter.class.getName());
  
  /*
   * lädt eine HTML-Datei für eine bestimmte Eingabe herunter. wandelt es in XML um und gibt es zurück.
   */
  public Document convertHtmlToXml(String filename) {
    File download = downloadHtmlFiles(filename);
    return convertToXml(download);
  }
  
  /**
   * Diese Methode lädt die HTML-Dateien vom TomCat-Server herunter
   * Quelle: https://kodejava.org/how-do-i-copy-a-url-into-a-file/
   */
  public File downloadHtmlFiles(String htmlFile) {
    File destination = new File("");
    try {
      URL url = new URL("http://localhost:8080/" + SuchfilterServlet.getContextPath() + "/html/" + htmlFile);
      destination = new File(htmlFile);
      
      // Kopiert Bytes von der URL in die Zieldatei.
      FileUtils.copyURLToFile(url, destination);
    } catch (IOException e) {
      LOGGER.log(Level.SEVERE, "the file " + htmlFile + " could not be downloaded from the server" + e);
    }
    return destination;
  }
  
  /*
   * konvertiert HTML-Datei in XML-Dokument
   */
  public Document convertToXml(File file) {
    try {
      Document doc = Jsoup.parse(file, "utf-8");
      return doc;
    } catch (IOException e) {
      LOGGER.log(Level.SEVERE, "the file " + file.getName() + " could not be converted to xml" + e);
    }
    
    return new Document("");
  }
}
