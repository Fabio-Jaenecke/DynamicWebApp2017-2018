package Suche; 

import datenbank.container.Lebensmitteldaten;

/**
 * Klasse fuer die spezifische Suche nach einem Lebensmittel. 
 *
 * @author mjtre
 * @version 22.03.2018 
 */
public abstract class Lebensmittelsuche implements Suche {
	
	private LebensmittelsucheDao sucheDao = new LebensmittelsucheDao();
	
	/**
	 * Rufe die Methode getLebensmittelInfoByName auf. 
	 * @param lebensmittelName das gesuchte Lebensmittel 
	 */
	public Lebensmitteldaten getLebensmittelInfoByName(String lebensmittelName) {
		Lebensmitteldaten lebensmittel = null;
		if (lebensmittelName != null) {
			lebensmittel = sucheDao.getLebensmittel(lebensmittelName);
		}
		
		return lebensmittel;
	}
	
	/**
	 * Rufe die Methode getLebensmittelInfoByKategorie auf. 
	 * @param kategorieName die gesuchte Kategorie
	 * @param lebensmittelName das gesuchte Lebensmittel
	 */
	public Lebensmitteldaten getLebensmittelInfoByKategorie(String kategorieName, String lebensmittelName) {
		Lebensmitteldaten lebensmittel = null; 
		if (kategorieName != null){
			lebensmittel = sucheDao.getLebensmittel(kategorieName);
		}
		if (lebensmittelName != null){
			lebensmittel = sucheDao.getLebensmittel(lebensmittelName);
		}
		return lebensmittel; 
	}
}