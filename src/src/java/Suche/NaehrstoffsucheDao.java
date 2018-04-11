package Suche;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnector;
import datenbank.container.Lebensmitteldaten;
import datenbank.dao.DbQuery;

/**
 * Diese Klasse uebergibt die Datenbankabfrage der Datenbank und fuehrt eine Suche
 * mit einer vordefinierten Kategorie durch und gibt die Lebensmittel in der entsprechenden
 * Kategorie aus.
 *
 * @author Raphael Caradonna und Michele Trebo und Fabio Jaenecke 
 * @version 11.04.2018 
 */
public class NaehrstoffsucheDao {

	private ArrayList<Lebensmitteldaten> lebensmittel = new ArrayList<>();
	DbQuery query = new DbQuery();
	DbConnector conn = new DbConnector();
	private static final Logger LOGGER = Logger.getLogger(NaehrstoffsucheDao.class.getName());

	/**
	 * Erzeuge KategoriensucheDao. 
	 */
	public NaehrstoffsucheDao() {

	}

	/**
	 * Suche nach dem Namen der Kategorie und deren zugehoerigen Lebensmitteln.  
	 * @param kategorienname der Name der gesuchten Kategorie. 
	 */
	public void searchForString(String kategorienname) {
		String selectSQL = "SELECT * FROM LEBENSMITTELDATEN l JOIN NAEHRZUGEHOERIGKEIT n" + 
				" ON l.lindex=n.lindex JOIN NAEHRSTOFF ns ON ns.nname = n.nname" + 
				" WHERE n.nname= 'Proteine';";
		try {
			ResultSet result = query.getResult(selectSQL);
			while (result.next()) {

				lebensmittel.add(new Lebensmitteldaten(result));
			}
		} 
		catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "resultSet could not be resolved " + e);
		}
	}

	/**
	 * Leere die Lebensmittel. 
	 */
	public void clearLebensmittel() {
		lebensmittel.clear();
	}

	/**
	 * Liefere die Liste der Lebensmittel der entsprechenden Kategorie. 
	 * @return lebensmittel 
	 */
	public ArrayList<Lebensmitteldaten> getLebensmittel() {
		return lebensmittel;
	}
}