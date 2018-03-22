package Suche;

import datenbank.Lebensmitteldaten;

public interface Suche {
	
	public Lebensmitteldaten getLebensmittelInfoByName(String lebensmittelName);
	public Lebensmitteldaten getLebensmittelInfoByKategorie(String lebensmittelName); 
	public Lebensmitteldaten getLebensmittelInfoByAllgemeineSuche(String suchwort); 
}

//TODO: Neue Java-Klassen f�r Kategoriensuche (jaenefab) & AllgemeineSuche 