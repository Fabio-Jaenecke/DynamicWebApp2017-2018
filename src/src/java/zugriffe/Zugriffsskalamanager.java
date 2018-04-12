package zugriffe;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 

import datenbank.connector.DbConnector;
import datenbank.container.Lebensmitteldaten;
import datenbank.container.Zugriffsmanager;
import datenbank.dao.DbQuery; 

/**
 * Diese Klasse erstellt eine Tabelle mit den Platzierungen der Lebensmittel sowie den entsprechenden Lebensmitteldaten. 
 * 
 * @author Michele Trebo
 * @verison 12.04.2018
 */
public class Zugriffsskalamanager {

	private ArrayList<Zugriffsmanager> tabelle;
	DbQuery query = new DbQuery(); 
	DbConnector conn = new DbConnector(); 
	private static final Logger LOGGER = Logger.getLogger(Zugriffsskalamanager.class.getName()); 
	
	/**
	 * Erzeuge den Zugriffsskalamanager. 
	 */
	public Zugriffsskalamanager() {
		
	}
	
	/**
	 * Hole die Platzierungen sowie die entsprechenden Lebensmitteldaten und gib diese in eine Tabelle. 
	 * @param platzierung die Platzierung der Lebensmittel 
	 */
	public void searchForInteger(Integer platzierung) {
		String selectSQL = "Select * " + " FROM LEBENSMITTELDATEN l JOIN FAVORIT f"
				+ "ON l.lindex=f.lindex JOIN Zugriffsskala z on f.findex = z.findex " + "where z.Lname= '"
				+ platzierung + "';";
		try {
			ResultSet result = query.getResult(selectSQL);
			while (result.next()) {

				tabelle.add(new Zugriffsmanager(result));
			}
		} 
		catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "resultSet could not be resolved " + e);
		}
	}

	/**
	 * Leere die Tabelle. 
	 */
	public void clearTabelle(){
		tabelle.clear(); 
	}
	
	/**
	 * Liefere die Tabelle mit den Platzierungen und den entsprechenden Lebensmitteldaten. 
	 * @return tabelle
	 */
	public ArrayList<Zugriffsmanager> getTabelle() {
		return tabelle; 
	}
}
