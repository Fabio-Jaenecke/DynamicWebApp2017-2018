package datenbank;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * stellt die Java-Klasse zur Entitaet Lebensmittelkategorie
 * in der Datenbank da
 * @author Raphael Caradonna
 *
 */
public class Lebensmittelkategorie {

	private int kindex;
	private String kname;
	
	public Lebensmittelkategorie(int kindex, String kname) {
		this.kindex = kindex;
		this.kname = kname;
	}
	
	// TODO add exception
	public Lebensmittelkategorie(ResultSet rs) throws SQLException {
	   	this.kindex = rs.getInt("keindex"); 
	   	this.kname = rs.getString("kname"); 
	}
	
	public int getKindex() {
		return kindex;
	}
	public void setKindex(int kindex) {
		this.kindex = kindex;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
}
