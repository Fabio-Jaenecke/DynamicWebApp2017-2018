package Suche;

import java.sql.ResultSet;
import java.sql.SQLException;

import datenbank.container.Lebensmitteldaten;
import datenbank.dao.DbQuery;

public class LebensmittelsucheDao {
	
	DbQuery query = new DbQuery();
	
	public LebensmittelsucheDao() {
		
	}
		
//	TODO: replace query with prepared statements
	public Lebensmitteldaten getLebensmittel(String lebensmittel) {
		String query = "select * from lebensmitteldaten where lebensmittel = " + lebensmittel;
		 ResultSet rs = this.query.getResult(query);
		 Lebensmitteldaten lebensmitteldaten = null;
		try {
			lebensmitteldaten = rs.getObject(0) == null ? null : (Lebensmitteldaten) rs.getObject(0);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return lebensmitteldaten;
	}
}
