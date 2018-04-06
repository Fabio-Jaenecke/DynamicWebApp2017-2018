//TODO: Follow clean-code guidelines and use the Suche Interface
package Suche;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import datenbank.connector.DbConnector;
import datenbank.container.Lebensmitteldaten;

/**
 * Diese Klasse uebergibt die Datenbankabfrage zur Datenbank und fuehrt eine
 * Suche mit einem vordefinierten Lebensmitteln durch.
 * 
 * @author trebomic 
 *
 */
public class LebensmittelsucheDao {

	private String selectSQL;
	private Statement statement;
	private ResultSet result;
	private Connection connection;
	private String gefundeneslebensmittel = null;
	private String karenzphase;
	private String dauerernaehrung;
	private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());

	public LebensmittelsucheDao(String lebensmittelname) {
		selectSQL = "select * from lebensmitteldaten where lname like '%" + lebensmittelname + "%';";
		DbConnector conn = new DbConnector();
		connection = conn.getConn();
		try {
			statement = connection.createStatement();
			result = statement.executeQuery(selectSQL);
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Query could not be established " + e);
		}
	}
	
	public Lebensmitteldaten getLebensmittel(String lebensmittelname) throws SQLException {
		Lebensmitteldaten lebensmitteldaten = null;
		 
		String query = "select l.lindex, l.lname, l.karenzphase, l.dauerernaherung"
				+ " from lebensmitteldaten l  join katzugehoerigkeit k on l.lindex"
				+ "= k.lindex join lebensmittelkategorie j on j.kindex = k.kindex where l.lname = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, lebensmittelname);
		result = preparedStatement.executeQuery();
		Lebensmitteldaten lebensmittelTest = new Lebensmitteldaten(result);
		while(result.next()) {
			lebensmitteldaten = new Lebensmitteldaten(
					result.getInt("lindex"),
					result.getString("lname"),
					result.getString("karenzphase"),
					result.getString("dauerernaehrung"),
					result.getString("kname"));
		}
		return lebensmitteldaten;
			
	}
}
