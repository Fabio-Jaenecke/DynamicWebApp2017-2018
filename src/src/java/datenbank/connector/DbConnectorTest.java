package datenbank.connector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/*
 * unit test for testing connection details to database
*/
public class DbConnectorTest {

	private DbConnectorStub conn = new DbConnectorStub();
	
	/*
	 * we only instantiate a connection, so no things to do in setup
	 */
	@Before
	public void setUp() {
		
	}
	
	// Testing the connection to the database
	@Test
	public void testConnection() {
		assertTrue(conn.establishH2DBConnection());
	}

	// Testing if the url is correct
	@Test
	public void url() {
		assertEquals(conn.getDB_Connection(), "jdbc:h2:~/histarantia");
	}
	
	// Testing if the right driver is in use
	@Test
	public void driver() {
		assertEquals(conn.getDB_Driver(), "org.h2.Driver");
	}
	
	// Testing if user name and password are correct
	@Test
	public void userAndPassword() {
		assertEquals(conn.getDB_User(), "user");
		assertEquals(conn.getDB_Password(), "");
	}
}

