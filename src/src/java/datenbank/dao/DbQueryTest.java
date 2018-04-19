package datenbank.dao;

import static org.junit.Assert.*;

import java.sql.ResultSet;

import org.junit.Before;
import org.junit.Test;

/*
 * Class for testing if the tables are filled with content
 */

public class DbQueryTest {

	DbQuery dbQuery;

	@Before
	public void setUp() throws Exception {
		dbQuery = new DbQuery();
	}

	// Testing if table lebensmittelDaten is not empty
	@Test
	public void testTableLebensmittledaten() {
		String sql = "select * from lebensmittelDaten";
		ResultSet res = dbQuery.getResult(sql);
		assertNotNull(res);
	}

	// Testing if table zugriffsskala is not empty
	@Test
	public void testTableZugriffsskala() {
		String sql = "select * from zugriffsskala";
		ResultSet res = dbQuery.getResult(sql);
		assertNotNull(res);
	}

	// Testing if table zugriffsskala is not empty
	@Test
	public void testTablelebensmittelkategorie() {
		String sql = "select * from lebensmittelkategorie";
		ResultSet res = dbQuery.getResult(sql);
		assertNotNull(res);
	}

	// Testing if table naehrstoff is not empty
	@Test
	public void testTableNaehrstoff() {
		String sql = "select * from naehrstoff";
		ResultSet res = dbQuery.getResult(sql);
		assertNotNull(res);
	}
}
