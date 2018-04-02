package datenbank.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnector;

public class DbQuery {

	DbConnector conn = new DbConnector();
	private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());
	
	public DbQuery() {
		
	}
	
	public ResultSet getResult(String query) {
		Statement statement;
		ResultSet result; 
		try {
			statement = conn.getConn().createStatement();
			result = statement.executeQuery(query);
			return result;
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Query could not be established " + e);
		}
		// TODO return empty result
		return null;
	}
}
