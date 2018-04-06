package datenbank.insertion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import datenbank.creation.DbCreation;
import datenbank.dao.DbQuery;

/*
 * tests class DbInsertion.java
 */
public class DbInsertionTest {

	// to not have any double entries, we first create the database
	DbCreation creation = new DbCreation();
	DbInsertion insert = new DbInsertion();
	DbQuery query = new DbQuery();
	
	@Before
	public void setUp() throws Exception {
		creation.setUpTables();
		insert.insertIntoTables();
	}

	@Test
	public void testInsertIntoTableLebensmitteldaten() {
		assertNotNull(query.getResult("select * from lebensmitteldaten"));
	}

	@Test
	public void testInsertIntoTableZugriffsskala() {
		assertNotNull(query.getResult("select * from zugriffsskala"));
	}

	@Test
	public void testInsertIntoTableLebensmittelkategorie() {
		assertNotNull(query.getResult("select * from lebensmitteldaten"));
	}

	@Test
	public void testInsertIntoTableNaehrstoff() {
		assertNotNull(query.getResult("select * from naehrstoff"));	}

	@Test
	public void testInsertIntoTableFavorit() {
		assertNotNull(query.getResult("select * from favorit"));	}

	@Test
	public void testInsertIntoTableKatzugehoerigkeit() {
		assertNotNull(query.getResult("select * from katzugehoerigkeit"));	}

	@Test
	public void testInsertIntoTableEnhaelt() {
		assertNotNull(query.getResult("select * from enthaelt"));	}

	@Test
	public void testInsertIntoTableNaehrzugehoerigkeit() {
		assertNotNull(query.getResult("select * from naehrzugehoerigkeit"));	}

}
