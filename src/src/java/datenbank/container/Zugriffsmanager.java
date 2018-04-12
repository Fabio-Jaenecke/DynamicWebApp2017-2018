package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Diese Klasse holt die Lebensmitteldaten, welche fuer die Zugriffsskala benoetigt werden, 
 * aus der Datenbank und stellt diese zur Verfuegung. 
 * 
 * @author Michele Trebo 
 * @verison 12.04.2018 
 */
public class Zugriffsmanager {

	private int platzierung;
	private String lname;
	private String kategorie; 
	private String karenzphase;
	private String dauerernaehrung;
	private static final Logger LOGGER = Logger.getLogger(Zugriffsmanager.class.getName());

/**
 * Erzeuge den Zugriffsmanager. 
 * 
 * @param platzierung die Platzierung der Lebensmittel 
 * @param lname der Lebensmittelname
 * @param kategorie die Lebensmittelkategorie 
 * @param karenzphase die Karenzphase
 * @param dauerernaehrung die Dauerernaehrung
 */
	public Zugriffsmanager(int platzierung, String lname, String kategorie, String karenzphase, String dauerernaehrung) {
		this.platzierung = platzierung;
		this.lname = lname;
		this.kategorie = kategorie; 
		this.karenzphase = karenzphase;
		this.dauerernaehrung = dauerernaehrung;
	}

/**
 * Erzeuge den Zugriffsmanager mittels Daten aus der Datenbank. 
 * 
 * @param rs das ResultSet
 */
	public Zugriffsmanager(ResultSet rs) {
		try {
			this.platzierung = rs.getInt("platzierung");
			this.lname = rs.getString("lname");
			this.kategorie = rs.getString("kategorie"); 
			this.karenzphase = rs.getString("karenzphase");
			this.dauerernaehrung = rs.getString("dauerernaehrung");
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Result set of zugriffsmanager could not be resolved " + e);
		}
	}

	/**
	 * Gib die Platzierung. 
	 * 
	 * @return platzierung 
	 */
	public int getPlatzierung() {
		return platzierung;
	}

	/**
	 * Setze die Platzierung. 
	 * 
	 * @param platzierung die Platzierung 
	 */
	public void setPlatzierung(int platzierung) {
		this.platzierung = platzierung;
	}
	
	/**
	 * Gib den Lebensmittelnamen. 
	 * 
	 * @return lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * Setze den Lebensmittelnamen. 
	 * 
	 * @param lname der Lebensmittelname
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * Gib die Lebensmittelkategorie. 
	 * 
	 * @return kategorie
	 */
	public String getKategorie() {
		return kategorie;
	}

	/**
	 * Setze die Lebensmittelkategorie. 
	 * 
	 * @param kategrie die Lebensmittelkategorie
	 */
	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}
	
	/**
	 * Gib die Karenzphase. 
	 * 
	 * @return karenzphase 
	 */
	public String getKarenzphase() {
		return karenzphase;
	}

	/**
	 * Setze die Karenzphase. 
	 * 
	 * @param karenzphase die Karenzphase
	 */
	public void setKarenzphase(String karenzphase) {
		this.karenzphase = karenzphase;
	}

	/**
	 * Gib die Dauerernaehrung.
	 * 
	 * @return dauerernaehrung 
	 */
	public String getDauerernaehrung() {
		return dauerernaehrung;
	}

	/**
	 * Setze die Dauerernaehrung.
	 * 
	 * @param dauerernaehrung die Dauerernaehrung 
	 */
	public void setDauerernaehrung(String dauerernaehrung) {
		this.dauerernaehrung = dauerernaehrung;
	}
}
