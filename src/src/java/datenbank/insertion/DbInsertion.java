package datenbank.insertion;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.DatabaseConnector;
import datenbank.connector.DbConnector;
import datenbank.connector.DbConnectorStub;

/*
 * Class for filling the tables with content, derived from interface
 */

public class DbInsertion implements DbInsertionInterface {
	
	private DbConnector conn = new DbConnector();
	private static final Logger LOGGER = Logger.getLogger(DatabaseConnector.class.getName());
	private static final String INSERT = "INSERT INTO ";
	/*
	 * table names as enums
	 */
	public enum tables{
		LEBENSMITTELDATEN,
		ZUGRIFFSSKALA,
		LEBENSMITTELKATEGORIE,
		NAEHRSTOFF,
		FAVORIT,
		KATZUGEHOERIGKEIT,
		ENTHAELT,
		NAEHRZUGEHOERIGKEIT
	}
	
	public DbInsertion() {
		insertIntoTables();
	}
	
	/*
	 * insert into different tables
	 */
	public void insertIntoTables() {
		insertIntoTableLebensmitteldaten();
		insertIntoTableZugriffsskala();
		insertIntoTableLebensmittelkategorie();
		insertIntoTableNaehrstoff();
		insertIntoTableFavorit();
		insertIntoTableKatzugehoerigkeit();
		insertIntoTableEnhaelt();
		insertIntoTableNaehrzugehoerigkeit();
	}

	/*
	 * @see datenbank.insertion.DbInsertionInterface#insertIntoTableLebensmitteldaten()
	 */
	@Override
	public void insertIntoTableLebensmitteldaten() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (1001, 'Schwein', 'mittel', 'gut')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (1002, 'Rind', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN  + " VALUES (1003, 'Haehnchen', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN  + " VALUES (1004, 'Kalb', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (1005, 'Salami', 'schlecht', 'schlecht')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (1006, 'Bratwurst', 'schlecht', 'schlecht')");
			
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (2001, 'Apfel', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (2002, 'Birne', 'schlecht', 'mittel')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (2003, 'Mango', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (2004, 'Banane', 'schlecht', 'schlecht')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (2005, 'Pfirsich', 'gut', 'gut')");
			
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (3001, 'Gurke', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (3002, 'Brokoli', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (3003, 'Spinat', 'schlecht', 'schlecht')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (3004, 'Zwiebel', 'mittel', 'gut')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (3005, 'Paprika', 'schlecht', 'mittel')");
			
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (4001, 'Erbse', 'schlecht', 'schlecht')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (4002, 'Sojabohnen', 'schlecht', 'schlecht')");
			
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (5001, 'Reis', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (5002, 'Meis', 'gut', 'gut')");
			
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (6001, 'Erdnuesse', 'schlecht', 'schlecht')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (6002, 'Samen', 'gut', 'gut')");
			
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (7001, 'Thun-frisch', 'schlecht', 'mittel')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (7002, 'Thun-conserve', 'schlecht', 'schlecht')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (7003, 'Fischstaebchen', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (7004, 'Seeteufel', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (7005, 'Dorade', 'gut', 'gut')");
			
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (8001, 'Hutenkaese', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (8002, 'Joghurt', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (8003, 'Hartkaese', 'schlecht', 'schlecht')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (8004, 'Milch', 'mittel', 'gut')");
			
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (9001, 'Kaffee', 'mittel', 'mittel')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (9002, 'Ei', 'mittel', 'gut')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (9003, 'Teig', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELDATEN + " VALUES (9004, 'Alkohol', 'schlecht', 'schlecht')");
			
			statement.close();
			conn.getConn().commit();
			LOGGER.info("inserted data into table lebensmitteldaten");
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "table lebensmitteldaten could not be filled " + e);
		}
	}

	/*
	 * @see datenbank.insertion.DbInsertionInterface#insertIntoTableZugriffsskala()
	 */
	@Override
	public void insertIntoTableZugriffsskala() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (100, 11, 111)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (200, 12, 211)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (300, 13, 121)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (400, 14, 112)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (500, 15, 113)");
			
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "table zugriffsskala could not be filled " + e);
		}
	
	}

	/*
	 * @see datenbank.insertion.DbInsertionInterface#insertIntoTableLebensmittelkategorie()
	 */
	@Override
	public void insertIntoTableLebensmittelkategorie() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.executeUpdate(INSERT + tables.LEBENSMITTELKATEGORIE + " VALUES (1000, 'Fleisch')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELKATEGORIE + " VALUES (2000, 'Obst')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELKATEGORIE + " VALUES (3000, 'Gemuese')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELKATEGORIE + " VALUES (4000, 'Huelsenfruechte')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELKATEGORIE + " VALUES (5000, 'Getreide')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELKATEGORIE + " VALUES (6000, 'Nuesse und Samen')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELKATEGORIE + " VALUES (7000, 'Fisch')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELKATEGORIE + " VALUES (8000, 'Milch und Milchprodukte')");
			statement.executeUpdate(INSERT + tables.LEBENSMITTELKATEGORIE + " VALUES (9000, 'Sonstiges')");
			
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "table lebensmittelmittelkategorie could not be filled " + e);
		}
		
	}

	/*
	 * @see datenbank.insertion.DbInsertionInterface#insertIntoTableNaehrstoff()
	 */
	@Override
	public void insertIntoTableNaehrstoff() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.executeUpdate(INSERT + tables.NAEHRSTOFF + " VALUES ('Staerkebeilage')");
			statement.executeUpdate(INSERT + tables.NAEHRSTOFF + " VALUES ('Proteine')");
			statement.executeUpdate(INSERT + tables.NAEHRSTOFF + " VALUES ('Vitamine')");
			
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "table naehrstoff could not be filled " + e);
		}
		
	}

	/*
	 * @see datenbank.insertion.DbInsertionInterface#insertIntoTableFavorit()
	 */
	@Override
	public void insertIntoTableFavorit() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (100, 1001)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (200, 2001)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (300, 3001)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (400, 4001)");
			
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "table favorit could not be filled " + e);
		}
		
	}

	/*
	 * @see datenbank.insertion.DbInsertionInterface#insertIntoTableKatzugehoerigkeit()
	 */
	@Override
	public void insertIntoTableKatzugehoerigkeit() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (1001, 1000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (1002, 1000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (1003, 1000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (1004, 1000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (1005, 1000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (1006, 1000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (2001, 2000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (2002, 2000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (2003, 2000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (2004, 2000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (2005, 2000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (3001, 3000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (3002, 3000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (3003, 3000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (3004, 3000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (3005, 3000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (4001, 4000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (4002, 4000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (5001, 5000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (5002, 5000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (6001, 6000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (6002, 6000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (7001, 7000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (7002, 7000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (7003, 7000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (7004, 7000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (7005, 7000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (8001, 8000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (8002, 8000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (8003, 8000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (8004, 8000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (9001, 9000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (9002, 9000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (9003, 9000)");
			statement.executeUpdate(INSERT + tables.KATZUGEHOERIGKEIT + " VALUES (9004, 9000)");
			
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "table katzugehoerigkeit could not be filled " + e);
		}
	}

	/*
	 * @see datenbank.insertion.DbInsertionInterface#insertIntoTableEnhaelt()
	 */
	@Override
	public void insertIntoTableEnhaelt() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.executeUpdate(INSERT + tables.ENTHAELT + " VALUES (1000, 'Proteine')");
			statement.executeUpdate(INSERT + tables.ENTHAELT + " VALUES (2000, 'Vitamine')");
			statement.executeUpdate(INSERT + tables.ENTHAELT + " VALUES (3000, 'Vitamine')");
			statement.executeUpdate(INSERT + tables.ENTHAELT + " VALUES (5000, 'Staerkebeilage')");
			statement.executeUpdate(INSERT + tables.ENTHAELT + " VALUES (6000, 'Vitamine')");
			statement.executeUpdate(INSERT + tables.ENTHAELT + " VALUES (7000, 'Proteine')");
			statement.executeUpdate(INSERT + tables.ENTHAELT + " VALUES (8000, 'Proteine')");
			statement.executeUpdate(INSERT + tables.ENTHAELT + " VALUES (9000, 'Staerkebeilage')");
			
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, " Exception occured during creation of table ", e);
		}
		
	}

	/*
	 * @see datenbank.insertion.DbInsertionInterface#insertIntoTableNaehrzugehoerigkeit()
	 */
	@Override
	public void insertIntoTableNaehrzugehoerigkeit() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (1001, 'Proteine')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (1002, 'Proteine')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (1003, 'Proteine')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (1004, 'Proteine')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (2001, 'Vitamine')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (2002, 'Vitamine')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (2003, 'Vitamine')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (2004, 'Vitamine')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (3001, 'Vitamine')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (3002, 'Vitamine')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (3003, 'Vitamine')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (3004, 'Vitamine')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (5001, 'Staerkebeilage')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (5002, 'Staerkebeilage')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (7001, 'Proteine')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (7002, 'Proteine')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (7003, 'Proteine')");
			statement.executeUpdate(INSERT + tables.NAEHRZUGEHOERIGKEIT + " VALUES (9003, 'Staerkebeilage')");
			
			statement.close();
			conn.getConn().commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, " Exception occured during creation of table ", e);
		}
		
	}

}

