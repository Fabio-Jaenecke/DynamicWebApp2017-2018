package suchfilter;

import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Searchresult {
	
	private Document xmlSite;
	private ArrayList<Element> keyElements = new ArrayList<>();
	
	public Searchresult(Document document, ArrayList<Element> results) {
		this.xmlSite = document;
		this.keyElements = results;
	}
	
	public Document getXmlSite() {
		return xmlSite;
	}

	public ArrayList<Element> getKeyElements() {
		return keyElements;
	}
	
}
