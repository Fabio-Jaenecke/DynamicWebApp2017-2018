package Suche;

import datenbank.container.Lebensmitteldaten;

/**
 * Interface fuer die verschiedenen Suchmoeglichkeiten.
 *
 * @author mjtre
 * @version 22.03.2018 
 */
public interface Suche {
	
	public Lebensmitteldaten getLebensmittelInfoByName(String lebensmittelName);
	public Lebensmitteldaten getLebensmittelInfoByKategorie(String kategorieName, String lebensmittelName); 
	public Lebensmitteldaten getLebensmittelInfoBySuchfilter(String suchwort); 
}

//TODO: Java-Klasse fuer Suchfilter erstellen. (caradrap)