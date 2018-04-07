package Suche;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnector;
import datenbank.container.Lebensmitteldaten;
import datenbank.dao.DbQuery;

public class KategoriensucheDao2 {

	private ArrayList<Lebensmitteldaten> lebensmittel = new ArrayList<>();
	DbQuery query = new DbQuery();
	private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());
	
	public KategoriensucheDao2() {
		
	}
	
	public void searchForString(String kategorienname) {
		// TODO fix sql-statement so that it returns multiple rows
		String selectSQL =  "Select * "
				+ " FROM LEBENSMITTELDATEN l JOIN KATZUGEHOERIGKEIT k "
				+ "ON l.lindex=k.lindex JOIN LEBENSMITTELKATEGORIE lk on k.kindex = lk.kindex "
				+ "where lk.Kname='" + kategorienname + "';";
		ResultSet result = query.getResult(selectSQL);
		try {
			while(result.next()) {
				lebensmittel.add(new Lebensmitteldaten(result));
				// TODO remove
				int i = 2;
			}
		}
		catch(SQLException e){
			LOGGER.log(Level.SEVERE, "resultSet could not be resolved " + e);
		}
	}
	
	public void clearLebensmittel() {
		lebensmittel.clear();
	}

	public ArrayList<Lebensmitteldaten> getLebensmittel() {
		return lebensmittel;
	}
}