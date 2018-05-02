package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Stellt die Java-Klasse zur Entitaet Nahrstoff in der Datenbank dar.
 */
public class Naehrstoff {
  
  private String nname;
  private static final Logger LOGGER = Logger.getLogger(Naehrstoff.class.getName());
  
  public Naehrstoff(String nname) {
    this.nname = nname;
  }
  
  public Naehrstoff(ResultSet rs) {
    try {
      this.nname = rs.getString("nname");
    } catch (SQLException e) {
      LOGGER.log(Level.SEVERE, "Result set of naehrstoff could not be resolved " + e);
    }
  }
  
  /**
   * Gib den Naehrstoff.
   */
  public String getNname() {
    return nname;
  }
  
  /**
   * Setze den Naehrstoff.
   */
  public void setNname(String nname) {
    this.nname = nname;
  }
}
