package suche;

/**
 * Diese Klasse uebergibt die Datenbankabfrage der Datenbank und fuehrt eine Suche
 * mit einer vordefinierten Tabelle durch und gibt die Lebensmittel in der entsprechenden
 * Tabelle als Liste aus. Es stehen verschiede Methoden fuer Listenausegaben bereit.
 *
 * @author Raphael Caradonna und Michele Trebo und Fabio Jaenecke 
 * @version 09.04.2018 
 */
public class SucheListe extends SucheMultiTupel {

	/**
	 * Erzeuge ListenSucher(). 
	 */
	public SucheListe() {

	}
	
	/**
	 * Suche nach dem Namen der Kategorie und deren zugehoerigen Lebensmitteln.  
	 * @param kategorienname
	 * @return die SQL query
	 */
	public String kategorienSuche(String kategorienname) {
		String selectSQL = "Select * " + " FROM lebensmittelDaten l JOIN KATZUGEHOERIGKEIT k "
				+ "ON l.lindex=k.lindex JOIN lebensmittelkategorie lk on k.kindex = lk.kindex " + "where lower(lk.Kname)= '"
				+ kategorienname.toLowerCase() + "';";
		return selectSQL;
	}
	
	/**
	 * Suche nach dem Namen der Nahrstoffkateogorie und deren zugehoerigen Lebensmitteln.  
	 * @param kategorienname
	 * @return die SQL query
	 */
	public String naehrstoffSuche(String naehrstoffname) {
		String selectSQL = "SELECT * FROM lebensmittelDaten l JOIN NAEHRZUGEHOERIGKEIT n" + 
				" ON l.lindex=n.lindex" + 
				" WHERE n.nname='" + naehrstoffname + "';";
		return selectSQL;
	}
	
	/**
	 * Selektiere Lebensmittel und sortiere eine der Spalten auf- oder absteigend.  
	 * @param eine Spalte, die sortiert werden soll und das praedikat order, welches DESC oder ASC annehmen kann.
	 * @return die SQL query
	 */
	public String spaltenSortierer(String zusortierendeSpalte, String order) {
		String selectSQL = "select * from lebensmittelDaten Order BY " + zusortierendeSpalte + " " + order + ";";	
		return selectSQL;
	}
	
	
	
	
}