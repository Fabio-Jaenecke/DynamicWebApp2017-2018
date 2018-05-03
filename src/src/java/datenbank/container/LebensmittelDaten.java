package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import container.LebensmittelManager;
import datenbank.connector.DbConnector;

/**
 * Stellt die Java-Klasse zur Entitaet lebensmittelDaten
 * in der Datenbank dar. 
 */
public class LebensmittelDaten extends LebensmittelManager {
	
	private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());
	
	/**
	 * Standardkonstruktor fuer ein Lebensmittel.
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
	 * Konstruktor fuer ein Tupel aus der Datenbank. 
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

	/**
	 * Gib den Lebensmittelindex. 
	 * @return index
	 */
	public int getLindex() {
		return index;
	}

	/**
	 * Setze den Lebensmittelindex. 
	 * @param lindex
	 */
	public void setLindex(int lindex) {
		this.index = lindex;
	}

	/**
	 * Gib den Lebensmittelnamen.
	 * @return lebensmittelname
	 */
	@Override
	public String getLname() {
		return lebensmittelname;
	}

	/**
	 * Setze den Lebensmittelnamen. 
	 * @param lname
	 */
	public void setLname(String lname) {
		this.lebensmittelname = lname;
	}

	/**
	 * Gib die Karenzphase. 
	 * @return karenzphase
	 */
	public String getKarenzphase() {
		return karenzphase;
	}

	/**
	 * Setze die Karenzphase.
	 * @param karenzphase
	 */
	public void setKarenzphase(String karenzphase) {
		this.karenzphase = karenzphase;
	}

	/**
	 * Gib die Dauerernaehrung. 
	 * @return dauerernaehrung
	 */
	public String getDauerernaehrung() {
		return dauerernaehrung;
	}

	/**
	 * Setze die Dauerernaehrung. 
	 * @param dauerernaehrung
	 */
	public void setDauerernaehrung(String dauerernaehrung) {
		this.dauerernaehrung = dauerernaehrung;
	}
	
	/**
	 * Gib die Kategorie. 
	 * @return kategorie
	 */
	public String getKategorie() {
		return kategorie;
	}

	/**
	 * Setze die Kategorie. 
	 * @param kategorie
	 */
	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}


	/**
	 * Gibt die Datenfelder des Lebensmittels als String zurueck.
	 * @override
	 */
	public String toString() {
		return getLindex() + String.format(" ", getLname(), " ", 
				getKarenzphase(), " ", getDauerernaehrung(), " ", getKategorie());
	}
	
	@Override
  public boolean isNil() {
     return true;
  }
}
