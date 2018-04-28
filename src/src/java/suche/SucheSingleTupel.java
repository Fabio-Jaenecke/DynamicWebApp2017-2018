package suche;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import datenbank.container.LebensmittelDaten;
import datenbank.dao.DbQuery;

public abstract class SucheSingleTupel implements SucheInterface {
	private LebensmittelDaten lebensmittel;
	DbQuery query = new DbQuery();
	private static final Logger LOGGER = Logger.getLogger(SucheSingleTupel.class.getName());

	
	public void fuehreDatenAbfrageAus(String tupelName) {
		searchForString(tupelName);
	}
	
    public void erhalteDaten() {
    	getLebensmittel();
    } 
    
    public void loescheDaten() {
    	//Daten werden auf Lebenszeit der Variable automatisch geloescht
    }
    
    /**
	 * Suche nach dem Lebensmittel. 
	 * @param lebensmittelname der Name des Lebensmittels. 
	 */
	public void searchForString(String selectSQL) {
		try (ResultSet result = query.getResult(selectSQL)){
			if(result.next()) {
				lebensmittel = new LebensmittelDaten(result);
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
	 * Liefere die lebensmittelDaten des entsprechenden Lebensmittels. 
	 * @return lebensmittel 
	 */
	public LebensmittelDaten getLebensmittel() {
		return lebensmittel;
	}
}
