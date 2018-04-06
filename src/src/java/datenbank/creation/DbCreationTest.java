package datenbank.creation;

import static org.junit.Assert.*;

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

	DbCreation creation = new DbCreation();
	DbQuery query = new DbQuery();
	
	@Before
	public void setUp() throws Exception {
		creation.setUpTables();
	}

	@Test
	public void testSetUpTableLebensmitteldaten() {
		assertNotNull(query.getResult("select 1 from lebensmitteldaten"));
	}

	@Test
	public void testSetUpTableZugriffsskala() {
		assertNotNull(query.getResult("select 1 from zugriffsskala"));
	}

	@Test
	public void testSetUpTableLebensmittelkategorie() {
		assertNotNull(query.getResult("select 1 from lebensmittelkategorie"));
	}

	@Test
	public void testSetUpTableNaehrstoff() {
		assertNotNull(query.getResult("select 1 from naehrstoff"));
	}

	@Test
	public void testSetUpTableFavorit() {
		assertNotNull(query.getResult("select 1 from favorit"));
	}

	@Test
	public void testSetUpTableKatzugehoerigkeit() {
		assertNotNull(query.getResult("select 1 from katzugehoerigkeit"));
	}

	@Test
	public void testSetUpTableEnhaelt() {
		assertNotNull(query.getResult("select 1 from enthaelt"));
	}

	@Test
	public void testSetUpTableNaehrzugehoerigkeit() {
		assertNotNull(query.getResult("select 1 from naehrzugehoerigkeit"));
	}

}
