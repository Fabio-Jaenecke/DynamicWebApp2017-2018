package zugriffe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
		tabelle = new ArrayList<Zugriffsmanager>();
	}
	
	/**
	 * Hole die Platzierungen sowie die entsprechenden Lebensmitteldaten und gib diese in eine Tabelle. 
	 * @param platzierung die Platzierung der Lebensmittel 
	 */
	public void searchForString() {
		String selectSQL = "Select * FROM LEBENSMITTELDATEN l JOIN FAVORIT f"
				+" ON l.lindex=f.lindex JOIN Zugriffsskala z on f.zindex = z.zindex;";
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
	
	/**
	 * Sortiere die Tabelle von der ersten Platzierung bis zur letzten. 
	 * @param args
	 */
	public static void sortierePlatzierungErsteBisLetzte(String [] args) {
		List<Zugriffsmanager> platzierung = new ArrayList<Zugriffsmanager>(); 
		platzierung.addAll(platzierung); 
		//TODO: fix problem
	//	Collections.sort(platzierung); 
		for (int i=0; i<platzierung.size(); i++) {
			System.out.println(platzierung.get(i));
		}
	}
	
	/**
	 * Sortiere die Tabelle von der letzten Platzierung bis zur ersten. 
	 * @param args
	 */
	public static void sortierePlatzierungLetzteBisErste(String [] args) {
		List<Zugriffsmanager> platzierung = new ArrayList<Zugriffsmanager>(); 
		platzierung.addAll(platzierung); 
		//TODO: fix problem
	//	Collections.sort(platzierung); 
		for (int i=0; i>platzierung.size(); i--) {
			System.out.println(platzierung.get(i));
		}
	}
	
	/**
	 * Sortiere die Tabelle nach den Lebensmittelnamen von A bis Z. 
	 * @param args
	 */
	public static void sortiereLebensmittelnamenAbisZ(String [] args) {
		List<Zugriffsmanager> lnamen = new ArrayList<Zugriffsmanager>();
		lnamen.addAll(lnamen); 
		//TODO: fix problem
	//	Collections.sort(lnamen); 
		for (Zugriffsmanager lname: lnamen) {
			System.out.println(lname);
		}
	}
	
	/**
	 * Sortiere die Tabelle nach den Lebensmittelnamen von Z bis A. 
	 * @param args
	 */
	public void sortiereLebensmittelnameZbisA(String [] args) {
		List<Zugriffsmanager> lnamen = new ArrayList<Zugriffsmanager>(); 
		lnamen.addAll(lnamen); 
		//TODO: fix problem
	//	Collections.sort(lnamen); 
		Collections.reverse(lnamen);
		for (Zugriffsmanager lname: lnamen) {
			System.out.println(lname);
		}
	}
}
