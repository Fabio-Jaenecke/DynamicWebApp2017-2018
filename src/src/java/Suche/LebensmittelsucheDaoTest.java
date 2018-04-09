package Suche;

import static org.junit.Assert.*;

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
public class LebensmittelsucheDaoTest {
	static Lebensmittelmanager lebensmittelliste;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		lebensmittelliste = new Lebensmittelmanager();
	}
	
	@Test
	public void testLebensmittelApfelHinzugefuegt() {
		Lebensmitteldaten apfel = new Lebensmitteldaten(1,"Apfel", "mittel","gut","Obst"); 
		lebensmittelliste.lebensmittelHinzufuegen(apfel);
		assertEquals(1, lebensmittelliste.gibAbzahlLebensmittel());
	}

	@Test
	public void testSucheLebensmittelNameApfelGefunden() {
		Lebensmitteldaten lebensmittel = lebensmittelliste.getLebensmittelInfoByName("Apfel");
		assertEquals("Apfel", lebensmittel.getLname());
		assertEquals("Obst", lebensmittel.getKategorie()); 
		assertEquals("mittel", lebensmittel.getKarenzphase());
		assertEquals("gut", lebensmittel.getDauerernaehrung()); 
	}
	
	@Test
	public void testSucheLebensmittelKategorieApfelGefunden() {
		Lebensmitteldaten lebensmittel = lebensmittelliste.getLebensmittelInfoByKategorie("Obst", "Apfel");
		assertEquals("Obst", lebensmittel.getKategorie());
		assertEquals("Apfel", lebensmittel.getLname());
		assertEquals("mittel", lebensmittel.getKarenzphase());
		assertEquals("gut", lebensmittel.getDauerernaehrung()); 
	}
}