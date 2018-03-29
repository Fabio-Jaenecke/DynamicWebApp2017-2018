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
	public Lebensmitteldaten getLebensmittelInfoByAllgemeineSuche(String suchwort); 
}

//TODO: Neue Java-Klassen fuer Kategoriensuche (jaenefab) & AllgemeineSuche 