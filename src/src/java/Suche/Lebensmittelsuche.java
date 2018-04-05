package Suche; 

import java.util.List;

import datenbank.container.Lebensmitteldaten;

/**
 * Klasse fuer die spezifische Suche nach einem Lebensmittel. 
 *
 * @author mjtre
 * @version 22.03.2018 
 */
public abstract class Lebensmittelsuche implements Suche {
	// TODO fix code
	// private LebensmittelsucheDao sucheDao = new LebensmittelsucheDao();
	
	/**
	 * Rufe die Methode getLebensmittelInfoByName auf. 
	 * @param lebensmittelName das gesuchte Lebensmittel 
	 */
	public Lebensmitteldaten getLebensmittelInfoByName(String lebensmittelName) {
		Lebensmitteldaten lebensmittel = null;
		if (lebensmittelName != null) {
			// TODO fix code
			// lebensmittel = sucheDao.getLebensmittel(lebensmittelName);
		}
		
		return lebensmittel;
	}
	
	/**
	 * Rufe die Methode getLebensmittelInfoByKategorie auf. 
	 * @param kategorieName die gesuchte Kategorie
	 * @param lebensmittelName das gesuchte Lebensmittel
	 */
	public List<Lebensmitteldaten> getLebensmittelInfoByKategorie(String kategorieName) {
		List<Lebensmitteldaten> kategorie = null; 
		if (kategorieName != null){
			// TODO fix code
			// kategorie = sucheDao.getKategorie(kategorieName);
		}
		return kategorie; 
	}
}