package datenbank.connector;

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
public class DbConnectorStub {
	
	private Connection conn = null;
	private static final Logger LOGGER = Logger.getLogger(DbConnectorStub.class.getName());
	
	/*
	 * as this class is only a stub, we only need an empty constructor
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
	
	public ResultSet getResultSet(String sql) {
		ResultSet result = null;
		try {
			Statement stat = conn.createStatement();
			result = stat.executeQuery(sql);
			stat.close();
			conn.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public String getDB_Connection() {
		return "jdbc:h2:~/histarantia";
	}


	public String getDB_Driver() {
		return "org.h2.Driver";
	}


	public String getDB_User() {
		return "user";
	}


	public String getDB_Password() {
		return "";
	}
}
