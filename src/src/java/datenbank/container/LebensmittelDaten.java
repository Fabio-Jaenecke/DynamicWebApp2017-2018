package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnector;

/**
 * stellt die Java-Klasse zur Entitaet lebensmittelDaten
 * in der Datenbank da
 * @author Raphael Caradonna
 *
 */
public class LebensmittelDaten {
	
	/**
	 * Attribute aus der Entitaet lebensmittelDaten
	 */
	private int index;
	private String lebensmittelname;
	private String karenzphase;
	private String dauerernaehrung;
	private String kategorie;
	private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());
	
	/**
	 * Standardkonstruktor fuer ein Lebensmittel
	 * @param index der Index des Lebensmittels
	 * @param name der Name des Lebensmittels
	 * @param karenzphase der erste Toleranzwert
	 * @param dauerernaehrung der zweite Toleranzwert
	 */
	public LebensmittelDaten(int index, String lebensmittelname, String karenzphase, String dauerernaehrung, String kategorie) {
		this.index = index;
		this.lebensmittelname = lebensmittelname;
		this.karenzphase = karenzphase;
		this.dauerernaehrung = dauerernaehrung;
		this.kategorie = kategorie; 
	}
		
	/**
	 * Konstruktor fuer ein Tupel aus der Datenbank
	 * @param rs ein Lebensmitteltupel
	 * @throws SQLException SQL-Exception
	 */
	public LebensmittelDaten(ResultSet rs) {
		try {
				this.index = rs.getInt("lindex"); 
		        this.lebensmittelname = rs.getString("lname");        
		        this.karenzphase = rs.getString("karenzphase");
		        this.dauerernaehrung = rs.getString("dauerernaehrung");
		}
		catch(SQLException e) {
			LOGGER.log(Level.SEVERE, "resultSet could not be resolved " + e);
		}
    }

	public int getLindex() {
		return index;
	}

	public void setLindex(int lindex) {
		this.index = lindex;
	}

	public String getLname() {
		return lebensmittelname;
	}

	public void setLname(String lname) {
		this.lebensmittelname = lname;
	}

	public String getKarenzphase() {
		return karenzphase;
	}

	public void setKarenzphase(String karenzphase) {
		this.karenzphase = karenzphase;
	}

	public String getDauerernaehrung() {
		return dauerernaehrung;
	}

	public void setDauerernaehrung(String dauerernaehrung) {
		this.dauerernaehrung = dauerernaehrung;
	}
	
	public String getKategorie() {
		return kategorie;
	}

	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}

	/**
	 * gibt Datenfelder des Lebensmittels als String zurueck
	 * @override
	 */
	public String toString() {
		return getLindex() + String.format(" ", getLname(), " ", 
				getKarenzphase(), " ", getDauerernaehrung(), " ", getKategorie());
	}

}
