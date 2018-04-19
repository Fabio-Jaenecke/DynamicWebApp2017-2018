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

	// Testing the insert statements for the table lebensmittelDaten
	@Test
	public void testInsertIntoTablelebensmittelDaten() {
		assertNotNull(query.getResult("select * from lebensmittelDaten"));
	}

	// Testing the insert statements for the table zugriffsskala
	@Test
	public void testInsertIntoTableZugriffsskala() {
		assertNotNull(query.getResult("select * from zugriffsskala"));
	}

	// Testing the insert statements for the table lebensmittelkategorie
	@Test
	public void testInsertIntoTablelebensmittelkategorie() {
		assertNotNull(query.getResult("select * from lebensmittelkategorie"));
	}

	// Testing the insert statements for the table naehrstoff
	@Test
	public void testInsertIntoTableNaehrstoff() {
		assertNotNull(query.getResult("select * from naehrstoff"));	}

	// Testing the insert statements for the table favorit
	@Test
	public void testInsertIntoTableFavorit() {
		assertNotNull(query.getResult("select * from favorit"));	}

	// Testing the insert statements for the table katzugehoerigkeit
	@Test
	public void testInsertIntoTableKatzugehoerigkeit() {
		assertNotNull(query.getResult("select * from katzugehoerigkeit"));	}

	// Testing the insert statements for the table enthaelt
	@Test
	public void testInsertIntoTableEnthaelt() {
		assertNotNull(query.getResult("select * from enthaelt"));	}

	// Testing the insert statements for the table naehrzugehoerigkeit
	@Test
	public void testInsertIntoTableNaehrzugehoerigkeit() {
		assertNotNull(query.getResult("select * from naehrzugehoerigkeit"));	}

}
