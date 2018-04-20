package datenbank.creation;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnector;

/*
 * Class for creating tables for the database
 */

public class DbCreation implements DbCreationInterface {

	private DbConnector conn = new DbConnector();
	private static final Logger LOGGER = Logger.getLogger(DbCreation.class.getName());
	private static final String errorMessage = "exception occured during creation of table";
	
	public DbCreation() {
		setUpTables();
	}
	
	/*
	 *  All the tables for the database
	 * @see datenbank.creation.DbCreationInterface#setUpTables()
	 */
	@Override
	public void setUpTables() {
		setUpTablelebensmittelDaten();
		setUpTableZugriffsskala();
		setUpTablelebensmittelkategorie();
		setUpTableNaehrstoff();
		setUpTableFavorit();
		setUpTableKatzugehoerigkeit();
		setUpTableEnthaelt();
		setUpTableNaehrzugehoerigkeit();
	}

	/*
	 *  Creating table "lebensmittelDaten"
	 * @see datenbank.creation.DbCreationInterface#setUpTablelebensmittelDaten()
	 */
	@Override
	public void setUpTablelebensmittelDaten() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table lebensmittelDaten if exists");
			statement.execute("CREATE TABLE lebensmittelDaten(lindex int(4) primary key, lname varchar(100),"
				+ " karenzphase varchar(100), dauerernaehrung varchar(100));");
			
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, errorMessage, e);
		}
		
	}

	/*
	 *  Creating table "zugriffsskala"
	 * @see datenbank.creation.DbCreationInterface#setUpTableZugriffsskala()
	 */
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
			LOGGER.log(Level.SEVERE, errorMessage, e);
		}
	}

	/*
	 *  Creating table "lebensmittelkategorie"
	 * @see datenbank.creation.DbCreationInterface#setUpTablelebensmittelkategorie()
	 */
	@Override
	public void setUpTablelebensmittelkategorie() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table lebensmittelkategorie if exists");
			statement.execute("CREATE TABLE lebensmittelkategorie(kindex int(4) primary key, kname varchar(100));");
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE,  errorMessage, e);
		}		
	}

	/*
	 *  Creating table "naehrstoff"
	 * @see datenbank.creation.DbCreationInterface#setUpTableNaehrstoff()
	 */
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
			LOGGER.log(Level.SEVERE,  errorMessage, e);
		}	
	}

	/*
	 *  Creating table "favorit"
	 * @see datenbank.creation.DbCreationInterface#setUpTableFavorit()
	 */
	@Override
	public void setUpTableFavorit() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table favorit if exists");
			statement.execute("CREATE TABLE favorit(zindex int(3), lindex int(4), primary key(zindex, lindex),"
					+ "foreign key(zindex) references zugriffsskala, foreign key(lindex) references lebensmittelDaten);");
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, errorMessage, e);
		}
	}

	/*
	 *  Creating table "katzugehoerigkeit"
	 * @see datenbank.creation.DbCreationInterface#setUpTableKatzugehoerigkeit()
	 */
	@Override
	public void setUpTableKatzugehoerigkeit() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table katzugehoerigkeit if exists");
			statement.execute("CREATE TABLE katzugehoerigkeit(lindex int(4), kindex int(4),"
					+ " primary key(lindex, kindex),foreign key(kindex) references lebensmittelkategorie"
					+ ", foreign key(lindex) references lebensmittelDaten);");
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, errorMessage, e);
		}
		
	}

	/*
	 *  Creating table "enthaelt"
	 * @see datenbank.creation.DbCreationInterface#setUpTableEnhaelt()
	 */
	@Override
	public void setUpTableEnthaelt() {
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
			LOGGER.log(Level.SEVERE, errorMessage, e);
		}
	}

	/*
	 * Creating table "naehrzugehoerigkeit"
	 * @see datenbank.creation.DbCreationInterface#setUpTableNaehrzugehoerigkeit()
	 */
	@Override
	public void setUpTableNaehrzugehoerigkeit() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.execute("drop table naehrzugehoerigkeit if exists");
			statement.execute("CREATE TABLE naehrzugehoerigkeit(lindex int(4), nname varchar(100), primary key(lindex, nname)," 
					+ " foreign key(lindex) references lebensmittelDaten, foreign key(nname) references naehrstoff);");
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, errorMessage, e);
		}
	}
	

}
