package suche;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Testklasse fuer die Klasse SucheListe.
 * 
 * @author Michele Trebo, Marko Despotovic
 * @version 15.04.2018
 */


public class SucheListeTest {
	
	private SucheListe katDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		katDao = new SucheListe();
	}

	@Test
	public void test() {
		katDao.searchForString("Obst");
		
		assertNotNull(katDao.getLebensmittel());
		assertTrue("Obst".equals(katDao.getLebensmittel()));
		
		//Search attempt for a non existing entry
		katDao.searchForString("Blumen");
		assertNull(katDao.getLebensmittel());
	}

}
