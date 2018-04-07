package suchfilter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.jsoup.Jsoup;
import org.w3c.dom.Document;

public class Suchfilter {
	
	public void convert(){
		File file = new File("../../webapp/html/lebensmittelkategorie.jsp");
		String html = "<html><head><title>First parse</title></head>"
				  + "<body><p>Parsed HTML into a doc.</p></body></html>";
		try {
			Document doc = (Document) Jsoup.parse(file, "UTF-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getXHTMLFromHTML(String inputFile,
            String outputFile) throws Exception {

        File file = new File(inputFile);
        FileOutputStream fos = null;
        InputStream is = null;
        try {
            fos = new FileOutputStream(outputFile);
            is = new FileInputStream(file);
            Tidy tidy = new Tidy(); 
            tidy.setXHTML(true); 
            tidy.parse(is, fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    fos = null;
                }
                fos = null;
            }
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    is = null;
                }
                is = null;
            }
        }

        return outputFile;
    }
}
