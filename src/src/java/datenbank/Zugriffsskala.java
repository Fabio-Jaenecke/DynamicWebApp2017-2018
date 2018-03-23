package datenbank;

import java.sql.ResultSet;
import java.sql.SQLException;

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
	
	public Zugriffsskala(int zindex, int platzierung, int azugriffe) {
		this.zindex = zindex;
		this.platzierung = platzierung;
		this.azugriffe = azugriffe;
	}
	
	// TODO add exception
	public Zugriffsskala(ResultSet rs) throws SQLException {
	   	this.zindex = rs.getInt("zindex"); 
	   	this.platzierung = rs.getInt("platzierung"); 
	   	this.azugriffe = rs.getInt("azugriffe"); 
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
