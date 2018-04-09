package rangliste;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnector;
import datenbank.container.Lebensmitteldaten;
import datenbank.container.Zugriffsskala;
import datenbank.dao.DbQuery;

public class ZugriffUpdater {
	
	private DbConnector conn = new DbConnector();
	DbQuery query = new DbQuery();
	Zugriffsskala zugriff;
	private static final Logger LOGGER = Logger.getLogger(ZugriffUpdater.class.getName());
	
	public ZugriffUpdater(Lebensmitteldaten lebensmittel) {
		anpassenZugriff(lebensmittel);
	}
	
	public void anpassenZugriff(Lebensmitteldaten lebensmittel) {
		getZugriff(lebensmittel);
	}
		
	private void getZugriff(Lebensmitteldaten lebensmittel) {
		String selectSql = "select z.zindex from zugriffsskala z join favorit f on z.zindex = f.zindex where f.lindex = '"
				+ lebensmittel.getLindex() + "';";
		try {
			ResultSet result = query.getResult(selectSql);
			while(result.next()) {
				zugriff = new Zugriffsskala(result);
		}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "row in table zugriff could not be determined " + e);
		}	
	}
	
	public void updateAZugriffe() {
		String updateSql = "update zugriffskala set aZugriffe = ? where zindex = ?";
		try {
			PreparedStatement statement = conn.getConn().prepareStatement(updateSql);
			zugriff.setAzugriffe(zugriff.getAzugriffe()+1);
			statement.setInt(1, zugriff.getAzugriffe());
			statement.setInt(2, zugriff.getZindex());
			statement.execute(updateSql);
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "AnzahlZugriff could not be incremented " + e);
		}
	}
}
