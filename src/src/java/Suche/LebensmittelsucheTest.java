package Suche;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import controller.Lebensmittelmanager;
import datenbank.container.Lebensmitteldaten;

/**
 * Testklasse für die Klasse Lebensmittelsuche.
 *
 * @author mjtre
 * @version 22.03.2018 
 */
public class LebensmittelsucheTest {
	static Lebensmittelmanager lebensmittelListe;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		lebensmittelListe = new Lebensmittelmanager();
	}

	@Test
	public void testAddLebensmittelApfel() {
		Lebensmitteldaten apfel = new Lebensmitteldaten(1,"Apfel", "verschieden","vertraeglich","Obst"); 
		assertEquals(1, lebensmittelListe.gibAbzahlLebensmittel());
	}

	@Test
	public void testSucheLebensmittelApfelGefunden() {
		Lebensmitteldaten lebensmittel = lebensmittelListe.getLebensmittelInfoByName("Apfel");
		assertEquals("Apfel", lebensmittel.getLname());
		assertEquals("verschieden", lebensmittel.getKarenzphase());
		assertEquals("vertraeglich", lebensmittel.getDauerernaehrung()); 
		assertEquals("Obst", lebensmittel.getKategorie()); 
	}
}
