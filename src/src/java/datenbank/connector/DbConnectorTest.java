package datenbank.connector;

import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Before;
import org.junit.Test;

/*
 * unit test for testing connection details to database
 * and for receiving result sets of tables
 * the class under test is represented by a stub
 * TODO add database connection for not empty result sets.
 */
public class DbConnectorTest {

	private DbConnectorStub conn;
	
	/**
	 * setup for unit test of database connector class
	 * we don't use a logger since it's only a unit test
	 */
	@Before
	public void setUp() {
		try {
			conn = new DbConnectorStub();
		}
		catch(Exception e){
			System.out.println("Exception occured while setting up unit test");
		}
	}
	
	@Test
	public void testConnection() {
		assertTrue(conn.establishH2DBConnection());
		assertNotNull(conn);
	}

	@Test
	public void url() {
		assertEquals(conn.getDB_Connection(), "jdbc:h2:~/histarantia");
	}
	
	//TODO write test
	//TODO get count of tables in database
	@Test
	public void driver() {
		assertEquals(conn.getDB_Driver(), "org.h2.Driver");
	}
	
	@Test
	public void userAndPassword() {
		assertEquals(conn.getDB_User(), "user");
		assertEquals(conn.getDB_Password(), "");
	}
	
	//TODO write test
	@Test
	public void testTableLebensmittedaten() {
		String sql = "select * from lebensmitteldaten";
		ResultSet res = conn.getResultSet(sql);
		assertNotNull(res);
	}
	
	//TODO write test
	@Test
	public void testTableZugriffsskala() {
		String sql = "select * from zugriffsskala";
		ResultSet res = conn.getResultSet(sql);
		assertNotNull(res);
	}
	
	//TODO write test
	@Test
	public void testTableLebensmittelkategorie() {
		String sql = "select * from lebensmittelkategorie";
		ResultSet res = conn.getResultSet(sql);
		assertNotNull(res);
	}
	
	
	//TODO write test
	@Test
	public void testTableNaehrstoff() {
		String sql = "select * from naehrstoff";
		ResultSet res = conn.getResultSet(sql);
		assertNotNull(res);
	}
}

