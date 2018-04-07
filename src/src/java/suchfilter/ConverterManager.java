package suchfilter;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;

public class ConverterManager {

	XmlConverter converter = new XmlConverter();
	ArrayList<Document> xmlSites = new ArrayList<>();
	
	public ConverterManager() {
		convertSitesToXml();
	}

	/*
	 * convert all html sites to xml sites
	 * TODO add other html sites
	 */
	private void convertSitesToXml() {
		File file = new File("src/webapp/html/lebensmittelkategorie.html");	
		xmlSites.add(converter.convert(file));
	}
}
