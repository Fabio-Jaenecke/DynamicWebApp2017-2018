package datenbank.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.Connection;

import datenbank.connector.DbConnector;

/*
 * Klasse für die Suchmaschine. Stellt eine Verbindugn zur Datebank her und sucht die Datenbank auf Resultate ab.
 */

public class DbQuery {
  
  private DbConnector conn = new DbConnector();
  private static final Logger LOGGER = Logger.getLogger(DbQuery.class.getName());
  
  /*
   * Verbindung zu Datebank bereits hier, also keine Erstellung im Konstruktor.
   */
  public DbQuery() {
    
  }
  
  /**
   * Gibt ein Resultat von der Datenbank zurück.
   * 
   * @param query eine SQL-Query
   * @return das Resultat
   */
  public ResultSet getResult(String query) {
    Statement statement;
    ResultSet result = null;
    Connection connection;
    connection = conn.getConn();
    try {
      statement = connection.createStatement();
      result = statement.executeQuery(query);
      return result;
    } catch (SQLException e) {
      LOGGER.log(Level.SEVERE, "Query could not be established " + e);
    }
    return result;
  }
  
  public void finalize() {
    conn.closeConnection();
  }
}
