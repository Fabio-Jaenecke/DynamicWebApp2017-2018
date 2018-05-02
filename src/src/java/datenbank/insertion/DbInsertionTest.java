package datenbank.insertion;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import datenbank.creation.DbCreation;
import datenbank.dao.DbQuery;

/*
 * tests class DbInsertion.java
 */
public class DbInsertionTest {
  
  DbInsertion insertion;
  DbQuery query;
  
  @Before
  public void setUp() throws Exception {
    // to not have any double entries, we first create the database
    DbCreation creation = new DbCreation();
    creation.setUpTables();
    insertion = new DbInsertion();
    query = new DbQuery();
  }
  
  /*
   * Testing the insert statements for the table lebensmittelDaten
   */
  @Test
  public void testInsertIntoTablelebensmittelDaten() {
    insertion.insertIntoTablelebensmittelDaten();
    assertNotNull(query.getResult("select * from lebensmittelDaten"));
  }
  
  /*
   * Testing the insert statements for the table zugriffsskala
   */
  @Test
  public void testInsertIntoTableZugriffsskala() {
    insertion.insertIntoTableZugriffsskala();
    assertNotNull(query.getResult("select * from zugriffsskala"));
  }
  
  /*
   * Testing the insert statements for the table lebensmittelkategorie
   */
  @Test
  public void testInsertIntoTablelebensmittelkategorie() {
    insertion.insertIntoTablelebensmittelkategorie();
    assertNotNull(query.getResult("select * from lebensmittelkategorie"));
  }
  
  /*
   * Testing the insert statements for the table naehrstoff
   */
  @Test
  public void testInsertIntoTableNaehrstoff() {
    insertion.insertIntoTableNaehrstoff();
    assertNotNull(query.getResult("select * from naehrstoff"));
  }
  
  /*
   * Testing the insert statements for the table favorit
   */
  @Test
  public void testInsertIntoTableFavorit() {
    insertion.insertIntoTableFavorit();
    assertNotNull(query.getResult("select * from favorit"));
  }
  
  /*
   * Testing the insert statements for the table katzugehoerigkeit
   */
  @Test
  public void testInsertIntoTableKatzugehoerigkeit() {
    insertion.insertIntoTableKatzugehoerigkeit();
    assertNotNull(query.getResult("select * from katzugehoerigkeit"));
  }
  
  /*
   * Testing the insert statements for the table enthaelt
   */
  @Test
  public void testInsertIntoTableEnthaelt() {
    insertion.insertIntoTableEnthaelt();
    assertNotNull(query.getResult("select * from enthaelt"));
  }
  
  /*
   * Testing the insert statements for the table naehrzugehoerigkeit
   */
  @Test
  public void testInsertIntoTableNaehrzugehoerigkeit() {
    insertion.insertIntoTableNaehrzugehoerigkeit();
    assertNotNull(query.getResult("select * from naehrzugehoerigkeit"));
  }
  
}
