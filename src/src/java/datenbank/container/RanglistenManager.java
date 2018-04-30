package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Diese Klasse holt die Lebensmitteldaten, die fuer die Rangliste benoetigt werden, 
 * aus der Datenbank und stellt diese zur Verfuegung. 
 */
public class RanglistenManager {

	private String lname; 
	private String kategorie; 
	private String karenzphase; 
	private String dauerernaehrung; 
	private static final Logger LOGGER = Logger.getLogger(RanglistenManager.class.getName());

	/**
	 * Erzeugt die Rangliste für die Lebensmittelvertraeglichkeit. 
	 * @param lname der Lebensmittelname
	 * @param kategorie die lebensmittelkategorie
	 * @param karenzphase die Vertraeglichkeit waehrend der Karenzphase
	 * @param dauerernaehrung die Vertraeglichkeit waehrend der Dauerernaehrung
	 */
	public RanglistenManager(String lname, String kategorie, String karenzphase, String dauerernaehrung) {
		this.lname = lname;
		this.kategorie = kategorie; 
		this.karenzphase = karenzphase;
		this.dauerernaehrung = dauerernaehrung;
	} 
	
	/**
	 * Erzeuge den RanglistenManager mittels Daten aus der Datenbank. 
	 * @param rs das ResultSet
	 */
	public RanglistenManager(ResultSet rs) {
		try {
			this.lname = rs.getString("lname");
			this.kategorie = rs.getString("kategorie"); 
			this.karenzphase = rs.getString("karenzphase");
			this.dauerernaehrung = rs.getString("dauerernaehrung");
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Result set of RanglistenManager could not be resolved " + e);
		}
	}
	
	/**
	 * Gib den Lebensmittelnamen. 
	 * @return lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * Setze den Lebensmittelnamen. 
	 * @param lname der Lebensmittelname
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * Gib die lebensmittelkategorie. 
	 * @return kategorie
	 */
	public String getKategorie() {
		return kategorie;
	}

	/**
	 * Setze die lebensmittelkategorie. 
	 * @param kategrie die lebensmittelkategorie
	 */
	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}
	
	/**
	 * Gib die Vertraeglichkeit waehrend der Karenzphase. 
	 * @return karenzphase 
	 */
	public String getKarenzphase() {
		return karenzphase;
	}

	/**
	 * Setze die Vertraeglichkeit waehrend der Karenzphase. 
	 * @param karenzphase die Vertraeglichkeit waehrend der Karenzphase
	 */
	public void setKarenzphase(String karenzphase) {
		this.karenzphase = karenzphase;
	}

	/**
	 * Gib die Vertraeglichkeit waehrend der Dauerernaehrung.
	 * @return dauerernaehrung 
	 */
	public String getDauerernaehrung() {
		return dauerernaehrung;
	}

	/**
	 * Setze die Vertraeglichkeit waehrend der Dauerernaehrung.
	 * @param dauerernaehrung die Vertraeglichkeit waehrend der Dauerernaehrung 
	 */
	public void setDauerernaehrung(String dauerernaehrung) {
		this.dauerernaehrung = dauerernaehrung;
	}	
}
