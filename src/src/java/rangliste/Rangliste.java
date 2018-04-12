package rangliste;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 

import datenbank.connector.DbConnector;
import datenbank.container.Lebensmitteldaten;
import datenbank.container.Ranglistenmanager;
import datenbank.container.Zugriffsmanager;
import datenbank.dao.DbQuery; 

/**
 * Diese Klasse uebergibt die Datenbankabfrage der Datenbank und sortiert die 
 * Rangliste der Lebensmittel. 
 * 
 * @author Michele Trebo
 * @version 10.04.2018 
 *
 */
public class Rangliste {
	private ArrayList<Ranglistenmanager> tabelle; 
	DbQuery query = new DbQuery(); 
	DbConnector conn = new DbConnector(); 
	private static final Logger LOGGER = Logger.getLogger(Rangliste.class.getName()); 
	
	/**
	 * Erzeuge die Rangliste. 
	 */
	public Rangliste() {
		
	}
	
	/**
	 * 
	 */
	public void searchForInteger(Integer platzierung) {
		String selectSQL = "Select * " + " FROM LEBENSMITTELDATEN l JOIN FAVORIT f"
				+ "ON l.lindex=f.lindex JOIN Zugriffsskala z on f.findex = z.findex " + "where z.Lname= '"
				+ platzierung + "';";
		try {
			ResultSet result = query.getResult(selectSQL);
			while (result.next()) {

				tabelle.add(new Ranglistenmanager(result));
			}
		} 
		catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "resultSet could not be resolved " + e);
		}
	}
	
	/**
	 * 
	 */
	public void clearTabelle(){
		tabelle.clear(); 
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Ranglistenmanager> getTabelle() {
		return tabelle; 
	}
	
	public void sortiereKarenzphaseGutBisSchlecht() {
		
	}
	
	public void sortiereKarenzphaseSchlechtBisGut() {
		
	}
	
	public void sortiereDauerernaehrungGutBisSchlecht() {
		
	}
	
	public void sortiereDauerernaehrungSchlechtBisGut() {
		
	}
	
	public void sortiereLebensmittelnamenAbisZ() {
		
	}
	
	public void sortiereLebensmittelnameZbisA() {
		
	}
}
