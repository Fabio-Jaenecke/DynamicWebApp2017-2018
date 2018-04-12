package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnectorStub;

/**
 * Diese Klasse stellt die Java-Klasse zur Entitaet Zugriffsskala in der Datenbank dar. 
 * 
 * @author Raphael Caradonna und Michele Trebo
 * @version 12.04.2018 
 */
public class Zugriffsskala {

	private int zindex;
	private int platzierung;
	private int azugriffe;
	private static final Logger LOGGER = Logger.getLogger(Zugriffsskala.class.getName());
	
	/**
	 * Erzeuge die Zugriffsskala. 
	 * 
	 * @param zindex
	 * @param platzierung
	 * @param azugriffe
	 */
	public Zugriffsskala(int zindex, int platzierung, int azugriffe) {
		this.zindex = zindex;
		this.platzierung = platzierung;
		this.azugriffe = azugriffe;
	}
	
	/**
	 * Erzeuge die Zugrifsskala anhand der Daten aus der Datenbank.
	 * 
	 * @param rs das ResultSet
	 */
	public Zugriffsskala(ResultSet rs) {
		try {
			this.zindex = rs.getInt("zindex"); 
		   	this.platzierung = rs.getInt("platzierung"); 
		   	this.azugriffe = rs.getInt("azugriffe");
		}
	   	catch(SQLException e) {
	   		LOGGER.log(Level.SEVERE, "Result set of zugriffsskala could not be resolved " + e);
	   	}
	}

	/**
	 * Gib den Zugriffsindex. 
	 * 
	 * @return zindex 
	 */
	public int getZindex() {
		return zindex;
	}
	
	/**
	 * Setze den Zugriffsindex. 
	 * 
	 * @param zindex der Zugriffsindex 
	 */
	public void setZindex(int zindex) {
		this.zindex = zindex;
	}
	
	/**
	 * Gib die Platzierung eines Lebensmittels. 
	 * 
	 * @return platzierung
	 */
	public int getPlatzierung() {
		return platzierung;
	}
	
	/**
	 * Setze die Platzierung eines Lebensmittels. 
	 * 
	 * @param platzierung die Platzierung eines Lebensmittels 
	 */
	public void setPlatzierung(int platzierung) {
		this.platzierung = platzierung;
	}
	
	/**
	 * Gib die Anzahl Zugriffe auf ein Lebensmittel. 
	 * 
	 * @return azugriffe
	 */
	public int getAzugriffe() {
		return azugriffe;
	}
	
	/**
	 * Setze die Anzahl Zugriffe auf ein Lebensmittel. 
	 * 
	 * @param azugriffe die Anzahl Zugriffe auf ein Lebensmittel 
	 */
	public void setAzugriffe(int azugriffe) {
		this.azugriffe = azugriffe;
	}
}
