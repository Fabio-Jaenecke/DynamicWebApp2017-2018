/**
 * 
 */
package aufAbSortierung;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * tests class AufAbSortierung
 * @author Raphael
 *
 */
class AufAbSortierungTest {

	private AufAbSortierung sort;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		sort = new AufAbSortierung();
		sort.befülleSortierungMitLebensmitteln();
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
