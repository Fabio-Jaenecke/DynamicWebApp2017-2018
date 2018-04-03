package Suche; 

import controller.Lebensmittelmanager;
import datenbank.container.Lebensmitteldaten;

/**
 * Klasse fuer die spezifische Suche nach einem Lebensmittel. 
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
	
	/**
	 * Rufe die Methode getLebensmittelInfoByKategorie auf. 
	 * @param kategorieName die gesuchte Kategorie
	 * @param lebensmittelName das gesuchte Lebensmittel
	 */
	public Lebensmitteldaten getLebensmittelInfoByKategorie(String kategorieName, String lebensmittelName) {
		return lebensmittelmanager.getLebensmittelInfoByKategorie(kategorieName, lebensmittelName);
	}
	
	public Lebensmitteldaten getNextLebensmittel() {
		if (lebensmittelmanager.listIterator().hasNext() != true) {
			getNextLebensmittel(); 
		}
		else {
			next = lebensmittelmanager.listIterator().next(); 
		}
		return next; 
	}
}

//TODO: write getNextLebensmittel-Method (caradrap)