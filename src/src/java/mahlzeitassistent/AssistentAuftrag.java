/**
 * 
 */
package mahlzeitassistent;

import java.util.ArrayList;
import datenbank.container.LebensmittelDaten;
import suche.SucheListe;

/**
 * Führt einen Mahlzeitassistentauftrag in der Kategoriensuche durch und gibt Auftragsdaten aus.
 * 
 * @author fabio jaenecke
 *
 */
public class AssistentAuftrag {
	private String kategorieName;
	private String suche;
	private SucheListe kategorieauftrag;
	private ArrayList<LebensmittelDaten> auftragsDaten;
	/**
	 * 
	 */
	public AssistentAuftrag(String kategorienname) {
		kategorieauftrag = new SucheListe();
		this.kategorieName = kategorienname;
		auftrag();
	}
	
	public void auftrag() {
		suche = kategorieauftrag.kategorienSuche(kategorieName);
		auftragsDaten = (kategorieauftrag.getLebensmittel());
		kategorieauftrag.searchForString(suche);
	}

	public ArrayList<LebensmittelDaten> getDaten() {
		return auftragsDaten;
	}

	/**
	 * @return the kategorienname
	 */
	public String getKategorienname() {
		return kategorieName;
	}
	
	
}
