package datenbank.creation;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import datenbank.dao.DbQuery;

/**
 * Testklasse DbCreation
 * Bestaetigt, dass Tabellen erstellt werden. 
 */
public class DbCreationTest {

	// Um keine doppelten Eintraege zu erhalten, erstellen wir zuerst die Datenbank. 
	DbCreation creation = new DbCreation();
	DbQuery query = new DbQuery();
	
	@Before
	public void setUp() throws Exception {
		creation.setUpTables();
	}

	// Testen der create table-Anweisungen fuer die Tabelle lebensmittelDaten.
	@Test
	public void testSetUpTablelebensmittelDaten() {
		assertNotNull(query.getResult("select 1 from lebensmittelDaten"));
	}

	// Die create table-Anweisungen fuer die Tabelle zugriffsskala testen.
	@Test
	public void testSetUpTableZugriffsskala() {
		assertNotNull(query.getResult("select 1 from zugriffsskala"));
	}

	// Testen der create table-Anweisungen fuer die Tabelle lebensmittelkategorie. 
	@Test
	public void testSetUpTablelebensmittelkategorie() {
		assertNotNull(query.getResult("select 1 from lebensmittelkategorie"));
	}

	// Testen der create table-Anweisungen fuer die Tabelle naehrstoff. 
	@Test
	public void testSetUpTableNaehrstoff() {
		assertNotNull(query.getResult("select 1 from naehrstoff"));
	}

	// Testen der create table-Anweisungen fuer die Tabelle favorit. 
	@Test
	public void testSetUpTableFavorit() {
		assertNotNull(query.getResult("select 1 from favorit"));
	}

	// Testen der create table-Anweisungen fuer die Tabelle katzugehoerigkeit.
	@Test
	public void testSetUpTableKatzugehoerigkeit() {
		assertNotNull(query.getResult("select 1 from katzugehoerigkeit"));
	}

	// Testen der create table-Anweisungen fuer die Tabelle enthaelt.
	@Test
	public void testSetUpTableEnthaelt() {
		assertNotNull(query.getResult("select 1 from enthaelt"));
	}
	
	// Testen der create table-Anweisungen fuer die Tabelle naehrzugehoerigkeit.
	@Test
	public void testSetUpTableNaehrzugehoerigkeit() {
		assertNotNull(query.getResult("select 1 from naehrzugehoerigkeit"));
	}

}
