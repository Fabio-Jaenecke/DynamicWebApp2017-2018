package datenbank;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Stellt die Java-Klasse zur Entitaet Lebensmitteldaten
 * in der Datenbank dar.
 * @author Raphael Caradonna
 *
 */
public class Lebensmittel {
	
	/**
	 * Attribute aus der Entitaet Lebensmitteldaten
	 */
	private int index;
	private String name;
	private String karenzphase;
	private String dauerernaehrung;
		
	/**
	 * Standardkonstruktor für ein Lebensmittel
	 * @param index der Index des Lebensmittel
	 * @param name der Name des Lebensmittel
	 * @param karenzphase der erste Toleranzwert
	 * @param dauerernaehrung der zweite Toleranzwert
	 */
	public Lebensmittel(int index, String name, String karenzphase, String dauerernaehrung) {
		this.index = index;
		this.name = name;
		this.karenzphase = karenzphase;
		this.dauerernaehrung = dauerernaehrung;
	}
	
	/**
	 * Konstruktor fuer ein Tupel aus der Datenbank
	 * @param rs ein Lebensmitteltupel
	 * @throws SQLException SQL-Exception
	 */
	public Lebensmittel(ResultSet rs) throws SQLException {
    	this.index = rs.getInt("lindex"); 
        this.name = rs.getString("lname");        
        this.karenzphase = rs.getString("karenzphase");
        this.dauerernaehrung = rs.getString("dauerernaehrung");
    }

	public Lebensmittel() {
		// TODO Auto-generated constructor stub
	}

	public int getLindex() {
		return index;
	}

	public void setLindex(int lindex) {
		this.index = lindex;
	}

	public String getLname() {
		return name;
	}

	public void setLname(String lname) {
		this.name = lname;
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
	
	/**
	 * gibt Datenfelder des Lebensmittels als String zurueck
	 * @override
	 */
	public String toString() {
		return getLindex() + String.format(" ", getLname(), " ", 
				getKarenzphase(), " ", getDauerernaehrung());
	}

}
