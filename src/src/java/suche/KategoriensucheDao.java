package suche;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnector;
import datenbank.container.LebensmittelDaten;
import datenbank.dao.DbQuery;

/**
 * Diese Klasse uebergibt die Datenbankabfrage der Datenbank und fuehrt eine Suche
 * mit einer vordefinierten Tabelle durch und gibt die Lebensmittel in der entsprechenden
 * Tabelle aus.
 *
 * @author Raphael Caradonna und Michele Trebo und Fabio Jaenecke 
 * @version 09.04.2018 
 */
public class KategoriensucheDao {

	private ArrayList<LebensmittelDaten> lebensmittel = new ArrayList<>();
	DbQuery query = new DbQuery();
	DbConnector conn = new DbConnector();
	private static final Logger LOGGER = Logger.getLogger(KategoriensucheDao.class.getName());

	/**
	 * Erzeuge KategoriensucheDao. 
	 */
	public KategoriensucheDao() {

	}

	/**
	 * Führt eine Abfrage auf der Datenbank durch
	 * @param selectSQL eine SQL-Abfrage. 
	 */
	public void searchForString(String selectSQL) {
		try (ResultSet result = query.getResult(selectSQL)){
			while (result.next()) {
				lebensmittel.add(new LebensmittelDaten(result));
			}
		} 
		catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "resultSet could not be resolved " + e);
		}
	}

	/**
	 * Leere die Lebensmittel. 
	 */
	public void clearLebensmittel() {
		lebensmittel.clear();
	}

	/**
	 * Liefere die Liste der Lebensmittel der entsprechenden Kategorie. 
	 * @return lebensmittel 
	 */
	public ArrayList<LebensmittelDaten> getLebensmittel() {
		return lebensmittel;
	}
	
	
	/**
	 * Suche nach dem Namen der Kategorie und deren zugehoerigen Lebensmitteln.  
	 * @param kategorienname
	 * @return die SQL query
	 */
	public String kategorienSuche(String kategorienname) {
		String selectSQL = "Select * " + " FROM lebensmittelDaten l JOIN KATZUGEHOERIGKEIT k "
				+ "ON l.lindex=k.lindex JOIN lebensmittelkategorie lk on k.kindex = lk.kindex " + "where lower(lk.Kname)= '"
				+ kategorienname.toLowerCase() + "';";
		return selectSQL;
	}
	
	/**
	 * Suche nach dem Namen der Nahrstoffkateogorie und deren zugehoerigen Lebensmitteln.  
	 * @param kategorienname
	 * @return die SQL query
	 */
	public String naehrstoffSuche(String naehrstoffname) {
		String selectSQL = "SELECT * FROM lebensmittelDaten l JOIN NAEHRZUGEHOERIGKEIT n" + 
				" ON l.lindex=n.lindex" + 
				" WHERE n.nname='" + naehrstoffname + "';";
		return selectSQL;
	}
	
	/**
	 * Selektiere Lebensmittel und sortiere eine der Spalten auf- oder absteigend.  
	 * @param eine Spalte, die sortiert werden soll und das praedikat order, welches DESC oder ASC annehmen kann.
	 * @return die SQL query
	 */
	public String spaltenSortierer(String zusortierendeSpalte, String order) {
		String selectSQL = "select * from lebensmittelDaten Order BY " + zusortierendeSpalte + " " + order + ";";	
		return selectSQL;
	}
	
	
	
	
}