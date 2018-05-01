package datenbank.insertion;

/*
 * interface for inserting data to tables.
 * every method inserts data to one table
 */
public interface DbInsertionInterface {
  
  /*
   * Inserting data into table lebensmittelDaten
   */
  void insertIntoTablelebensmittelDaten();
  
  /*
   * Inserting data into table zugriffsskala
   */
  void insertIntoTableZugriffsskala();
  
  /*
   ** Inserting data into table lebensmittelkategorie
   */
  void insertIntoTablelebensmittelkategorie();
  
  /*
   * Inserting data into table naehrstoff
   */
  void insertIntoTableNaehrstoff();
  
  /*
   * Inserting data into table favorit
   */
  void insertIntoTableFavorit();
  
  /*
   * Inserting data into table katzugehoerigkeit
   */
  void insertIntoTableKatzugehoerigkeit();
  
  /*
   * Inserting data into table enthaelt
   */
  void insertIntoTableEnthaelt();
  
  /*
   * Inserting data into table naehrzugehoerigkeit
   */
  
  void insertIntoTableNaehrzugehoerigkeit();
}
