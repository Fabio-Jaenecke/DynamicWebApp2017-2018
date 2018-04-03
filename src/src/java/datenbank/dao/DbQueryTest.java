package datenbank.dao;

import static org.junit.Assert.*;

import java.sql.ResultSet;

import org.junit.Before;
import org.junit.Test;

public class DbQueryTest {

	DbQuery dbQuery;

	@Before
	public void setUp() throws Exception {
		dbQuery = new DbQuery();
	}

	@Test
	public void testTableLebensmittledaten() {
		String sql = "select * from lebensmitteldaten";
		ResultSet res = dbQuery.getResult(sql);
		assertNotNull(res);
	}

	@Test
	public void testTableZugriffsskala() {
		String sql = "select * from zugriffsskala";
		ResultSet res = dbQuery.getResult(sql);
		assertNotNull(res);
	}

	@Test
	public void testTableLebensmittelkategorie() {
		String sql = "select * from lebensmittelkategorie";
		ResultSet res = dbQuery.getResult(sql);
		assertNotNull(res);
	}

	@Test
	public void testTableNaehrstoff() {
		String sql = "select * from naehrstoff";
		ResultSet res = dbQuery.getResult(sql);
		assertNotNull(res);
	}
}
