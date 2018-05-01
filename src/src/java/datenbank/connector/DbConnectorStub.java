package datenbank.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Stub zum Testen der databaseConnector-Klasse.
 */
public class DbConnectorStub {
	
	private Connection conn = null;
	private static final Logger LOGGER = Logger.getLogger(DbConnectorStub.class.getName());
	
	/**
	 * Da diese Klasse nur ein Stub ist, benötigen wir nur einen leeren Konstruktor.
	 */
	public DbConnectorStub() {}

	public boolean establishH2DBConnection() {
		try {
			conn = DriverManager.getConnection(getDB_Connection(), getDB_User(), getDB_Password());
		} 
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return true;
	}
	
	/**
	 * Gib das Resultset. 
	 * @param sql
	 * @return result 
	 */
	public ResultSet getResultSet(String sql) {
		ResultSet result = null;
		try {
			Statement stat = conn.createStatement();
			result = stat.executeQuery(sql);
			stat.close();
			conn.commit();
			
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "result set could not be resolved " + e);
		}
		
		return result;
	}
	
	/**
	 * Gib die Datenbankverbindung. 
	 * @return "jdbc:h2:~/histarantia"
	 */
	public String getDB_Connection() {
		return "jdbc:h2:~/histarantia";
	}

	/**
	 * Gib den Driver aus der Datenbank.  
	 * @return "org.h2.Driver"
	 */
	public String getDB_Driver() {
		return "org.h2.Driver";
	}

	/**
	 * Gib den Benutzer aus der Datenbank. 
	 * @return "user"
	 */
	public String getDB_User() {
		return "user";
	}

	/**
	 * Gib das Passwort aus der Datenbank. 
	 * @return ""
	 */
	public String getDB_Password() {
		return "";
	}
}
