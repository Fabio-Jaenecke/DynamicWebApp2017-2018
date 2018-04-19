package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnectorStub;

/**
 * stellt die Java-Klasse zur Entitaet Lebensmittelkategorie
 * in der Datenbank da
 * @author Raphael Caradonna
 *
 */
public class LebensmittelKategorie {

	private int kindex;
	private String kname;
	private static final Logger LOGGER = Logger.getLogger(LebensmittelKategorie.class.getName());
	
	public LebensmittelKategorie(int kindex, String kname) {
		this.kindex = kindex;
		this.kname = kname;
	}
	
	public LebensmittelKategorie(ResultSet rs) throws SQLException {
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
