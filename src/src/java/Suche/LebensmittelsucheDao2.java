package Suche;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnector;
import datenbank.container.Lebensmitteldaten;
import datenbank.dao.DbQuery;

/**
 * Diese Klasse uebergibt die Datenbankabfrage zur Datenbank und fuehrt eine Suche
 * mit einem vordefinierten Lebensmitteln durch.
 *
 * @author Raphael Caradonna und Michele Trebo 
 * @version 09.04.2018 
 */
public class LebensmittelsucheDao2 {

	private Lebensmitteldaten lebensmittel;
	DbQuery query = new DbQuery();
	private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());
	
	/**
	 * Erzeuge LebensmittelsucheDao. 
	 */
	public LebensmittelsucheDao2() {
		
	}
	
	/**
	 * Suche nach dem Lebensmittel. 
	 * @param lebensmittelname der Name des Lebensmittel. 
	 */
	public void searchForString(String lebensmittelname) {
		String selectSQL = "select * from lebensmitteldaten where lname like '%" + lebensmittelname + "%';";
		ResultSet result = query.getResult(selectSQL);
		try {
			if(result.isBeforeFirst()) {
				lebensmittel = new Lebensmitteldaten(result);
			}
			else {
				LOGGER.log(Level.SEVERE, "Selected lebensmittel does not exist in database ");
			}
		}
		catch(SQLException e){
			LOGGER.log(Level.SEVERE, "resultSet could not be resolved " + e);
		}
	}
	
	/**
	 * Liefere die Lebensmitteldaten des entsprechenden Lebensmittel. 
	 * @return lebensmittel 
	 */
	public Lebensmitteldaten getLebensmittel() {
		return lebensmittel;
	}
}
