package suche.updater;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import datenbank.container.Zugriffsskala;

public class PlatzierungUpdaterTest {

	PlatzierungUpdater updater = new PlatzierungUpdater();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetZugriffeInDB() {
		fail("Not yet implemented");
	}

	@Test
	public void testSortByAZugriffe() {
		updater.sortByAZugriffe();
		for(Zugriffsskala zugriff: updater.getZugriffe()){
			System.out.println(zugriff.getAzugriffe());
		}
	}

	@Test
	public void testPutToDb() {
		fail("Not yet implemented");
	}

}
