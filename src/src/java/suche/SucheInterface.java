package suche;

/**
 * Dieses Interface definiert Pflichtmethoden für Datensuchen
 * 
 * @author fabio jaenecke
 *
 */
public interface SucheInterface {
	
	void fuehreDatenAbfrageAus(String anweisung);

	void erhalteDaten(); 
    
	void loescheDaten(); 
    
}
