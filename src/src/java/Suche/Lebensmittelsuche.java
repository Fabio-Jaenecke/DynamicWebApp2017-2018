package Suche;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;

import datenbank.connector.DbConnector;
import datenbank.container.Lebensmitteldaten;

/**
 * Klasse fuer die spezifische Suche nach einem Lebensmittel.
 *
 * @author trebomic
 * @version 22.03.2018
 */
public class Lebensmittelsuche implements Suche {
	// TODO fix code
	private LebensmittelsucheDao lebensmittelDao = new LebensmittelsucheDao("test");
	// TODO kategorieDao erstellen.
//	private KategorieDao kategorieDao = new KategorieDao("test");  <--- in etwa so 
	private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());

	/**
	 * Rufe die Methode getLebensmittelInfoByName auf.
	 * 
	 * @param lebensmittelName das gesuchte Lebensmittel
	 * @throws SQLException 
	 */
	public Lebensmitteldaten getLebensmittelInfoByName(String lebensmittelName) throws SQLException {
		Lebensmitteldaten lebensmittel = null;
		if (lebensmittelName != null) {
				lebensmittel = lebensmittelDao.getLebensmittel(lebensmittelName);
				// TODO: Bessere Lösung für error = null finden. Eigene exception erstellen. 
				if(lebensmittel == null) {
					throw new RuntimeErrorException(null, "Lebensmittel existiert nicht");
				}
		}

		return lebensmittel;
	}

	/**
	 * Rufe die Methode getLebensmittelInfoByKategorie auf.
	 * 
	 * @param kategorieName die gesuchte Kategorie
	 * @param lebensmittelName das gesuchte Lebensmittel
	 */
	public List<Lebensmitteldaten> getLebensmittelInfoByKategorie(String kategorieName) {
		List<Lebensmitteldaten> kategorie = null;
		if (kategorieName != null) {
			// TODO fix code
			// kategorie = sucheDao.getKategorie(kategorieName);
		}
		return kategorie;
	}

	@Override
	public Lebensmitteldaten getLebensmittelInfoByKategorie(String kategorieName, String lebensmittelName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lebensmitteldaten getLebensmittelInfoBySuchfilter(String suchwort) {
		// TODO Auto-generated method stub
		return null;
	}
}