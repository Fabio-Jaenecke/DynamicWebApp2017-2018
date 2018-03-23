package datenbank;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

/*
 * unit test for testing connection and usage of database
 * in DatabaseConnector.java
 * TODO write tests
 */
public class DatabaseConnectorTest {

	//TODO add stub for database connector
	private DatabaseConnector conn;
	
	//TODO throw exception
	@BeforeEach
	void setUp() throws Exception {
		conn = new DatabaseConnector();
	}
	
	//TODO write test
	@Test
	public void testConnection() {
		assertNotNull(conn);
	}

	//TODO write test
	//TODO get count of tables in database
	@Test
	public void testCreationOfTables() {
		fail("Not yet implemented");
	}
	
	//TODO write test
	@Test
	public void testTableLebensmittedatenl() {
		fail("Not yet implemented");
	}
	
	//TODO write test
	@Test
	public void testTableZugriffsskala() {
		fail("Not yet implemented");
	}
	
	//TODO write test
	@Test
	public void testTableLebensmittelkategorie() {
		fail("Not yet implemented");
	}
	
	//TODO write test
	@Test
	public void testTableKategorieneinteilung(){
		fail("Not yet implemented");
	}
	
	//TODO write test
	@Test
	public void testTableNaehrstoff() {
		fail("Not yet implemented");
	}
	
	//TODO write test
	@Test
	public void testTableFavorit() {
		fail("Not yet implemented");
	}
	
	//TODO write test
	@Test
	public void testTableKatzugehoerigkeit() {
		fail("Not yet implemented");
	}
	
	//TODO write test
	@Test
	public void testTableEnhaelt() {
		fail("Not yet implemented");
	}
	
	//TODO write test
	@Test
	public void testTableNaehrzugehoerigkeit() {
		fail("Not yet implemented");
	}

}
