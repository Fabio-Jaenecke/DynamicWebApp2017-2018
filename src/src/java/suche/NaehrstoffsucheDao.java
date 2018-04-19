package suche;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.container.LebensmittelDaten;
import datenbank.dao.DbQuery;

/**
 * Diese Klasse uebergibt die Datenbankabfrage der Datenbank und fuehrt eine Suche
 * mit einer vordefinierten Naehrstoffen durch und gibt die Lebensmittel in der entsprechenden
 * Naehrstoffeinteilung aus.
 *
 * @author Fabio Jaenecke 
 * @version 11.04.2018 
 */
public class NaehrstoffsucheDao {

	private ArrayList<LebensmittelDaten> lebensmittel = new ArrayList<>();
	DbQuery query = new DbQuery();
	private static final Logger LOGGER = Logger.getLogger(NaehrstoffsucheDao.class.getName());

	/**
	 * Erzeuge NaehrstoffsucheDao. 
	 */
	public NaehrstoffsucheDao() {

	}

	/**
	 * Suche nach dem Namen der Naehrstoffeinteilung und deren zugehoerigen Lebensmitteln.  
	 * @param kategorienname der Name der gesuchten Kategorie. 
	 */
	public void searchForString(String naehrstoffname) {
		String selectSQL = "SELECT * FROM lebensmittelDaten l JOIN NAEHRZUGEHOERIGKEIT n" + 
				" ON l.lindex=n.lindex" + 
				" WHERE n.nname='" + naehrstoffname + "';";
		try (ResultSet result = query.getResult(selectSQL)){
			while (result.next()) {

				lebensmittel.add(new LebensmittelDaten(result));
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
	 * Liefere die Liste der Lebensmittel der entsprechenden Naehrstoffeinteilung. 
	 * @return lebensmittel 
	 */
	public ArrayList<LebensmittelDaten> getLebensmittel() {
		return lebensmittel;
	}
}