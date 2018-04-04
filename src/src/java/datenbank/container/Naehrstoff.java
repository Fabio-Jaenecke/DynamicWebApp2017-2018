package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnectorStub;

/**
 * stellt die Java-Klasse zur Entitaet Nahrstoff
 * in der Datenbank da
 * @author Raphael Caradonna
 *
 */
public class Naehrstoff {
	
	private int nindex;
	private String nname;
	private static final Logger LOGGER = Logger.getLogger(Naehrstoff.class.getName());
	
	public Naehrstoff(int nindex, String nname) {
		this.nindex = nindex;
		this.nname = nname;
	}
	
	public Naehrstoff(ResultSet rs) {
    	try {
			this.nindex = rs.getInt("nindex"); 
			this.nname = rs.getString("nname");
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Result set of naehrstoff could not be resolved " + e);
		}        
    }
	public int getNindex() {
		return nindex;
	}
	public void setNindex(int nindex) {
		this.nindex = nindex;
	}
	public String getNname() {
		return nname;
	}
	public void setNname(String nname) {
		this.nname = nname;
	}
}
