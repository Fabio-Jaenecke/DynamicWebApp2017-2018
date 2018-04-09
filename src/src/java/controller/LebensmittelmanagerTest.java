package controller;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import controller.Lebensmittelmanager;
import datenbank.container.Lebensmitteldaten;

/**
 * Testklasse f�r die Klasse Lebensmittelmanager.
 *
 * @author Michele Trebo
 * @version 09.04.2018 
 */
public class LebensmittelmanagerTest {
	static Lebensmittelmanager lebensmittelliste; 

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		lebensmittelliste = new Lebensmittelmanager(); 
	}

	@Test
	public void testAddLebensmittelApfel() {
		Lebensmitteldaten apfel = new Lebensmitteldaten(1,"Apfel", "verschieden","vertraeglich","Obst"); 
		lebensmittelliste.lebensmittelHinzufuegen(apfel);
		assertEquals(1, lebensmittelliste.gibAbzahlLebensmittel());
	}

	@Test 
	public void testLebensmittelApfelAusgeben() {
		Lebensmitteldaten lebensmittel = lebensmittelliste.getLebensmittelInfoByName("Apfel");
		assertEquals("Apfel", lebensmittel.getLname());
	}
	
	@Test
	public void testEntferneLebensmittelApfel() {
		lebensmittelliste.entferneLebensmittel(1);
		assertEquals(0, lebensmittelliste.gibAbzahlLebensmittel());
	}
	
	@Test 
	public void testGetKategorieApfel() {
		assertEquals("Obst", lebensmittelliste.getKategorie("Apfel"));
	}
	
	@Test 
	public void testGetKarenzphaseApfel() {
		assertEquals("verschieden", lebensmittelliste.getKarenzphase("Apfel"));
	}
	
	@Test
	public void testGetDauerernaehrungApfel() {
		assertEquals("vertraeglich", lebensmittelliste.getDauerernaehrung("Apfel"));
	}

}