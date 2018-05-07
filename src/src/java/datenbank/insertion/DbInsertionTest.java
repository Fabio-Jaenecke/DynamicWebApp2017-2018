package datenbank.insertion;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import datenbank.creation.DbCreation;
import datenbank.dao.DbQuery;

/*
 * Testet Klasse DbInsertion.java
 */
public class DbInsertionTest {
  
  DbInsertion insertion;
  DbQuery query;
  
  @Before
  public void setUp() throws Exception {
    // Um keine doppelten Einträge zu erhalten, erstellen wir zuerst die Datenbank
    DbCreation creation = new DbCreation();
    creation.setUpTables();
    insertion = new DbInsertion();
    query = new DbQuery();
  }
  
  /*
   * Testen die INSERT-Anweisungen für die Tabelle lebensmittelDaten
   */
  @Test
  public void testInsertIntoTablelebensmittelDaten() {
    insertion.insertIntoTablelebensmittelDaten();
    assertNotNull(query.getResult("select * from lebensmittelDaten"));
  }
  
  /*
   * Testen die INSERT-Anweisungen für die Tabelle zugriffsskala
   */
  @Test
  public void testInsertIntoTableZugriffsskala() {
    insertion.insertIntoTableZugriffsskala();
    assertNotNull(query.getResult("select * from zugriffsskala"));
  }
  
  /*
   * Testen die INSERT-Anweisungen für die Tabelle lebensmittelkategorie
   */
  @Test
  public void testInsertIntoTablelebensmittelkategorie() {
    insertion.insertIntoTablelebensmittelkategorie();
    assertNotNull(query.getResult("select * from lebensmittelkategorie"));
  }
  
  /*
   * Testen die INSERT-Anweisungen für die Tabelle naehrstoff
   */
  @Test
  public void testInsertIntoTableNaehrstoff() {
    insertion.insertIntoTableNaehrstoff();
    assertNotNull(query.getResult("select * from naehrstoff"));
  }
  
  /*
   * Testen die INSERT-Anweisungen für die Tabelle favorit
   */
  @Test
  public void testInsertIntoTableFavorit() {
    insertion.insertIntoTableFavorit();
    assertNotNull(query.getResult("select * from favorit"));
  }
  
  /*
   * Testen die INSERT-Anweisungen für die Tabelle katzugehoerigkeit
   */
  @Test
  public void testInsertIntoTableKatzugehoerigkeit() {
    insertion.insertIntoTableKatzugehoerigkeit();
    assertNotNull(query.getResult("select * from katzugehoerigkeit"));
  }
  
  /*
   * Testen die INSERT-Anweisungen für die Tabelle enthaelt
   */
  @Test
  public void testInsertIntoTableEnthaelt() {
    insertion.insertIntoTableEnthaelt();
    assertNotNull(query.getResult("select * from enthaelt"));
  }
  
  /*
   * Testen die INSERT-Anweisungen für die Tabelle naehrzugehoerigkeit
   */
  @Test
  public void testInsertIntoTableNaehrzugehoerigkeit() {
    insertion.insertIntoTableNaehrzugehoerigkeit();
    assertNotNull(query.getResult("select * from naehrzugehoerigkeit"));
  }
  
}
