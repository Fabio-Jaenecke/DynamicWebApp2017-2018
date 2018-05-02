package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Stellt die Java-Klasse zur Entitaet Lebensmittelkategorie in der Datenbank dar.
 */
public class Lebensmittelkategorie {
  
  private int kindex;
  private String kname;
  private static final Logger LOGGER = Logger.getLogger(Lebensmittelkategorie.class.getName());
  
  public Lebensmittelkategorie(int kindex, String kname) {
    this.kindex = kindex;
    this.kname = kname;
  }
  
  public Lebensmittelkategorie(ResultSet rs) throws SQLException {
    try {
      this.kindex = rs.getInt("kindex");
      this.kname = rs.getString("kname");
    } catch (SQLException e) {
      LOGGER.log(Level.SEVERE, "Result set of lebensmittelkategorie could not be resolved " + e);
    }
  }
  
  /**
   * Gib den Karenzphasenindex.
   * 
   * @return kindex
   */
  public int getKindex() {
    return kindex;
  }
  
  /**
   * Setze den Karenzphasenindex.
   * 
   * @param kindex
   */
  public void setKindex(int kindex) {
    this.kindex = kindex;
  }
  
  /**
   * Gib die Karenzphase.
   * 
   * @return
   */
  public String getKname() {
    return kname;
  }
  
  /**
   * Setze die Karenzphase.
   * 
   * @param kname
   */
  public void setKname(String kname) {
    this.kname = kname;
  }
}
