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
   * Test für den Einstieg in die Tabelle Lebensmitteldaten. dann überprüfen wir, ob die Werte für die Spalten korrekt sind.
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
   * tested Einstieg für TabelleLebensmitteldaten. dann prüfen wir, ob die Werte für die Spalten korrekt sind.
   */
  @Test
  public void testTableZugriffsskala() throws SQLException {
    String sql = "select * from zugriffsskala where zindex = 100";
    try (ResultSet res = dbQuery.getResult(sql)) {
      assertNotNull(res);
      LebensmittelDaten zugriff = new LebensmittelDaten(res);
      assertNotNull(zugriff);
      assertEquals(100, zugriff.getZindex());
      assertEquals(11, zugriff.getPlatzierung());
      assertEquals(0, zugriff.getPlatzierung());
    } catch (SQLException e) {
      LOGGER.log(Level.SEVERE, "resultSet could not be determined", e);
    }
  }
  
  /*
   * testet eintraege für Tabelle Lebensmitteldaten. dann prüfen wir, ob die Werte für die Spalten korrekt sind
   */
  @Test
  public void testTablelebensmittelkategorie() {
    String sql = "select * from lebensmittelkategorie where kindex = 1000";
    try (ResultSet res = dbQuery.getResult(sql)) {
      assertNotNull(res);
      LebensmittelDaten kategorie = new LebensmittelDaten(res);
      assertNotNull(kategorie);
      assertEquals(1000, kategorie.getKindex());
      assertEquals("Fleisch", kategorie.getKname());
    } catch (SQLException e) {
      LOGGER.log(Level.SEVERE, "resultSet could not be determined", e);
    }
  }
  
  
  /**
   *  Testet ob Narhstoffe nicht leer aber dafür korrekt sind.
   */
  @Test
  public void testTableNaehrstoff() {
    String sql = "select * from naehrstoff where nname like 'Proteine'";
    try (ResultSet res = dbQuery.getResult(sql)) {
      assertNotNull(res);
      LebensmittelDaten naehrstoff = new LebensmittelDaten(res);
      assertNotNull(naehrstoff);
      assertEquals("Proteine", naehrstoff.getnName());
    } catch (SQLException e) {
      LOGGER.log(Level.SEVERE, "resultSet could not be determined", e);
    }
  }
  
}
