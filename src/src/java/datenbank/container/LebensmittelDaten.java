package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
	public LebensmittelDaten(int index, String lebensmittelname, String karenzphase, String dauerernaehrung, String kategorie, int zindex, int platzierung, int azugriffe, int kindex, String kname) {
		this.index = index;
		this.lebensmittelname = lebensmittelname;
		this.karenzphase = karenzphase;
		this.dauerernaehrung = dauerernaehrung;
		this.kategorie = kategorie;
		this.zindex = zindex;
    this.platzierung = platzierung;
    this.azugriffe = azugriffe;
    this.kindex = kindex;
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
        this.zindex = rs.getInt("zindex"); 
        this.platzierung = rs.getInt("platzierung"); 
        this.azugriffe = rs.getInt("azugriffe");
        this.kindex = rs.getInt("kindex");
        this.kname = rs.getString("kname");
		}
		catch(SQLException e) {
			LOGGER.log(Level.WARNING, "resultSet could not be resolved " + e);
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
   * Gib den Zugriffsindex. 
   * @return zindex 
   */
  public int getZindex() {
    return zindex;
  }
  
  /**
   * Setze den Zugriffsindex. 
   * @param zindex der Zugriffsindex 
   */
  public void setZindex(int zindex) {
    this.zindex = zindex;
  }
  
  /**
   * Gib die Platzierung eines Lebensmittels. 
   * @return platzierung
   */
  public int getPlatzierung() {
    return platzierung;
  }
  
  /**
   * Setze die Platzierung eines Lebensmittels. 
   * @param platzierung die Platzierung eines Lebensmittels 
   */
  public void setPlatzierung(int platzierung) {
    this.platzierung = platzierung;
  }
  
  /**
   * Gib die Anzahl Zugriffe auf ein Lebensmittel. 
   * @return azugriffe
   */
  public int getAzugriffe() {
    return azugriffe;
  }
  
  /**
   * Setze die Anzahl Zugriffe auf ein Lebensmittel. 
   * @param azugriffe die Anzahl Zugriffe auf ein Lebensmittel 
   */
  public void setAzugriffe(int azugriffe) {
    this.azugriffe = azugriffe;
  }
  
  /**
   * Gib den Karenzphasenindex.
   * 
   * @return kindex
   */
  public int getKindex() {
    return kindex;
  }
  
  /**
   * Setze den Karenzphasenindex.
   * 
   * @param kindex
   */
  public void setKindex(int kindex) {
    this.kindex = kindex;
  }
  
  /**
   * Gib die Karenzphase.
   * 
   * @return
   */
  public String getKname() {
    return kname;
  }
  
  /**
   * Setze die Karenzphase.
   * 
   * @param kname
   */
  public void setKname(String kname) {
    this.kname = kname;
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
     return false;
  }
}
