package datenbank.creation;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.DatabaseConnector;
import datenbank.connector.DbConnector;

/*
 * Class for creating tables for the database
 */

public class DbCreation implements DbCreationInterface {

	private DbConnector conn = new DbConnector();
	private static final Logger LOGGER = Logger.getLogger(DatabaseConnector.class.getName());
	
	public DbCreation() {
		setUpTables();
	}
	
	// All the tables for the database
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

	// Creating table "lebensmitteldaten"
	@Override
	public void setUpTableLebensmitteldaten() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table lebensmitteldaten if exists");
			statement.execute("CREATE TABLE lebensmitteldaten(lindex int(4) primary key, lname varchar(100),"
				+ " karenzphase varchar(100), dauerernaehrung varchar(100));");
			
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, " Exception occured during creation of table ", e);
		}
		
	}

	// Creating table "zugriffsskala"
	@Override
	public void setUpTableZugriffsskala() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table zugriffsskala if exists");
			statement.execute("CREATE TABLE zugriffsskala(zindex int(3) primary key, platzierung int(3),"
					+ " aZugriffe int(3));");
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, " Exception occured during creation of table ", e);
		}
	}

	// Creating table "lebensmittelkategorie"
	@Override
	public void setUpTableLebensmittelkategorie() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table lebensmittelkategorie if exists");
			statement.execute("CREATE TABLE lebensmittelkategorie(kindex int(4) primary key, kname varchar(100));");
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "table lebensmittelkategorie could not be resolved " + e);
		}		
	}

	// Creating table "naehrstoff"
	@Override
	public void setUpTableNaehrstoff(){
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table naehrstoff if exists");
			statement.execute("CREATE TABLE naehrstoff(nname varchar(100) primary key);");
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, " Exception occured during creation of table ", e);
		}	
	}

	// Creating table "favorit"
	@Override
	public void setUpTableFavorit() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table favorit if exists");
			statement.execute("CREATE TABLE favorit(zindex int(3), lindex int(4), primary key(zindex, lindex),"
					+ "foreign key(zindex) references zugriffsskala, foreign key(lindex) references lebensmitteldaten);");
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, " Exception occured during creation of table ", e);
		}
	}

	// Creating table "katzugehoerigkeit"
	@Override
	public void setUpTableKatzugehoerigkeit() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table katzugehoerigkeit if exists");
			statement.execute("CREATE TABLE katzugehoerigkeit(lindex int(4), kindex int(4),"
					+ " primary key(lindex, kindex),foreign key(kindex) references lebensmittelkategorie"
					+ ", foreign key(lindex) references lebensmitteldaten);");
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, " Exception occured during creation of table ", e);
		}
		
	}

	// Creating table "enthaelt"
	@Override
	public void setUpTableEnhaelt() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table enthaelt if exists");
			statement.execute("CREATE TABLE enthaelt(kindex int(4), nname varchar(100), primary key(kindex, nname),"
					+ " foreign key(kindex) references lebensmittelkategorie, "
					+ "foreign key(nname) references naehrstoff);");
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, " Exception occured during creation of table ", e);
		}
	}

	// Creating table "naehrzugehoerigkeit"
	@Override
	public void setUpTableNaehrzugehoerigkeit() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table naehrzugehoerigkeit if exists");
			statement.execute("CREATE TABLE naehrzugehoerigkeit(lindex int(4), nname varchar(100), primary key(lindex, nname)," 
					+ " foreign key(lindex) references lebensmitteldaten, foreign key(nname) references naehrstoff);");
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, " Exception occured during creation of table ", e);
		}
	}
	

}
