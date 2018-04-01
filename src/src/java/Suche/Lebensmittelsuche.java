package Suche; 

import controller.Lebensmittelmanager;
import datenbank.container.Lebensmitteldaten;
import java.util.ListIterator;

/**
 * Klasse fuer die spezifische Suche nach einem Lebensmittel. 
 *
 * @author mjtre
 * @version 22.03.2018 
 */
public abstract class Lebensmittelsuche implements Suche {
	
	private Lebensmittelmanager lebensmittelmanager = new Lebensmittelmanager();
	private ListIterator<Lebensmitteldaten> litr = null;
	
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
	
	public void getNextLebensmittel() {
		litr = lebensmittelmanager.lebensmittel.listIterator();
		int i = 0;
		while (litr.hasNext()) {
		    lebensmittelmanager.lebensmittelAusgeben(i);
		    i++;
		}
	}
}

//TODO: review getNextLebensmittel-Method (caradrap)