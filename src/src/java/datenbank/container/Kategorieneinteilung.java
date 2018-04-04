package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnectorStub;

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
	private static final Logger LOGGER = Logger.getLogger(Kategorieneinteilung.class.getName());
	
	public Kategorieneinteilung(int keindex, int kindex1, int kindex2, int kindex3) {
		this.keindex = keindex;
		this.kindex1 = kindex1;
		this.kindex2 = kindex2;
		this.kindex3 = kindex3;
	}
	
	public Kategorieneinteilung(ResultSet rs) {
		try {
			this.keindex = rs.getInt("keindex"); 
	    	this.kindex1 = rs.getInt("kindex1"); 
	    	this.kindex2 = rs.getInt("kindex2"); 
	    	this.kindex3 = rs.getInt("kindex3"); 
		}
    	catch(SQLException e){
    		LOGGER.log(Level.SEVERE, "Result set of kategorieneinteilung could not be resolved " + e);
    	}
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
