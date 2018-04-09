package suchfilter;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;

/**
 * converts html files to a document xml file
 * @author Raphael
 *
 */
public class XmlConverter {
	
	private static final Logger LOGGER = Logger.getLogger(XmlConverter.class.getName());
		
	public Document convert(File file){
		try {
			Document doc = Jsoup.parse(file, "UTF-8");
			return doc;
		}
		catch (IOException e) {
			LOGGER.log(Level.SEVERE, "connection could not be closed " + e);
		}
		
		// return empty document
		return new Document("");
	}
}
