package suche;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.List;

import datenbank.connector.DbConnector;
import datenbank.container.LebensmittelDaten;
import datenbank.dao.DbQuery;

public abstract class SucheMultiTupel implements SucheInterface {
  private ArrayList<LebensmittelDaten> lebensmittel = new ArrayList<>();
  DbQuery query = new DbQuery();
  DbConnector conn = new DbConnector();
  private static final Logger LOGGER = Logger.getLogger(SucheMultiTupel.class.getName());
  
  @Override
  public void fuehreDatenAbfrageAus(String selectSQL) {
    searchForString(selectSQL);
  }
  
  @Override
  public void erhalteDaten() {
    getLebensmittel();
  }
  
  @Override
  public void loescheDaten() {
    clearLebensmittel();
  }
  
  /**
   * Führt eine Abfrage auf der Datenbank durch
   * 
   * @param selectSQL eine SQL-Abfrage.
   */
  public void searchForString(String selectSQL) {
    try (ResultSet result = query.getResult(selectSQL)) {
      while (result.next()) {
        lebensmittel.add(new LebensmittelDaten(result));
      }
    } catch (SQLException e) {
        LOGGER.log(Level.SEVERE, "resultSet could not be resolved " + e);
    }
  }
  
  /**
   * Leere die Lebensmittel.
   */
  public void clearLebensmittel() {
    lebensmittel.clear();
  }
  
  /**
   * Liefere die Liste der Lebensmittel der entsprechenden Kategorie.
   * 
   * @return lebensmittel
   */
  public ArrayList<LebensmittelDaten> getLebensmittel() {
    try {
      checkLebensmittelListNull();
    } catch (Exception e) {
        LOGGER.log(Level.SEVERE, "The List was not found " + e);
    }
    return lebensmittel;
  }
  
  /**
   * @return an empty list or an accumulated List
   */
  public List<String> checkLebensmittelListNull() {
    if (lebensmittel.isEmpty()) {
      return Collections.emptyList();
    }
    return lebensmittel.stream().map(LebensmittelDaten::toString).collect(Collectors.toList());
  }
}
