package datenbank.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

import datenbank.container.LebensmittelDaten;
import datenbank.container.Lebensmittelkategorie;
import datenbank.container.Naehrstoff;
import datenbank.container.Zugriffsskala;

/*
 * Class for testing if the tables are filled with content
 */

public class DbQueryTest {
  
  private DbQuery dbQuery;
  private static final Logger LOGGER = Logger.getLogger(DbQueryTest.class.getName());
  
  @Before
  public void setUp() throws Exception {
    dbQuery = new DbQuery();
  }
  
  /*
   * test getting entry for table lebensmitteldaten. then we check if values for columns are correct TODO fix db connection error
   * (also for other tests)
   */
  @Test
  public void testTableLebensmittledaten() {
    String sql = "select * from lebensmittelDaten where lname like 'Birne';";
    try (ResultSet res = dbQuery.getResult(sql)) {
      assertNotNull(res);
      LebensmittelDaten lebensmittel = new LebensmittelDaten(res);
      assertNotNull(lebensmittel);
      assertEquals(2002, lebensmittel.getLindex());
      assertEquals("Birne", lebensmittel.getLname());
      assertEquals("schlecht", lebensmittel.getKarenzphase());
      assertEquals("mittel", lebensmittel.getDauerernaehrung());
      
    } catch (SQLException e) {
      LOGGER.log(Level.SEVERE, "resultSet could not be determined", e);
    }
  }
  
  /*
   * test getting entry for table lebensmitteldaten. then we check if values for columns are correct TODO put results sets in try
   * statement (if there is enough time)
   */
  @Test
  public void testTableZugriffsskala() throws SQLException {
    String sql = "select * from zugriffsskala where zindex = 100";
    try (ResultSet res = dbQuery.getResult(sql)) {
      assertNotNull(res);
      Zugriffsskala zugriff = new Zugriffsskala(res);
      assertNotNull(zugriff);
      assertEquals(100, zugriff.getZindex());
      assertEquals(11, zugriff.getPlatzierung());
      assertEquals(0, zugriff.getPlatzierung());
    } catch (SQLException e) {
      LOGGER.log(Level.SEVERE, "resultSet could not be determined", e);
    }
  }
  
  /*
   * test getting entry for table lebensmitteldaten. then we check if values for columns are correct
   */
  @Test
  public void testTablelebensmittelkategorie() {
    String sql = "select * from lebensmittelkategorie where kindex = 1000";
    try (ResultSet res = dbQuery.getResult(sql)) {
      assertNotNull(res);
      Lebensmittelkategorie kategorie = new Lebensmittelkategorie(res);
      assertNotNull(kategorie);
      assertEquals(1000, kategorie.getKindex());
      assertEquals("Fleisch", kategorie.getKname());
    } catch (SQLException e) {
      LOGGER.log(Level.SEVERE, "resultSet could not be determined", e);
    }
  }
  
  // Testing if table naehrstoff is not empty
  @Test
  public void testTableNaehrstoff() {
    String sql = "select * from naehrstoff where nname like 'Proteine'";
    try (ResultSet res = dbQuery.getResult(sql)) {
      assertNotNull(res);
      Naehrstoff naehrstoff = new Naehrstoff(res);
      assertNotNull(naehrstoff);
      assertEquals("Proteine", naehrstoff.getNname());
    } catch (SQLException e) {
      LOGGER.log(Level.SEVERE, "resultSet could not be determined", e);
    }
  }
}
