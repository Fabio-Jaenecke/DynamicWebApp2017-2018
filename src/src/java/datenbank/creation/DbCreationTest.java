package datenbank.creation;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import datenbank.dao.DbQuery;

/**
 * tests class DbCreation
 * asserts that tables are created
 * @author Raphael
 *
 */
public class DbCreationTest {

	// to not have any double entries, we first create the database
	DbCreation creation = new DbCreation();
	DbQuery query = new DbQuery();
	
	@Before
	public void setUp() throws Exception {
		creation.setUpTables();
	}

	// Testing the create table statements for the table lebensmitteldaten
	@Test
	public void testSetUpTableLebensmitteldaten() {
		assertNotNull(query.getResult("select 1 from lebensmitteldaten"));
	}

	// Testing the create table statements for the table zugriffsskala
	@Test
	public void testSetUpTableZugriffsskala() {
		assertNotNull(query.getResult("select 1 from zugriffsskala"));
	}

	// Testing the create table statements for the table lebensmittelkategorie
	@Test
	public void testSetUpTableLebensmittelkategorie() {
		assertNotNull(query.getResult("select 1 from lebensmittelkategorie"));
	}

	// Testing the create table statements for the table naehrstoff
	@Test
	public void testSetUpTableNaehrstoff() {
		assertNotNull(query.getResult("select 1 from naehrstoff"));
	}

	// Testing the create table statements for the table favorit
	@Test
	public void testSetUpTableFavorit() {
		assertNotNull(query.getResult("select 1 from favorit"));
	}

	// Testing the create table statements for the table katzugehoerigkeit
	@Test
	public void testSetUpTableKatzugehoerigkeit() {
		assertNotNull(query.getResult("select 1 from katzugehoerigkeit"));
	}

	// Testing the create table statements for the table enthaelt
	@Test
	public void testSetUpTableEnthaelt() {
		assertNotNull(query.getResult("select 1 from enthaelt"));
	}
	
	// Testing the create table statements for the table naehrzugehoerigkeit
	@Test
	public void testSetUpTableNaehrzugehoerigkeit() {
		assertNotNull(query.getResult("select 1 from naehrzugehoerigkeit"));
	}

}
