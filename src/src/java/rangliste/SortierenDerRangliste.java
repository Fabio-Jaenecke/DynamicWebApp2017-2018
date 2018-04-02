package rangliste;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import controller.Lebensmittelmanager;
import datenbank.container.Lebensmitteldaten;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	private Lebensmittelmanager lebensmittelmanager = new Lebensmittelmanager();
	private ArrayList<String> lebensmittelnamenliste;

	/**
	 * Erstellt ein Objekt mit einer Lebensmittelliste -
	 */
	public SortierenDerRangliste() {
		lebensmittelnamenliste = new ArrayList<>(); 
		
	}	
	
	public void alleLebensmittelNamenGeben() {
		for (Lebensmitteldaten derLebensmittelName : lebensmittelmanager.lebensmittel) {
			    lebensmittelnamenliste.add(derLebensmittelName.getLname());
		}
	}
	
	public void alleLebensmittelNamenZurueckSchreiben() {
		for (String derLebensmittelName : lebensmittelnamenliste) {
			// TODO initialize rs as local variable 
			//lebensmittelmanager.lebensmittelHinzufuegen(new Lebensmitteldaten(rs));
		}
	}
	
	/**
	 *  Diese Methode sortiert die Lebensmittel Aufsteigend (A-Z).
	 */
	public void sortiereAufsteigend() {
		alleLebensmittelNamenGeben();
		Collections.sort(lebensmittelnamenliste);
		//zurück in den Lebensmittelmanager schreiben:
		alleLebensmittelNamenZurueckSchreiben();
	}
	
	/**
	 *  Diese Methode sortiert die Lebensmittel Absteigend (Z-A).
	 */
	public void sortiereAbsteigend() {
		alleLebensmittelNamenGeben();
		Collections.sort(lebensmittelnamenliste, Collections.reverseOrder());
		//zurück in den Lebensmittelmanager schreiben:
		alleLebensmittelNamenZurueckSchreiben();
		
	}
}

//TODO: 'rs' - Fehler beheben. @caradrap
