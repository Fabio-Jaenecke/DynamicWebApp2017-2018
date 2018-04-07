package suchfilter;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;

/**
 * converts html files to a document xml file
 * @author Raphael
 *
 */
public class Suchfilter {
	
	public void convert(){
		File file;
		try {
			file = new File("src/webapp/html/lebensmittelkategorie.html");
			Document doc = Jsoup.parse(file, "UTF-8");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String [] args) {
		Suchfilter suche = new Suchfilter();
		suche.convert();
	}
}
