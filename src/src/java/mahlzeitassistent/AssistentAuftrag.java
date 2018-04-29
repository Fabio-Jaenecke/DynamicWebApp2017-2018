/**
 * 
 */
package mahlzeitassistent;

import java.util.ArrayList;
import datenbank.container.LebensmittelDaten;
import suche.SucheListe;

/**
 * Führt einen Mahlzeitassistentauftrag durch und gibt Auftragsdaten aus.
 * 
 * @author fabio jaenecke
 *
 */
public class AssistentAuftrag {
	private String dropDownAuswahl;
	private String dbResultString;
	private String auftragsArt;
	private SucheListe auftrag;
	private ArrayList<LebensmittelDaten> auftragsDaten;
	
	
	/**
	 * @param auswahl eine Auswahl eines Dropdowns
	 * @param auftragsArt bestimmt, ob die Auftragsart von einem KategorienDropdown oder einem Naehrstoffdropdown stammt.
	 */
	public AssistentAuftrag(String auswahl, String auftragsArt) {
		this.auftragsArt = auftragsArt;
		this.dropDownAuswahl = auswahl;
		auftrag();
	}
	
	public void auftrag() {
		auftrag = new SucheListe();
		if (auftragsArt.equals("kategorieauswahl"))
			dbResultString = auftrag.kategorienSuche(dropDownAuswahl);
		if (auftragsArt.equals("naehrstoffauswahl")) {
			dbResultString = auftrag.naehrstoffSuche(dropDownAuswahl);
		}
		auftrag.searchForString(dbResultString);
		auftragsDaten = auftrag.getLebensmittel();
	}

	public ArrayList<LebensmittelDaten> getDaten() {
		return auftragsDaten;
	}

	/**
	 * @return the kategorienname
	 */
	public String getKategorienname() {
		return dropDownAuswahl;
	}
	
	/**
	 * Leere die auftragsdaten. 
	 */
	public void clearAuftragsDaten() {
		auftragsDaten.clear();
	}
	
	
}
