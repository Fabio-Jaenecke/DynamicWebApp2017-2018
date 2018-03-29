package rangliste;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Diese Klasse implementiert die Funktion F2100 - Sortieren der Rangliste in Lebensmittelkategorie.
 * Die Vertraeglichkeit ist in drei Kategorien unterteilt. Gut, mittelmaessig und schlecht vertraeglich, 
 * welche auf- und absteigend sortiert werden koennen. Die Sortierung kann entweder für die Karenzphase 
 * oder für die Dauerernaehrung gemacht werden. 
 *
 * @author fabio jaenecke
 *
 */
public class SortierenDerRangliste {
	private List<String> lebensmittel;

	/**
	 * Erstellt ein Objekt mit einer Lebensmittelliste -
	 */
	public SortierenDerRangliste() {
		lebensmittel = new ArrayList<>();
	}	
	
	public List<String> getLebensmittel() {
		return lebensmittel;
	}

	public void setLebensmittel(List<String> lebensmittel) {
		this.lebensmittel = lebensmittel;
	}

	/**
	 * Befüllt eine ArrayList mit Lebensmittelnamen
	 */
	public void befuelleSortierungMitLebensmitteln() {
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
	 * Testet die Anwendung. Dieser Teil des Codes sollte noch entfernt werden.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SortierenDerRangliste sortierung = new SortierenDerRangliste();
		sortierung.befuelleSortierungMitLebensmitteln();
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
