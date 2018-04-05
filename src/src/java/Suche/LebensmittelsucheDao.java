package Suche;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import datenbank.connector.DbConnector;
import java.sql.Connection;

public class LebensmittelsucheDao {
	
	private String selectSQL;
	private Statement statement;
	private ResultSet result; 
	private Connection connection;
    private String gefundeneslebensmittel = null;
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
				return "HANDLECORRECTERRORHERETHISISJUSTANEXAMPLETEXTTHATWONTMATCHINTHEDB";
			}

	}

	/**
	 * @return the selectSQL
	 */
	public String getSelectSQL() {
		return selectSQL;
	}

	/**
	 * @param selectSQL the selectSQL to set
	 */
	public void setSelectSQL(String selectSQL) {
		this.selectSQL = selectSQL;
	}

	/**
	 * @return the gefundeneslebensmittel
	 */
	public String getGefundeneslebensmittel() {
		return gefundeneslebensmittel;
	}
}
	
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
