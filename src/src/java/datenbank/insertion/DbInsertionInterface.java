package datenbank.insertion;

/*
 * Schnittstelle zum Einfügen von Daten in Tabellen.
 * Jede Methode fügt Daten in eine Tabelle ein
 */
public interface DbInsertionInterface {
  
  /*
   * Einfügen von Daten in die Tabelle lebensmittelDaten
   */
  void insertIntoTablelebensmittelDaten();
  
  /*
   * Einfügen von Daten in die Tabelle zugriffsskala
   */
  void insertIntoTableZugriffsskala();
  
  /*
   ** Einfügen von Daten in Tabelle Lebensmittelklasse
   */
  void insertIntoTablelebensmittelkategorie();
  
  /*
   * Einfügen von Daten in Tabelle naehrstoff
   */
  void insertIntoTableNaehrstoff();
  
  /*
   * Einfügen von Daten in Tabelle favorit
   */
  void insertIntoTableFavorit();
  
  /*
   * Einfügen von Daten in Tabelle katzugehoerigkeit
   */
  void insertIntoTableKatzugehoerigkeit();
  
  /*
   * Einfügen von Daten in Tabelle enthaelt
   */
  void insertIntoTableEnthaelt();
  
  /*
   * Einfügen von Daten in Tabelle naehrzugehoerigkeit
   */
  
  void insertIntoTableNaehrzugehoerigkeit();
}
