package suche.updater;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnector;
import datenbank.container.Zugriffsskala;
import datenbank.dao.DbQuery;

/*
 * sucht alle Eintr�ge der Tabelle Zugriffsskala raus, speichert sie in einer ArrayList vom Objekt Zugriff ab
 * sortiert diese nach der AnzahlZugriffe absteigend. speichert diese in der Datenbank ab mit einer neuen
 * Platzierungsnummer
 */
public class PlatzierungUpdater  {
	
	private ArrayList<Zugriffsskala> zugriffe = new ArrayList<Zugriffsskala>();
	private DbConnector conn = new DbConnector();
	private DbQuery query = new DbQuery();
	private static final Logger LOGGER = Logger.getLogger(PlatzierungUpdater.class.getName());
	
	public PlatzierungUpdater() {
		getZugriffeInDB();
		//sortByAZugriffe();
		//putToDb();
	}
	
	public void getZugriffeInDB() {
		String selectSql = "select * from zugriffsskala";
		ResultSet result = query.getResult(selectSql);
		try {
			while(result.next()) {
				zugriffe.add(new Zugriffsskala(result));
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "resultSet could not be resolved " + e);
		}
	}
	
	public void sortByAZugriffe() {
		Collections.sort(zugriffe);
	}

	public ArrayList<Zugriffsskala> getZugriffe() {
		return zugriffe;
	}

	public void putToDb() {
		for(Zugriffsskala zugriff: zugriffe) {
			try {
				String updateSql = "update zugriffsskala set platzierung = ? where zindex = ?";
				Connection connection = conn.getConn();
				PreparedStatement statement = connection.prepareStatement(updateSql);
				statement.setInt(1,  zugriff.getPlatzierung());
				statement.setInt(2, zugriff.getZindex());
				statement.execute();
				statement.close();
				connection.commit();
			} catch (SQLException e) {
				LOGGER.log(Level.SEVERE, "rows in zugriffsskala could not be set " + e);
			}
		}
	}
}
