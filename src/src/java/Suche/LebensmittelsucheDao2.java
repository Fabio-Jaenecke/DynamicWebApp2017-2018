package Suche;

import java.sql.ResultSet;

import datenbank.container.Lebensmitteldaten;
import datenbank.dao.DbQuery;

public class LebensmittelsucheDao2 {

	private Lebensmitteldaten lebensmittel;
	DbQuery query = new DbQuery();
	
	public LebensmittelsucheDao2() {
		
	}
	
	public void searchForString(String lebensmittelname) {
		String selectSQL = "select * from lebensmitteldaten where lname like '%" + lebensmittelname + "%';";
		ResultSet result = query.getResult(selectSQL);
		lebensmittel = new Lebensmitteldaten(result);
	}

	public Lebensmitteldaten getLebensmittel() {
		return lebensmittel;
	}
}
