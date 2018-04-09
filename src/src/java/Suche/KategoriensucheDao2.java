package Suche;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnector;
import datenbank.container.Lebensmitteldaten;
import datenbank.dao.DbQuery;

/**
 * Diese Klasse uebergibt die Datenbankabfrage zur Datenbank und fuehrt eine Suche
 * mit einer vordefinierten Kategorie durch und gibt die Lebensmittel in der entsprechenden
 * Kategorie aus.
 *
 * @author Raphael Caradonna und Michele Trebo 
 * @version 09.04.2018 
 */
public class KategoriensucheDao2 {

	private ArrayList<Lebensmitteldaten> lebensmittel = new ArrayList<>();
	DbQuery query = new DbQuery();
	DbConnector conn = new DbConnector();
	private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());

	/**
	 * Konstruktor der Kategoriensuche. 
	 */
	public KategoriensucheDao2() {

	}

	/**
	 * Suche nach dem Namen der Kategorie und deren zugehoerigen Lebensmitteln.  
	 * @param kategorienname der Name der gesuchten Kategorie. 
	 */
	public void searchForString(String kategorienname) {
		// TODO fix sql-statement so that it returns multiple rows
		String selectSQL = "Select * " + " FROM LEBENSMITTELDATEN l JOIN KATZUGEHOERIGKEIT k "
				+ "ON l.lindex=k.lindex JOIN LEBENSMITTELKATEGORIE lk on k.kindex = lk.kindex " + "where lk.Kname= '"
				+ kategorienname + "';";
		try {
			ResultSet result = query.getResult(selectSQL);
			while (result.next()) {

				lebensmittel.add(new Lebensmitteldaten(result));
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
	 * Liefere die Lebensmittel. 
	 * @return lebensmittel 
	 */
	public ArrayList<Lebensmitteldaten> getLebensmittel() {
		return lebensmittel;
	}
}