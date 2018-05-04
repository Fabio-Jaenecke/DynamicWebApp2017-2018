package suche;

/**
 * Dieses Interface definiert Pflichtmethoden für Datensuchen
 * 
 * @author fabio jaenecke
 *
 */
public interface SucheInterface {
  
  /**
   * Legt fest, dass eine Abfrage erstellt und übergeben werden muss.
   * 
   * @param anweisung eine SQL Abfrage oder ein Tupelname
   */
  void fuehreDatenAbfrageAus(String anweisung); 
  
  /**
   * Legt fest, was mit den erhaltenen Daten passieren soll.
   */
  void erhalteDaten(); 
  
  /**
   * Alle verwedeten Ressourssen müssen, wenn möglich, anschliessend gelöscht werden.
   */
  void loescheDaten(); 
  
}
