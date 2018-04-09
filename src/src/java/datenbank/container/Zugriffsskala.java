package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnectorStub;

/**
 * stellt die Java-Klasse zur Entitaet Zugriffsskala
 * in der Datenbank da
 * @author Raphael Caradonna
 *
 */
public class Zugriffsskala {

	private int zindex;
	private int platzierung;
	private int azugriffe;
	private static final Logger LOGGER = Logger.getLogger(DbConnectorStub.class.getName());
	
	public Zugriffsskala(int zindex, int platzierung, int azugriffe) {
		this.zindex = zindex;
		this.platzierung = platzierung;
		this.azugriffe = azugriffe;
	}
	
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

	public int getZindex() {
		return zindex;
	}
	
	public void setZindex(int zindex) {
		this.zindex = zindex;
	}
	
	public int getPlatzierung() {
		return platzierung;
	}
	
	public void setPlatzierung(int platzierung) {
		this.platzierung = platzierung;
	}
	public int getAzugriffe() {
		return azugriffe;
	}
	public void setAzugriffe(int azugriffe) {
		this.azugriffe = azugriffe;
	}
}
