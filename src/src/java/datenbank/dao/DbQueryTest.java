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

/*
 * Klasse fürs testen falls die Tabellen mit Inhalt gefüllt sind.
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
}
