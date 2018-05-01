package suche;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Testklasse fuer die Klasse SucheEintrag.
 * 
 * @author Michele Trebo, Marko Despotovic
 * @version 09.04.2018
 */

public class SucheEintragTest {
  
  private SucheEintrag dao;
  
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }
  
  @Before
  // Creates new Database for the search option
  public void setUp() throws Exception {
    dao = new SucheEintrag();
  }
  
  @Test
  // Testing if the search method gives a result back
  public void searchForStringTest() {
    dao.searchForString("apfel");
    
    assertNotNull(dao.getLebensmittel());
    assertTrue("Apfel".equals(dao.getLebensmittel().getLname()));
    
    // Search attempt for a non existing entry
    dao.searchForString("Pizza");
    assertNull(dao.getLebensmittel());
  }
  
}
