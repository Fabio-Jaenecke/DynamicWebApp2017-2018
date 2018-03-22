package datenbank;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * stellt die Java-Klasse zur Entität Lebensmitteldaten
 * in der Datenbank da
 * @author Raphael Caradonna
 *
 */
public class Lebensmitteldaten {
	
	/**
	 * Attribute aus der Entität Lebensmitteldaten
	 */
	private int index;
	private String name;
	private String karenzphase;
	private String dauerernaehrung;
	private String kategorie;
	
	/**
	 * Standardkonstruktor für ein Lebensmittel
	 * @param index der Index des Lebensmittels
	 * @param name der Name des Lebensmittels
	 * @param karenzphase der erste Toleranzwert
	 * @param dauerernaehrung der zweite Toleranzwert
	 */
	public Lebensmitteldaten(int index, String name, String karenzphase, String dauerernaehrung) {
		this.index = index;
		this.name = name;
		this.karenzphase = karenzphase;
		this.dauerernaehrung = dauerernaehrung;
		this.kategorie = kategorie; 
	}
	
	/**
	 * Konstruktor für ein Tupel aus der Datenbank
	 * @param rs ein Lebensmitteltupel
	 * @throws SQLException SQL-Exception
	 */
	public Lebensmitteldaten(ResultSet rs) throws SQLException {
    	this.index = rs.getInt("lindex"); 
        this.name = rs.getString("lname");        
        this.karenzphase = rs.getString("karenzphase");
        this.dauerernaehrung = rs.getString("dauerernaehrung");
        this.kategorie = rs.getString("kategorie"); 
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
	
	public String getKategorie() {
		return kategorie;
	}

	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}

	/**
	 * gibt Datenfelder des Lebensmittels als String zurück
	 * @override
	 */
	public String toString() {
		return getLindex() + String.format(" ", getLname(), " ", 
				getKarenzphase(), " ", getDauerernaehrung(), " ", getKategorie());
	}

}
