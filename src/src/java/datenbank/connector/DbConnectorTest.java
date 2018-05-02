package datenbank.connector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit-Test zum Testen der Verbindungsdetails zur Datenbank.
 */
public class DbConnectorTest {
  
  private DbConnector conn;
  
  /**
   * Wir initialisieren nur eine Verbindung, ohne Dinge im Setup.
   */
  @Before
  public void setUp() {
    conn = new DbConnector();
  }
  
  /*
   * make connection. assert that connection is not null and has been registred by variable connInit
   */
  @Test
  public void testConnection() {
    conn.establishH2DBConnection();
    assertNotNull(conn.getConn());
    assertEquals(true, conn.isConnInit());
  }
  
  /*
   * assert that variable connInit is registred to true
   */
  @Test(expected = AssertionError.class)
  public void testConnInit() {
    assertEquals(false, conn.isConnInit());
    
  }
  
  /*
   * close connection, assert it has been registred by variable connInit
   */
  @Test
  public void testCloseConnection() {
    conn.closeConnection();
    assertEquals(false, conn.isConnInit());
  }
  
  /*
   * reopen connection. assert that connection is not null and has been registred by variable connInit
   */
  @Test
  public void testReopenConnection() {
    conn.establishH2DBConnection();
    assertNotNull(conn.getConn());
    assertEquals(true, conn.isConnInit());
  }
  
  /*
   * close connection after tests have been done
   */
  @After
  public void tearDown() {
    conn.closeConnection();
  }
}
