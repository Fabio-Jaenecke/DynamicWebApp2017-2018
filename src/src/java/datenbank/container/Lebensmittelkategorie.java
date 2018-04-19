package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

<<<<<<< HEAD
import datenbank.connector.DbConnectorStub;

/**
 * stellt die Java-Klasse zur Entitaet lebensmittelkategorie
=======

/**
 * stellt die Java-Klasse zur Entitaet Lebensmittelkategorie
>>>>>>> refs/heads/master
 * in der Datenbank da
 * @author Raphael Caradonna
 *
 */
public class Lebensmittelkategorie {

	private int kindex;
	private String kname;
	private static final Logger LOGGER = Logger.getLogger(Lebensmittelkategorie.class.getName());
	
	public Lebensmittelkategorie(int kindex, String kname) {
		this.kindex = kindex;
		this.kname = kname;
	}
	
	public Lebensmittelkategorie(ResultSet rs) throws SQLException {
		try {
			this.kindex = rs.getInt("keindex"); 
		   	this.kname = rs.getString("kname"); 
		}
		catch(SQLException e) {
			LOGGER.log(Level.SEVERE, "Result set of lebensmittelkategorie could not be resolved " + e);
		}
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
