package datenbank.connector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit-Test zum Testen der Verbindungsdetails zur Datenbank.
 */
public class DbConnectorTest {

	private DbConnectorStub conn = new DbConnectorStub();
	
	/**
	 * Wir initialisieren nur eine Verbindung, ohne Dinge im Setup. 
	 */
	@Before
	public void setUp() {
		
	}
	
	// Teste die Datenbankverbindung.
	@Test
	public void testConnection() {
		assertTrue(conn.establishH2DBConnection());
	}

	// Teste ob die URL korrekt ist. 
	@Test
	public void url() {
		assertEquals(conn.getDB_Connection(), "jdbc:h2:~/histarantia");
	}
	
	// Teste ob der richtige Driver gebraucht wird.
	@Test
	public void driver() {
		assertEquals(conn.getDB_Driver(), "org.h2.Driver");
	}
	
	// Teste ob der Benutzername und das Passwort korrekt sind. 
	@Test
	public void userAndPassword() {
		assertEquals(conn.getDB_User(), "user");
		assertEquals(conn.getDB_Password(), "");
	}
}

