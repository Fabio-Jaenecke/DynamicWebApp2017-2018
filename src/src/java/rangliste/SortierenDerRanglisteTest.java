/**
 * 
 */
package rangliste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import rangliste.SortierenDerRangliste;

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
		// TODO add method befuelleSortierungMitLebensmitteln() in SortierenDerRangliste.java 
		// sort.befuelleSortierungMitLebensmitteln();
	}

	/**
	 * Test method for sortiereAufsteigend()
	 */
	@Test
	void testSortiereAufsteigend() {
		sort.sortiereAbsteigend();
		// TODO add method getLebensmittel in SortierenDerRangliste.java 
		// assertNotNull(sort.getLebensmittel());
	}

	/**
	 * Test method for sortiereAbsteigend()
	 */
	@Test
	void testSortiereAbsteigend() {
		sort.sortiereAufsteigend();
		// TODO add method getLebensmittel in SortierenDerRangliste.java 
		// assertNotNull(sort.getLebensmittel());
	}

}
