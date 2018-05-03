package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import container.LebensmittelManager;
import datenbank.connector.DbConnector;

public class NullLebensmittelDaten extends LebensmittelManager {

  private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());
  
  /**
   * Standardkonstruktor fuer ein Lebensmittel.
   * @param name der Name des Lebensmittels
   */
  public NullLebensmittelDaten(String lebensmittelname) {
    this.lebensmittelname = lebensmittelname;
  }
    
  /**
   * Konstruktor fuer ein Tupel aus der Datenbank. 
   * @param rs ein Lebensmitteltupel
   * @throws SQLException SQL-Exception
   */
  public NullLebensmittelDaten(ResultSet rs) {
    try {
          this.lebensmittelname = rs.getString("lname");        
    }
    catch(SQLException e) {
      LOGGER.log(Level.SEVERE, "resultSet could not be resolved " + e);
    }
    }

  /**
   * Gib den Lebensmittelnamen.
   * @return lebensmittelname
   */
  @Override
  public String getLname() {
    return "Not available in the Database";
  }
  
  @Override
  public boolean isNil() {
     return true;
  }
}
