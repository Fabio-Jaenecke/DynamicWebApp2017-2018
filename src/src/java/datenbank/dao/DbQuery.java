package datenbank.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.Connection;

import datenbank.connector.DbConnector;

/*
 * Class for the search engine. Makes a connection to the database and searches the database for the result 
 */

public class DbQuery {

	private DbConnector conn = new DbConnector();
	private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());
	
	/*
	 * connection to database already here, so no creations in constructor
	 */
	public DbQuery() {
		
	}
	
	public ResultSet getResult(String query) {
		Statement statement;
		ResultSet result; 
		Connection connection;
		connection = conn.getConn();
		try {
			statement = connection.createStatement();
			result = statement.executeQuery(query);
			return result;
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Query could not be established " + e);
		}
		// TODO return empty result
		return null;
	}
	
	
}
