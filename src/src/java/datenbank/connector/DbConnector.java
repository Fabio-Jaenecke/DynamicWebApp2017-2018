package datenbank.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnector {

	// TODO use empty connection and make connection non static
	private static Connection conn = null;
	private static final String DB_Connection = "jdbc:h2:~/histarantia";
	private static final String DB_Driver = "org.h2.Driver";	
	private static final String DB_User = "user";
	private static final String DB_Password = "";
	private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());
	
	public DbConnector() {
		loadH2Driver();
		establishH2DBConnection();
	}
	
	/*
	 *  Loading the database
	 */
	private void loadH2Driver() {
		try {
			Class.forName(DB_Driver);
		} 
		catch (ClassNotFoundException e) {
			LOGGER.log(Level.SEVERE, "Driver " + DB_Driver + " not found ", e);
		}
	}
	
	/*
	 *  Establishing database connection
	 */
	public Connection establishH2DBConnection() {
		try {
			conn = DriverManager.getConnection(DB_Connection, DB_User, DB_Password);
		} 
		catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Connection could not be established " + e);
		}
		
		return conn;
	}
	
	public Statement createStatement() {
		Statement statement;
		try {
			if(conn == null) {
				conn = establishH2DBConnection();
			}
			
			statement = conn.createStatement();
			return statement;
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Statement could not be established " + e);
		}
		
		// TODO return empty statement
		return null;
	}

	public String getDbConnection() {
		return DB_Connection;
	}

	public String getDbUser() {
		return DB_User;
	}

	public String getDbPassword() {
		return DB_Password;
	}

	public Connection getConn() {
		return conn;
	}
	
	// TODO fix code
	/*
	public void finally() {
		conn.close();
	}*/
}
