package datenbank.container;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Zugriffsmanager {

	private String lname;
	private String karenzphase;
	private String dauerernaehrung;
	private int platzierung;
	private int azugriffe;
	private static final Logger LOGGER = Logger.getLogger(Zugriffsmanager.class.getName());

	public Zugriffsmanager(String lname, String karenzphase, String dauerernaehrung, int platzierung, int azugriffe) {
		this.lname = lname;
		this.karenzphase = karenzphase;
		this.dauerernaehrung = dauerernaehrung;
		this.platzierung = platzierung;
		this.azugriffe = azugriffe;
	}

	public Zugriffsmanager(ResultSet rs) {
		try {
			this.lname = rs.getString("lname");
			this.karenzphase = rs.getString("karenzphase");
			this.dauerernaehrung = rs.getString("dauerernaehrung");
			this.platzierung = rs.getInt("platzierung");
			this.azugriffe = rs.getInt("azugriffe");
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Result set of zugriffsmanager could not be resolved " + e);
		}
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getKarenzphase() {
		return karenzphase;
	}

	public void setKarenzphase(String karenzphase) {
		this.karenzphase = karenzphase;
	}

	public String getDauerernaehrung() {
		return dauerernaehrung;
	}

	public void setDauerernaehrung(String dauerernaehrung) {
		this.dauerernaehrung = dauerernaehrung;
	}

	public int getPlatzierung() {
		return platzierung;
	}

	public void setPlatzierung(int platzierung) {
		this.platzierung = platzierung;
	}

	public int getAzugriffe() {
		return azugriffe;
	}

	public void setAzugriffe(int azugriffe) {
		this.azugriffe = azugriffe;
	}

}
