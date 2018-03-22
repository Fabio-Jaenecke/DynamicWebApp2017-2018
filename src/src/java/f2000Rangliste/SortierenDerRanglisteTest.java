/**
 * 
 */
package f2000Rangliste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import f2000Rangliste.SortierenDerRangliste;

/**
 * tests class AufAbSortierung
 * @author Raphael
 *
 */
public class SortierenDerRanglisteTest {

	private SortierenDerRangliste sort;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		sort = new SortierenDerRangliste();
		sort.befuelleSortierungMitLebensmitteln();
	}

	/**
	 * Test method for sortiereAufsteigend()
	 */
	@Test
	void testSortiereAufsteigend() {
		sort.sortiereAbsteigend();
		assertNotNull(sort.getLebensmittel());
	}

	/**
	 * Test method for sortiereAbsteigend()
	 */
	@Test
	void testSortiereAbsteigend() {
		sort.sortiereAufsteigend();
		assertNotNull(sort.getLebensmittel());
	}

}
