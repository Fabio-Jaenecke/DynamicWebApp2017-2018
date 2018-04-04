package Suche;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import datenbank.connector.DbConnector;
import datenbank.dao.DbQuery;
import java.sql.Connection;

public class LebensmittelsucheDao {
	
	private DbQuery preparedStatement;
	private String selectSQL;
	Statement statement;
	ResultSet result; 
	Connection connection;
	private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());

	
	public LebensmittelsucheDao(String lebensmittelname) {
		selectSQL = "select * from lebensmitteldaten where lname = '" + lebensmittelname + "'";
		DbConnector conn = new DbConnector();
		connection = conn.getConn();
		try {
			statement = connection.createStatement();
			result = statement.executeQuery(selectSQL);
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Query could not be established " + e);
		}
	}
	
	@SuppressWarnings("finally")
	public String doStuff() {
		// prepare & execute select SQL stetement
		
			try {
				  while (result.next()) {
				    String lname = result.getString("lname");
				    System.out.println(lname);
				    return lname;
				  }

				  } catch (SQLException e1) {
				    // TODO Auto-generated catch block
				    e1.printStackTrace();
				    System.out.println("Fehler");
				    return "swag";
				  } finally {
					  return "swag1";
				    //nothing
					//TODO: Handle exceptions
				  }
		

		

		
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
