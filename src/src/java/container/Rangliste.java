package container;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 

import datenbank.container.RanglistenManager;
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
	private ArrayList<RanglistenManager> tabelle; 
	private DbQuery query = new DbQuery(); 
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
		String selectSQL = "Select * " + " FROM lebensmittelDaten l JOIN KATZUGEHOERIGKEIT k "
				+ "ON l.lindex=k.lindex JOIN lebensmittelkategorie lk on k.kindex = lk.kindex';";
		try (ResultSet result = query.getResult(selectSQL)){
			if(result.next()) {
				tabelle.add(new RanglistenManager(result));
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
	 * Liefere die Tabelle mit der Karenzphase und der Dauerernaehrung sowie den entsprechenden lebensmittelDaten.
	 * @return
	 */
	public ArrayList<RanglistenManager> getTabelle() {
		return tabelle; 
	}
}
