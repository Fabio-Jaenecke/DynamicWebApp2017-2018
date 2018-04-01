package datenbank.creation;

import java.sql.SQLException;
import java.sql.Statement;

import datenbank.connector.DbConnector;

public class DbCreation implements DbCreationInterface {

	DbConnector conn = new DbConnector();
	
	public DbCreation() {
		
	}
	
	@Override
	public void setUpTables() {
		setUpTableLebensmitteldaten();
		setUpTableZugriffsskala();
		setUpTableLebensmittelkategorie();
		setUpTableNaehrstoff();
		setUpTableFavorit();
		setUpTableKatzugehoerigkeit();
		setUpTableEnhaelt();
		setUpTableNaehrzugehoerigkeit();
	}

	@Override
	public void setUpTableLebensmitteldaten() {
		// TODO Auto-generated method stub
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table lebensmitteldaten if exists");
			statement.execute("CREATE TABLE lebensmitteldaten(lindex int(4) primary key, lname varchar(100),"
				+ " karenzphase varchar(100), dauerernaehrung varchar(100));");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void setUpTableZugriffsskala() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table zugriffsskala if exists");
			statement.execute("CREATE TABLE zugriffsskala(zindex int(3) primary key, platzierung int(3),"
					+ " aZugriffe int(3));");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void setUpTableLebensmittelkategorie() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table lebensmittelkategorie if exists");
			statement.execute("CREATE TABLE lebensmittelkategorie(kindex int(4) primary key, kname varchar(100));");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public void setUpTableNaehrstoff(){
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table naehrstoff if exists");
			statement.execute("CREATE TABLE naehrstoff(nname varchar(100) primary key);");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Override
	public void setUpTableFavorit() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table favorit if exists");
			statement.execute("CREATE TABLE favorit(zindex int(3), lindex int(4), primary key(zindex, lindex),"
					+ "foreign key(zindex) references zugriffsskala, foreign key(lindex) references lebensmitteldaten);");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void setUpTableKatzugehoerigkeit() {
		try {
			Statement statement = conn.getConn().createStatement();
			statement.execute("drop table katzugehoerigkeit if exists");
			statement.execute("CREATE TABLE katzugehoerigkeit(lindex int(4), kindex int(4),"
					+ " primary key(lindex, kindex),foreign key(kindex) references lebensmittelkategorie"
					+ ", foreign key(lindex) references lebensmitteldaten);");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void setUpTableEnhaelt() {
		try {
			Statement statement = conn.getConn().createStatement();
			statement.execute("drop table enthaelt if exists");
			statement.execute("CREATE TABLE enthaelt(kindex int(4), nname varchar(100), primary key(kindex, nname),"
					+ " foreign key(kindex) references lebensmittelkategorie, "
					+ "foreign key(nname) references naehrstoff);");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void setUpTableNaehrzugehoerigkeit() {
		try {
			Statement statement = conn.getConn().createStatement();
			statement.execute("drop table enthaelt if exists");
			statement.execute("CREATE TABLE enthaelt(kindex int(4), nname varchar(100), primary key(kindex, nname),"
					+ " foreign key(kindex) references lebensmittelkategorie, "
					+ "foreign key(nname) references naehrstoff);");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
