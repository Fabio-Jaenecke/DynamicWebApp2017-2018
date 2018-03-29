package Suche;

import datenbank.container.Lebensmitteldaten;

/**
 * Interface f�r die verschiedenen Suchmoeglichkeiten.
 *
 * @author mjtre
 * @version 22.03.2018 
 */
public interface Suche {
	
	public Lebensmitteldaten getLebensmittelInfoByName(String lebensmittelName);
	public Lebensmitteldaten getLebensmittelInfoByKategorie(String lebensmittelName); 
	public Lebensmitteldaten getLebensmittelInfoByAllgemeineSuche(String suchwort); 
}

//TODO: Neue Java-Klassen f�r Kategoriensuche (jaenefab) & AllgemeineSuche 