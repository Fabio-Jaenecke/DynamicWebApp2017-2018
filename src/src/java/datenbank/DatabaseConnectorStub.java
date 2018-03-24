package datenbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * stub for testing the databaseConnector class
 * TODO refactor class
 * @author Raphael
 *
 */
public class DatabaseConnectorStub {
	
	private Connection conn = null;
	private Statement stat;
	private static final Logger LOGGER = Logger.getLogger(DatabaseConnector.class.getName());
	private String DB_Connection = "jdbc:h2:~/histarantia";
	private String DB_Driver = "org.h2.Driver";	
	private String DB_User = "user";
	private String DB_Password = "";
	
	public DatabaseConnectorStub() {
		try {
			establishH2DBConnection();
		}
		catch(Exception e){
			LOGGER.log(Level.SEVERE, " You cannot use the database. Either there's already a connection "
					+ "or the configuration settings are false", e);
		}
	}

	public ResultSet getResultSet(String sql) {
		ResultSet result = null;
		try {
			stat = conn.createStatement();
			result = stat.executeQuery(sql);
			stat.close();
			conn.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public boolean establishH2DBConnection() {
		
		try {
			conn = DriverManager.getConnection(DB_Connection, DB_User, DB_Password);
		} 
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return true;
	}
	
	public Connection getConn() {
		return conn;
	}


	public String getDB_Connection() {
		return DB_Connection;
	}


	public String getDB_Driver() {
		return DB_Driver;
	}


	public String getDB_User() {
		return DB_User;
	}


	public String getDB_Password() {
		return DB_Password;
	}
}
