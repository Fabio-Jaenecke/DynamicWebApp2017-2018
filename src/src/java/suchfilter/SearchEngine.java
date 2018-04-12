package suchfilter;

import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/*
 * durchsucht eine List von Xml-Seiten nach einem bestimmten Begriff
 * über Überschriften, Paragraphen, Listenelemente und Buttons
 * speichert die Suchresultate in einer ArrayList ab
 */
public class SearchEngine {

	private ArrayList<Document> xmlSites = new ArrayList<>();
	private String keyWord;
	private ArrayList<Suchresultat> suchresultate;

	/*
	 * eine ArrayList von xml-Seiten und das Suchwort werden übergeben
	 */
	public SearchEngine(ArrayList<Document> xmlSites, String keyword) {
		this.xmlSites = xmlSites;
		this.keyWord = keyWord;
	}
	
	/*
	 * sucht für jede Seite in xmlSites nach Überschriften, Paragraphen, 
	 * Listenelementen und Buttons. werden Suchresultate gefunden, werden diese abgespeichert
	 */
	public void sucheNachText() {
		for(Document document: xmlSites) {
			ArrayList<Element> results = new ArrayList<>();
			results.addAll(sucheNachUeberschriften(document));
			results.addAll(sucheNachParagraphen(document));
			results.addAll(sucheNachListenelementen(document));
			results.addAll(sucheNachButtons(document));
			if(!results.isEmpty()) {
				suchresultate.add(new Suchresultat(document, results));
			}
		}
	}


	/*
	 * suche aus jedem Element alle Überschriften raus, schaue, ob sie gesuchtem
	 * Begriff entsprechen, wenn ja, füge zu Liste von Elementen hinzu
	 */
	public ArrayList<Element> sucheNachUeberschriften(Document site) {
		ArrayList<Element> results = new ArrayList<>();
		
		results.addAll(searchForTag(site, "h1"));
		results.addAll(searchForTag(site, "h2"));
		results.addAll(searchForTag(site, "h3"));
		results.addAll(searchForTag(site, "h4"));
		
		return results;

	}

	/*
	 * sucht aus jedem Element alle Überschriften raus, schaut, ob sie gesuchtem
	 * Begriff entsprechen, wenn ja, füge zu Liste von Elementen hinzu
	 */
	public ArrayList<Element> sucheNachParagraphen(Document site) {
		ArrayList<Element> results = new ArrayList<>();
		results.addAll(searchForTag(site, "p"));
		return results;
	}
	
	/*
	 * sucht aus jedem Element alle Überschriften raus, schaut, ob sie gesuchtem
	 * Begriff entsprechen, wenn ja, füge zu Liste von Elementen hinzu
	 */
	public ArrayList<Element> sucheNachListenelementen(Document site) {
		ArrayList<Element> results = new ArrayList<>();
		results.addAll(searchForTag(site, "li"));
		return results;

	}

	/*
	 * sucht aus jedem Element alle Überschriften raus, schaut, ob sie gesuchtem
	 * Begriff entsprechen, wenn ja, füge zu Liste von Elementen hinzu
	 */
	public ArrayList<Element> sucheNachButtons(Document site) {
		ArrayList<Element> results = new ArrayList<>();
		results.addAll(searchForTag(site, "button"));
		return results;
	}

	/*
	 * durchsucht eine Seite nach einem bestimmten Tag und gibt diese zurück
	 */
	public ArrayList<Element> searchForTag(Document site, String tag) {
		ArrayList<Element> results = new ArrayList<>();
		for (Element result : site.getElementsByTag(tag)) {
			if (result.text().equals(keyWord)) {
				results.add(result);
			}
		}

		return results;
	}

	public ArrayList<Vorschau> getSuchresultate(){
		ArrayList<Vorschau> vorschauen = new ArrayList<>();
		for(Suchresultat resultat: suchresultate) {
			resultat.getErsteZweiElemente();
			vorschauen.addAll(resultat.getResultate());
		}
		return vorschauen;
	}
}
