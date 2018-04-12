package rangliste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
	 * Suche nach der Karenzphase. 
	 * @param karenzphase. 
	 */
	public void searchForString(String lname, String karenzphase, String dauerernaehrung) {
		String selectSQL = "select * from rangliste where karenzphase like '%" + karenzphase + "%';";
		ResultSet result = query.getResult(selectSQL);
		try {
			if(result.next()) {
				tabelle = new Ranglistenmanager(result);
			}
			else {
				LOGGER.log(Level.SEVERE, "Selected karenzphase does not exist in database ");
			}
		}
		catch(SQLException e){
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
	 * Liefere die Tabelle mit der Karenzphase und der Dauerernaehrung sowie den entsprechenden Lebensmitteldaten.
	 * @return
	 */
	public ArrayList<Ranglistenmanager> getTabelle() {
		return tabelle; 
	}
	
	/**
	 * Sortiere die Tabelle nach der Karenzphase von gut �ber mittel bis schlecht. 
	 * @param args
	 */
	public static void sortiereKarenzphaseGutBisSchlecht(String [] args) {
		List<Ranglistenmanager> karenzphasen = new ArrayList<Ranglistenmanager>(); 
		karenzphasen.addAll(karenzphasen); 
		Collections.sort(karenzphasen);
		for (Ranglistenmanager karenzphase: karenzphasen) {
			System.out.println(karenzphase);
		}
	}
	
	/**
	 * Sortiere die Tabelle nach der Karenzphase von schlecht �ber mittel bis gut. 
	 * @param args
	 */
	public static void sortiereKarenzphaseSchlechtBisGut(String [] args) {
		List<Ranglistenmanager> karenzphasen = new ArrayList<Ranglistenmanager>(); 
		karenzphasen.addAll(karenzphasen); 
		Collections.sort(karenzphasen);
		Collections.reverse(karenzphasen);
		for (Ranglistenmanager karenzphase: karenzphasen) {
			System.out.println(karenzphase);
		}
	}
	
	/**
	 * Sortiere die Tabelle nach der Dauerernaehrung von gut �ber mittel bis schlecht. 
	 * @param args
	 */
	public static void sortiereDauerernaehrungGutBisSchlecht(String [] args) {
		List<Ranglistenmanager> dauerernaehrungen = new ArrayList<Ranglistenmanager>(); 
		dauerernaehrungen.addAll(dauerernaehrungen); 
		Collections.sort(dauerernaehrungen);
		for (Ranglistenmanager dauerernaehrung: dauerernaehrungen) {
			System.out.println(dauerernaehrung);
		}
	}
	
	/**
	 * Sortiere die Tabelle nach der Dauerernaehrung von schlecht �ber mittel bis gut. 
	 * @param args
	 */
	public static void sortiereDauerernaehrungSchlechtBisGut(String [] args) {
		List<Ranglistenmanager> dauerernaehrungen = new ArrayList<Ranglistenmanager>(); 
		dauerernaehrungen.addAll(dauerernaehrungen); 
		Collections.sort(dauerernaehrungen);
		Collections.reverse(dauerernaehrungen);
		for (Ranglistenmanager dauerernaehrung: dauerernaehrungen) {
			System.out.println(dauerernaehrung);
		}
	}
	
	/**
	 * Sortiere die Tabelle nach den Lebensmittelnamen von A bis Z. 
	 * @param args
	 */	
	public static void sortiereLebensmittelnamenAbisZ(String [] args) {
		List<Zugriffsmanager> lnamen = new ArrayList<Zugriffsmanager>();
		lnamen.addAll(lnamen); 
		Collections.sort(lnamen);
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
		Collections.sort(lnamen);
		Collections.reverse(lnamen);
		for (Zugriffsmanager lname: lnamen) {
			System.out.println(lname);
		}
	}
}
