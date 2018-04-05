//TODO: Follow clean-code guidelines and use the Suche Interface
package Suche;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import datenbank.connector.DbConnector;
import java.sql.Connection;

/** Diese Klasse übergibt die Datenbankabfrage zur Datenbank und führt eine Suche
 * mit einem vordefinierten Lebensmitteln durch.
 * 
 * @author fabio jaenecke
 *
 */
public class LebensmittelsucheDao {
	
	private String selectSQL;
	private Statement statement;
	private ResultSet result; 
	private Connection connection;
    private String gefundeneslebensmittel = null;
    private String karenzphase;
    private String dauerernaehrung;
	private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());

	
	public LebensmittelsucheDao(String lebensmittelname) {
		selectSQL = "select * from lebensmitteldaten where lname like '%" + lebensmittelname + "%';";
		DbConnector conn = new DbConnector();
		connection = conn.getConn();
		try {
			statement = connection.createStatement();
			result = statement.executeQuery(selectSQL);
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Query could not be established " + e);
		}
	}
	
	/** Sucht nach lebensmittelnamen im ResultSet und gibt zutreffende Lebensmittelnamen zurück.
	 * @return den gefundenen Lebensmittelnamen
	 */
	public String suche() {
		    boolean gefunden = false;
			try {
				  while (result.next()) {
					gefundeneslebensmittel = result.getString("lname");     
			        karenzphase = result.getString("karenzphase");
			        dauerernaehrung = result.getString("dauerernaehrung");
				    gefunden = true;
				  }

			  } catch (SQLException e1) {
			    e1.printStackTrace();
			  } finally {
				//TODO: Handle exceptions
			  }
			if (gefunden) {
				return gefundeneslebensmittel;
			}else{
				//TODO: Find proper return statement incase the lebensmittel is not found
				return "ExampleStringBecauseLebensmittelWasNotFound";
			}

	}

	/**
	 * @return the selectSQL
	 */
	public String getSelectSQL() {
		return selectSQL;
	}

	/**
	 * @return the gefundeneslebensmittel
	 */
	public String getGefundeneslebensmittel() {
		return gefundeneslebensmittel;
	}

	/**
	 * @return the karenzphase
	 */
	public String getKarenzphase() {
		return karenzphase;
	}

	/**
	 * @return the dauerernaehrung
	 */
	public String getDauerernaehrung() {
		return dauerernaehrung;
	}
}

//TODO: Delete redundant code:
	
/*	DbQuery query;
	private List<Lebensmitteldaten> lebensmitteldaten;
	
	public LebensmittelsucheDao() {
		query = new DbQuery();
		
	}
		
//	TODO: replace query with prepared statements
	public Lebensmitteldaten getLebensmittel(String lebensmittelname) {
		String query = "select * from lebensmitteldaten where lname = '" + lebensmittelname + "'";
		 ResultSet rs = this.query.getResult(query);
		 Lebensmitteldaten lebensmitteldaten = null;
		try {
			lebensmitteldaten = rs.getObject(0) == null ? null : (Lebensmitteldaten) rs.getObject(0);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return lebensmitteldaten;
	}

//	TODO: replace query with prepared statements
	public List<Lebensmitteldaten> getKategorie(String kategorie) {
		String query = "select * from lebensmitteldaten where kategorie = " + kategorie;
		 ResultSet rs = this.query.getResult(query);
		 lebensmitteldaten = null;
		try {
				lebensmitteldaten.add(new Lebensmitteldaten(rs));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return lebensmitteldaten;
	}

	/**
	 * @return the lebensmitteldaten
	 */
	/*public List<Lebensmitteldaten> getLebensmitteldaten() {
		return lebensmitteldaten;
	}

	/**
	 * @param lebensmitteldaten the lebensmitteldaten to set
	 */
	/*public void setLebensmitteldaten(List<Lebensmitteldaten> lebensmitteldaten) {
		this.lebensmitteldaten = lebensmitteldaten;
	}
	
	
}*/
