package Suche; 

import controller.Lebensmittelmanager;
import datenbank.container.Lebensmitteldaten;

/**
 * Klasse f�r die spezifische Suche nach einem Lebensmittel. 
 *
 * @author mjtre
 * @version 22.03.2018 
 */
public abstract class Lebensmittelsuche implements Suche {
	
	private Lebensmittelmanager lebensmittelmanager = new Lebensmittelmanager();
	
	/**
	 * Rufe die Methode getLebensmittelInfoByName auf. 
	 * @param lebensmittelName das gesuchte Lebensmittel 
	 */
	public Lebensmitteldaten getLebensmittelInfoByName(String lebensmittelName) {
		return lebensmittelmanager.getLebensmittelInfoByName(lebensmittelName);
	}
}

	
