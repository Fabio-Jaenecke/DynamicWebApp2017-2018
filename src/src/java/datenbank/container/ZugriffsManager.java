package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Diese Klasse holt die lebensmittelDaten, die fuer die Zugriffsskala benoetigt werden, 
 * aus der Datenbank und stellt diese zur Verfuegung. 
 * 
 * @author Michele Trebo 
 * @verison 17.04.2018 
 */
public class ZugriffsManager {

	private int platzierung;
	private String lname;
	private String karenzphase;
	private String dauerernaehrung;
	private static final Logger LOGGER = Logger.getLogger(ZugriffsManager.class.getName());

	/**
	 * Erzeuge den ZugriffsManager. 
	 * 
	 * @param platzierung die Platzierung der Lebensmittel 
	 * @param lname der Lebensmittelname
	 * @param kategorie die lebensmittelkategorie 
	 * @param karenzphase die Karenzphase
	 * @param dauerernaehrung die Dauerernaehrung
	 */
	public ZugriffsManager(int platzierung, String lname, String karenzphase, String dauerernaehrung) {
		this.platzierung = platzierung;
		this.lname = lname;
		this.karenzphase = karenzphase;
		this.dauerernaehrung = dauerernaehrung;
	}

	/**
	 * Erzeuge den ZugriffsManager mittels Daten aus der Datenbank. 
	 * 
	 * @param rs das ResultSet
	 */
	public ZugriffsManager(ResultSet rs) {
		try {
			this.platzierung = rs.getInt("platzierung");
			this.lname = rs.getString("lname"); 
			this.karenzphase = rs.getString("karenzphase");
			this.dauerernaehrung = rs.getString("dauerernaehrung");
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Result set of ZugriffsManager could not be resolved " + e);
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
