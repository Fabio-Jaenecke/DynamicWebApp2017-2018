package datenbank.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnector {

	// TODO use empty connection
	private static Connection conn = null;
	private final String DB_Connection = "jdbc:h2:~/histarantia";
	private final String DB_Driver = "org.h2.Driver";	
	private final String DB_User = "user";
	private final String DB_Password = "";
	private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());
	
	public DbConnector() {
		loadH2Driver();
		establishH2DBConnection();
	}
	
	private void loadH2Driver() {
		try {
			Class.forName(DB_Driver);
		} 
		catch (ClassNotFoundException e) {
			LOGGER.log(Level.SEVERE, "Driver " + DB_Driver + " not found ", e);
		}
	}
	
	public Connection establishH2DBConnection() {
		try {
			conn = DriverManager.getConnection(DB_Connection, DB_User, DB_Password);
		} 
		catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Connection could not be established " + e);
		}
		
		return conn;
	}

	public static Connection getConn() {
		return conn;
	}
}
