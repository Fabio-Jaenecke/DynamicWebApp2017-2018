package rangliste;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnectorStub;
import datenbank.container.Zugriffsskala;
import datenbank.dao.DbQuery;

public class PlatzierungUpdater {
	
	/*
	 * bzw. sucht alle Einträge raus, speichert sie in einer ArrayList vom Objekt Zugriff ab
	 * sortiert diese nach der AnzahlZugriffe absteigend. navigiert durch ganze ArrayList und vergibt neue Platzieurngen
	 * und speichert diese in der Datenbank ab
	 */
	
	private ArrayList<Zugriffsskala> zugriffe = new ArrayList<>();
	private DbQuery query = new DbQuery();
	private static final Logger LOGGER = Logger.getLogger(PlatzierungUpdater.class.getName());
	
	public PlatzierungUpdater() {
		
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
		
	}
	
	public void putToDb() {
		
	}
}
