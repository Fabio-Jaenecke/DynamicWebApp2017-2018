package datenbank.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Establishes connection to database and creates statements.
 */
public class DbConnector {

	private static Connection conn;
	// true if conn has been initialized, false if conn is null
	private static boolean connInit = false;
	
	private static final String DB_Connection = "jdbc:h2:~/histarantia";
	private static final String DB_Driver = "org.h2.Driver";	
	private static final String DB_User = "user";
	private static final String DB_Password = "";
	
	private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());
	
	public DbConnector() {
		loadH2Driver();
		establishH2DBConnection();
	}
	
	/** 
	 *  Loading the database.
	 */
	private void loadH2Driver() {
		try {
			Class.forName(DB_Driver);
		} 
		catch (ClassNotFoundException e) {
			LOGGER.log(Level.SEVERE, "Driver " + DB_Driver + " not found ", e);
		}
	}
	
	/**
	 *  Establishing database connection.
	 */
	public Connection establishH2DBConnection() {
		try {
			conn = DriverManager.getConnection(DB_Connection, DB_User, DB_Password);
			connInit = true;
		} 
		catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Connection could not be established " + e);
		}
		
		return conn;
	}

	/**
	 * Get the database-connection. 
	 * @return DB_Connection
	 */
	public String getDbConnection() {
		return DB_Connection;
	}

	/**
	 * Get the user of the database. 
	 * @return DB_User 
	 */
	public String getDbUser() {
		return DB_User;
	}

	/**
	 * Get the password of the database.  
	 * @return DB_Password
	 */
	public String getDbPassword() {
		return DB_Password;
	}

	/**
	 * Get the connection.
	 * @return conn
	 */
	public Connection getConn() {
		return conn;
	}
	
	/**
	 * Close the connection. 
	 */
	public void closeConnection() {
		try {
			if(connInit) {
	    		conn.close();    
	    	}
		}
		catch(SQLException e) {
			LOGGER.log(Level.SEVERE, "connection could not be closed " + e);
		}
    	
    }
}
