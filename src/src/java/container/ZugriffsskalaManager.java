package container;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.container.ZugriffsManager;
import datenbank.dao.DbQuery;

/**
 * Diese Klasse erstellt eine Tabelle mit den Platzierungen der Lebensmittel sowie den entsprechenden Lebensmitteldaten.
 * 
 * @author Michele Trebo
 * @verison 12.04.2018
 */
public class ZugriffsskalaManager {
  
  private ArrayList<ZugriffsManager> tabelle;
  private DbQuery query = new DbQuery();
  private static final Logger LOGGER = Logger.getLogger(ZugriffsskalaManager.class.getName());
  
  /**
   * Erzeuge den Zugriffsskalamanager.
   */
  public ZugriffsskalaManager() {
    tabelle = new ArrayList<ZugriffsManager>();
  }
  
  /**
   * Hole die Platzierungen sowie die entsprechenden Lebensmitteldaten und gib diese in eine Tabelle.
   * 
   * @param platzierung die Platzierung der Lebensmittel
   */
  public void searchForString() {
    String selectSQL =
        "Select * FROM LEBENSMITTELDATEN l JOIN FAVORIT f" + " ON l.lindex=f.lindex JOIN Zugriffsskala z on f.zindex = z.zindex;";
    try (ResultSet result = query.getResult(selectSQL)) {
      while (result.next()) {
        tabelle.add(new ZugriffsManager(result));
      }
    } catch (SQLException e) {
      LOGGER.log(Level.SEVERE, "resultSet could not be resolved " + e);
    }
  }
  
  /**
   * Leere die Tabelle.
   */
  public void clearTabelle() {
    tabelle.clear();
  }
  
  /**
   * Liefere die Tabelle mit den Platzierungen und den entsprechenden Lebensmitteldaten.
   * 
   * @return tabelle
   */
  public ArrayList<ZugriffsManager> getTabelle() {
    return tabelle;
  }
}
