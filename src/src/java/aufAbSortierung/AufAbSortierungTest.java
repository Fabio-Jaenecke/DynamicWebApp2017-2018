package aufAbSortierung;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AufAbSortierungTest {

	private AufAbSortierung sort;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		sort = new AufAbSortierung();
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
