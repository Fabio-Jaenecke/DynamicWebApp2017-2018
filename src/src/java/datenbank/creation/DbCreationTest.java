package datenbank.creation;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import datenbank.dao.DbQuery;

/**
 * Testklasse DbCreation Bestaetigt, dass Tabellen erstellt werden.
 */
public class DbCreationTest {
  
  /*
   * Um keine doppelten Eintraege zu erhalten, erstellen wir zuerst die Datenbank.
   */
  DbQuery query;
  DbCreation creation;
  
  @Before
  public void setUp() throws Exception {
    query = new DbQuery();
    creation = new DbCreation();
  }
  
  /*
   * Testen der create table-Anweisungen fuer die Tabelle lebensmittelDaten.
   */
  @Test
  public void testSetUpTablelebensmittelDaten() {
    creation.setUpTablelebensmittelDaten();
    assertNotNull(query.getResult("select 1 from lebensmittelDaten"));
  }
  
  /*
   * Die create table-Anweisungen fuer die Tabelle zugriffsskala testen.
   */
  @Test
  public void testSetUpTableZugriffsskala() {
    creation.setUpTableZugriffsskala();
    assertNotNull(query.getResult("select 1 from zugriffsskala"));
  }
  
  /*
   * Testen der create table-Anweisungen fuer die Tabelle lebensmittelkategorie.
   */
  @Test
  public void testSetUpTablelebensmittelkategorie() {
    creation.setUpTablelebensmittelkategorie();
    assertNotNull(query.getResult("select 1 from lebensmittelkategorie"));
  }
  
  /*
   * Testen der create table-Anweisungen fuer die Tabelle naehrstoff.
   */
  @Test
  public void testSetUpTableNaehrstoff() {
    creation.setUpTableNaehrstoff();
    assertNotNull(query.getResult("select 1 from naehrstoff"));
  }
  
  /*
   * Testen der create table-Anweisungen fuer die Tabelle favorit.
   */
  @Test
  public void testSetUpTableFavorit() {
    creation.setUpTableFavorit();
    assertNotNull(query.getResult("select 1 from favorit"));
  }
  
  /*
   * Testen der create table-Anweisungen fuer die Tabelle katzugehoerigkeit.
   */
  @Test
  public void testSetUpTableKatzugehoerigkeit() {
    creation.setUpTableKatzugehoerigkeit();
    assertNotNull(query.getResult("select 1 from katzugehoerigkeit"));
  }
  
  /*
   * Testen der create table-Anweisungen fuer die Tabelle enthaelt.
   */
  @Test
  public void testSetUpTableEnthaelt() {
    creation.setUpTableEnthaelt();
    assertNotNull(query.getResult("select 1 from enthaelt"));
  }
  
  /*
   * Testen der create table-Anweisungen fuer die Tabelle naehrzugehoerigkeit.
   */
  @Test
  public void testSetUpTableNaehrzugehoerigkeit() {
    creation.setUpTableNaehrzugehoerigkeit();
    assertNotNull(query.getResult("select 1 from naehrzugehoerigkeit"));
  }
  
}
