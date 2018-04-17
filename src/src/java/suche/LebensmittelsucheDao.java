package suche;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnector;
import datenbank.container.Lebensmitteldaten;
import datenbank.dao.DbQuery;  

/**
 * Diese Klasse uebergibt die Datenbankabfrage der Datenbank und fuehrt eine Suche
 * mit einem vordefinierten Lebensmitteln durch.
 *
 * @author Raphael Caradonna und Michele Trebo und Fabio Jaenecke 
 * @version 09.04.2018 
 */
public class LebensmittelsucheDao {

	private Lebensmitteldaten lebensmittel;
	DbQuery query = new DbQuery();
	private static final Logger LOGGER = Logger.getLogger(LebensmittelsucheDao.class.getName());
	
	/**
	 * Erzeuge LebensmittelsucheDao. 
	 */
	public LebensmittelsucheDao() {
		
	}
	
	/**
	 * Suche nach dem Lebensmittel. 
	 * @param lebensmittelname der Name des Lebensmittels. 
	 */
	public void searchForString(String lebensmittelname) {
		String selectSQL = "select * from lebensmitteldaten where lower(lname) like '%" + lebensmittelname.toLowerCase() + "%';";
		ResultSet result = query.getResult(selectSQL);
		try {
			if(result.next()) {
				lebensmittel = new Lebensmitteldaten(result);
			}
			else {
				lebensmittel = null;
				LOGGER.log(Level.WARNING, "Selected lebensmittel does not exist in database ");
			}
		}
		catch(SQLException e){
			LOGGER.log(Level.SEVERE, "resultSet could not be resolved " + e);
		}
	}
	
	/**
	 * Liefere die Lebensmitteldaten des entsprechenden Lebensmittels. 
	 * @return lebensmittel 
	 */
	public Lebensmitteldaten getLebensmittel() {
		return lebensmittel;
	}
}
