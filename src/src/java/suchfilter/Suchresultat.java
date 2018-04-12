package suchfilter;

import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Suchresultat {
	
	private Document xmlSite;
	private ArrayList<Element> keyElements = new ArrayList<>();
	private String url;
	private ArrayList<Vorschau> resultate;
	
	public Suchresultat(Document document, ArrayList<Element> results) {
		this.xmlSite = document;
		this.keyElements = results;
	}
	
	/*
	 * suche den zugehörigen Link und einen kleinen Metatext für die gefundene Stelle heraus
	 */
	public void darstellen() {
		url = "test.de";
	}

	public void getErsteZweiElemente() {
		resultate.add(new Vorschau(keyElements.get(0)));
		resultate.add(new Vorschau(keyElements.get(1)));
	}
	
	public ArrayList<Vorschau> getResultate() {
		return resultate;
	}

	public Document getXmlSite() {
		return xmlSite;
	}

	public ArrayList<Element> getKeyElements() {
		return keyElements;
	}
	
}
