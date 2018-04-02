package Suche;

import java.sql.ResultSet;

import datenbank.container.Lebensmitteldaten;
import datenbank.dao.DbQuery;

public class LebensmittelsucheDao {
	
	DbQuery query = new DbQuery();
	
	public LebensmittelsucheDao() {
		
	}
	
	// TODO fix method or remove it
	/*
	public Lebensmitteldaten getLebensmittel(String lebensmittel) {
		String query = "select * from lebensmitteldaten where lebensmittel = " + lebensmittel;
		// TODO fix method getResult(query) 
		// ResultSet rs = query.getResult(query);
		// Lebensmitteldaten lebensmitteldaten = new Lebensmitteldaten(rs);
		// return lebensmitteldaten;
	}*/
}
