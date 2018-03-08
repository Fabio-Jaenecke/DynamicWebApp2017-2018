package aufAbSortierung;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class AufAbSortierung {
	private List<String> lebensmittel;

	/**
	 * Erstellt ein Objekt mit einer Lebensmittelliste
	 */
	public AufAbSortierung() {
		lebensmittel = new ArrayList<>();
	}	
	
	/**
	 * Befüllt eine ArrayList mit Lebensmittelnamen
	 */
	public void befülleSortierungMitLebensmitteln() {
		lebensmittel.add("Birnen");
		lebensmittel.add("Kirschen");
		lebensmittel.add("Ananas");	
	}
	
	/**
	 *  Diese Methode sortiert die Lebensmittel in der Arraylist Aufsteigend (A-Z).
	 */
	public void sortiereAufsteigend() {
		Collections.sort(lebensmittel);
	}
	
	/**
	 *  Diese Methode sortiert die Lebensmittel in der Arraylist Absteigend (Z-A).
	 */
	public void sortiereAbsteigend() {
		Collections.sort(lebensmittel, Collections.reverseOrder());
	}
	
	/**
	 * Gibt die Lebensmittel der Liste aus.
	 */
	public void erhalteLebensmittelNamen() {
		for (String name : lebensmittel) {
		    System.out.println(name);
		    }
	}
	
	/**
	 * Testet die Anwendung
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		AufAbSortierung sortierung = new AufAbSortierung();
		sortierung.befülleSortierungMitLebensmitteln();
		//Sollte Lebensmittel unsortiert ausgeben:
		System.out.println("Unsortiert:");
		sortierung.erhalteLebensmittelNamen();
		//Sollte Lebensmittel sortiert ausgeben:
		System.out.println("Sortiert A-Z:");
		sortierung.sortiereAufsteigend();
		sortierung.erhalteLebensmittelNamen();
		System.out.println("Sortiert Z-A:");
		sortierung.sortiereAbsteigend();
		sortierung.erhalteLebensmittelNamen();
	}

}
