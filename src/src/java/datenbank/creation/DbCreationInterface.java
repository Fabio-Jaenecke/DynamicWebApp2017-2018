package datenbank.creation;

/*
 * interface for inserting data to tables.
 * every method creates one table
 */
public interface DbCreationInterface {
  
  void setUpTables();
  
  void setUpTablelebensmittelDaten();
  
  void setUpTableZugriffsskala();
  
  void setUpTablelebensmittelkategorie();
  
  void setUpTableNaehrstoff();
  
  void setUpTableFavorit();
  
  void setUpTableKatzugehoerigkeit();
  
  void setUpTableEnthaelt();
  
  void setUpTableNaehrzugehoerigkeit();
  
}
