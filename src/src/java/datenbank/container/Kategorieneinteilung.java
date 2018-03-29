package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * stellt die Java-Klasse zur Entitaet Kategorieneinteilung
 * in der Datenbank da
 * @author Raphael Caradonna
 *
 */
public class Kategorieneinteilung {
	
	private int keindex;
	private int kindex1;
	private int kindex2;
	private int kindex3;
	
	public Kategorieneinteilung(int keindex, int kindex1, int kindex2, int kindex3) {
		this.keindex = keindex;
		this.kindex1 = kindex1;
		this.kindex2 = kindex2;
		this.kindex3 = kindex3;
	}
	
	// TODO add exception
	public Kategorieneinteilung(ResultSet rs) throws SQLException {
    	this.keindex = rs.getInt("keindex"); 
    	this.kindex1 = rs.getInt("kindex1"); 
    	this.kindex2 = rs.getInt("kindex2"); 
    	this.kindex3 = rs.getInt("kindex3"); 
    }
	public int getKeindex() {
		return keindex;
	}
	public void setKeindex(int keindex) {
		this.keindex = keindex;
	}
	public int getKindex1() {
		return kindex1;
	}
	public void setKindex1(int kindex1) {
		this.kindex1 = kindex1;
	}
	public int getKindex2() {
		return kindex2;
	}
	public void setKindex2(int kindex2) {
		this.kindex2 = kindex2;
	}
	public int getKindex3() {
		return kindex3;
	}
	public void setKindex3(int kindex3) {
		this.kindex3 = kindex3;
	}

}
