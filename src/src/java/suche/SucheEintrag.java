package suche;

/**
 * Diese Klasse uebergibt die Datenbankabfrage der Datenbank und fuehrt eine Suche
 * mit einem vordefinierten Eintrag durch. Verschiedene Eintragsmethoden werden bereit gestellt.
 *
 * @author Raphael Caradonna und Michele Trebo und Fabio Jaenecke 
 * @version 09.04.2018 
 */
public class SucheEintrag extends SucheSingleTupel {
	
	/**
	 * Erzeuge EintragsSucher. 
	 */
	public SucheEintrag() {
		
	}
	
	/**
	 * Suche nach dem Lebensmittel.  
	 * @param kategorienname
	 * @return die SQL query
	 */
	public String lebensmittelSuche(String lebensmittelname) {
		String selectSQL = "select * from lebensmittelDaten where lower(lname) like '%" + lebensmittelname.toLowerCase() + "%';";
		return selectSQL;
	}
	
}
