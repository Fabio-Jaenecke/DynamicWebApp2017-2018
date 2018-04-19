package container;

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
 * @version 17.04.2018 
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
	 * Suche nach dem Lebensmittel. 
	 * @param lebensmittelname der Name des Lebensmittels. 
	 */
	public void searchForString() {
		String selectSQL = "Select * " + " FROM LEBENSMITTELDATEN l JOIN KATZUGEHOERIGKEIT k "
				+ "ON l.lindex=k.lindex JOIN LEBENSMITTELKATEGORIE lk on k.kindex = lk.kindex';";
		ResultSet result = query.getResult(selectSQL);
		try {
			if(result.next()) {
				tabelle.add(new Ranglistenmanager(result));
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
}
