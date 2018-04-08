package Suche;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnector;
import datenbank.container.Lebensmitteldaten;
import datenbank.dao.DbQuery;

public class LebensmittelsucheDao2 {

	private Lebensmitteldaten lebensmittel;
	DbQuery query = new DbQuery();
	private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());
	
	public LebensmittelsucheDao2() {
		
	}
	
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

	public Lebensmitteldaten getLebensmittel() {
		return lebensmittel;
	}
}
