package datenbank.manager;

import datenbank.creation.DbCreation;
import datenbank.insertion.DbInsertion;

/**
 * erstellt Tabellen für die Datenbank und fügt sie mit Datum ein
 * 
 * @author Raphael
 *
 */
public class DbManager {
  
  DbCreation creation = new DbCreation();
  DbInsertion insertion = new DbInsertion();
  
  /**
   *  Momentan erstellt dbManager nur Tabellen und fügt sie in Tabellen ein, sodass wir nur einen leeren Konstruktor benötigen.
   */
  public DbManager() {
    
  }
}
