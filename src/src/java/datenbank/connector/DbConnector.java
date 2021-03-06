package datenbank.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Stellt Verbindung zur Datenbank her und erstellt Anweisungen.
 */
public class DbConnector {
  
  private static Connection conn;
  // true, wenn conn initialisiert wurde / false, wenn conn null ist
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
   * Lade die Datenbank.
   */
  private void loadH2Driver() {
    try {
      Class.forName(DB_Driver);
    } catch (ClassNotFoundException e) {
      LOGGER.log(Level.SEVERE, "Driver " + DB_Driver + " not found ", e);
    }
  }
  
  /**
   * Stelle Datenbankverbindung her.
   */
  public Connection establishH2DBConnection() {
    try {
      conn = DriverManager.getConnection(DB_Connection, DB_User, DB_Password);
      connInit = true;
    } catch (SQLException e) {
      LOGGER.log(Level.SEVERE, "Connection could not be established " + e);
    }
    
    return conn;
  }
  
  /**
   * Gib die Verbindung.
   */
  public Connection getConn() {
    return conn;
  }
  
  public static boolean isConnInit() {
    return connInit;
  }
  
  /**
   * Schliesse die Verbindung.
   */
  public void closeConnection() {
    try {
      if (connInit) {
        conn.close();
        connInit = false;
      }
    } catch (SQLException e) {
      LOGGER.log(Level.SEVERE, "connection could not be closed " + e);
    }
    
  }
}
