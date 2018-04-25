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
 * downloads html files and converts them to a document xml file
 */
public class XmlConverter {
	
	private static final Logger LOGGER = Logger.getLogger(XmlConverter.class.getName());
	
	/*
	 * downloads html file for a given input. converts it to xml and returns it.
	 */
	public Document convertHtmlToXml(String filename) {
		File download = downloadHtmlFiles(filename);
		return convertToXml(download);
	}
	
	/**
	 * This method downloads the HTML files from the TomCat server Source:
	 * https://kodejava.org/how-do-i-copy-a-url-into-a-file/
	 */
	public File downloadHtmlFiles(String htmlFile) {
		File destination = new File("");
		try {
			URL url = new URL("http://localhost:8080/" + SuchfilterServlet.getContextPath() + "/html/" + htmlFile);
			destination = new File(htmlFile);
			
			// Copy bytes from the URL to the destination file.
			FileUtils.copyURLToFile(url, destination);
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "the file " + htmlFile + " could not be downloaded from the server" + e);
		}
		return destination;
	}
	
	/*
	 * converts html file to xml document
	 */
	public Document convertToXml(File file){
		try {
			Document doc = Jsoup.parse(file, "utf-8");
			return doc;
		}
		catch (IOException e) {
			LOGGER.log(Level.SEVERE, "the file " + file.getName() + " could not be converted to xml" + e);
		}
		
		return new Document("");
	}
}