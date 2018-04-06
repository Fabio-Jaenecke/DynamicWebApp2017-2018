package datenbank.creation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DbCreationTest {

	DbCreation creation = new DbCreation();
	
	@Before
	public void setUp() throws Exception {
		creation.setUpTables();
	}

	@Test
	public void testSetUpTableLebensmitteldaten() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUpTableZugriffsskala() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUpTableLebensmittelkategorie() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUpTableNaehrstoff() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUpTableFavorit() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUpTableKatzugehoerigkeit() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUpTableEnhaelt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUpTableNaehrzugehoerigkeit() {
		fail("Not yet implemented");
	}

}
