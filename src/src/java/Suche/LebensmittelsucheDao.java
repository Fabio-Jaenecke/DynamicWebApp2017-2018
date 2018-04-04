package Suche;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import datenbank.container.Lebensmitteldaten;
import datenbank.dao.DbQuery;

public class LebensmittelsucheDao {
	
	DbQuery query;
	private List<Lebensmitteldaten> lebensmitteldaten;
	
	public LebensmittelsucheDao() {
		query = new DbQuery();
		
	}
		
//	TODO: replace query with prepared statements
	public Lebensmitteldaten getLebensmittel(String lebensmittelname) {
		String query = "select * from lebensmitteldaten where lname = '" + lebensmittelname + "'";
		 ResultSet rs = this.query.getResult(query);
		 Lebensmitteldaten lebensmitteldaten = null;
		try {
			lebensmitteldaten = rs.getObject(0) == null ? null : (Lebensmitteldaten) rs.getObject(0);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return lebensmitteldaten;
	}

//	TODO: replace query with prepared statements
	public List<Lebensmitteldaten> getKategorie(String kategorie) {
		String query = "select * from lebensmitteldaten where kategorie = " + kategorie;
		 ResultSet rs = this.query.getResult(query);
		 lebensmitteldaten = null;
		try {
				lebensmitteldaten.add(new Lebensmitteldaten(rs));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return lebensmitteldaten;
	}

	/**
	 * @return the lebensmitteldaten
	 */
	public List<Lebensmitteldaten> getLebensmitteldaten() {
		return lebensmitteldaten;
	}

	/**
	 * @param lebensmitteldaten the lebensmitteldaten to set
	 */
	public void setLebensmitteldaten(List<Lebensmitteldaten> lebensmitteldaten) {
		this.lebensmitteldaten = lebensmitteldaten;
	}	
}
