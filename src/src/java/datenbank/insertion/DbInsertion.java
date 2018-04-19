package datenbank.insertion;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import datenbank.connector.DbConnector;
import datenbank.connector.DbConnectorStub;

/*
 * Class for filling the tables with content, derived from interface
 */

public class DbInsertion implements DbInsertionInterface {
	
	private DbConnector conn = new DbConnector();
	private static final Logger LOGGER = Logger.getLogger(DbInsertion.class.getName());
	private static final String INSERT = "INSERT INTO ";
	/*
	 * table names as enums
	 */
	public enum tables{
		lebensmittelDaten,
		ZUGRIFFSSKALA,
		lebensmittelkategorie,
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
		insertIntoTablelebensmittelDaten();
		insertIntoTableZugriffsskala();
		insertIntoTablelebensmittelkategorie();
		insertIntoTableNaehrstoff();
		insertIntoTableFavorit();
		insertIntoTableKatzugehoerigkeit();
		insertIntoTableEnthaelt();
		insertIntoTableNaehrzugehoerigkeit();
	}

	/*
	 * @see datenbank.insertion.DbInsertionInterface#insertIntoTablelebensmittelDaten()
	 */
	@Override
	public void insertIntoTablelebensmittelDaten() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (1001, 'Schwein', 'mittel', 'gut')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (1002, 'Rind', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten  + " VALUES (1003, 'Haehnchen', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten  + " VALUES (1004, 'Kalb', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (1005, 'Salami', 'schlecht', 'schlecht')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (1006, 'Bratwurst', 'schlecht', 'schlecht')");
			
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (2001, 'Apfel', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (2002, 'Birne', 'schlecht', 'mittel')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (2003, 'Mango', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (2004, 'Banane', 'schlecht', 'schlecht')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (2005, 'Pfirsich', 'gut', 'gut')");
			
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (3001, 'Gurke', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (3002, 'Brokoli', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (3003, 'Spinat', 'schlecht', 'schlecht')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (3004, 'Zwiebel', 'mittel', 'gut')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (3005, 'Paprika', 'schlecht', 'mittel')");
			
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (4001, 'Erbse', 'schlecht', 'schlecht')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (4002, 'Sojabohnen', 'schlecht', 'schlecht')");
			
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (5001, 'Reis', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (5002, 'Meis', 'gut', 'gut')");
			
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (6001, 'Erdnuesse', 'schlecht', 'schlecht')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (6002, 'Samen', 'gut', 'gut')");
			
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (7001, 'Thun-frisch', 'schlecht', 'mittel')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (7002, 'Thun-conserve', 'schlecht', 'schlecht')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (7003, 'Fischstaebchen', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (7004, 'Seeteufel', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (7005, 'Dorade', 'gut', 'gut')");
			
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (8001, 'Hutenkaese', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (8002, 'Joghurt', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (8003, 'Hartkaese', 'schlecht', 'schlecht')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (8004, 'Milch', 'mittel', 'gut')");
			
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (9001, 'Kaffee', 'mittel', 'mittel')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (9002, 'Ei', 'mittel', 'gut')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (9003, 'Teig', 'gut', 'gut')");
			statement.executeUpdate(INSERT + tables.lebensmittelDaten + " VALUES (9004, 'Alkohol', 'schlecht', 'schlecht')");
			
			statement.close();
			conn.getConn().commit();
			LOGGER.info("inserted data into table lebensmittelDaten");
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "table lebensmittelDaten could not be filled " + e);
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
			
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (100, 11, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (110, 12, 4)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (120, 13, 3)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (130, 14, 1)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (140, 15, 5)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (150, 16, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (160, 17, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (170, 18, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (180, 19, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (190, 20, 0)");
			
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (200, 21, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (210, 22, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (220, 23, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (230, 24, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (240, 25, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (250, 26, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (260, 27, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (270, 28, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (280, 29, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (290, 30, 0)");
			
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (300, 31, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (310, 32, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (320, 33, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (330, 34, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (340, 35, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (350, 36, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (360, 37, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (370, 38, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (380, 39, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (390, 40, 0)");
			
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (400, 41, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (410, 42, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (420, 43, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (430, 44, 0)");
			statement.executeUpdate(INSERT + tables.ZUGRIFFSSKALA + " VALUES (440, 45, 0)");
						
			statement.close();
			conn.getConn().commit();
			LOGGER.info("inserted data into table zugriffsskala");
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "table zugriffsskala could not be filled " + e);
		}
	
	}

	/*
	 * @see datenbank.insertion.DbInsertionInterface#insertIntoTablelebensmittelkategorie()
	 */
	@Override
	public void insertIntoTablelebensmittelkategorie() {
		Statement statement;
		try {
			statement = conn.getConn().createStatement();
			statement.executeUpdate(INSERT + tables.lebensmittelkategorie + " VALUES (1000, 'Fleisch')");
			statement.executeUpdate(INSERT + tables.lebensmittelkategorie + " VALUES (2000, 'Obst')");
			statement.executeUpdate(INSERT + tables.lebensmittelkategorie + " VALUES (3000, 'Gemuese')");
			statement.executeUpdate(INSERT + tables.lebensmittelkategorie + " VALUES (4000, 'Huelsenfruechte')");
			statement.executeUpdate(INSERT + tables.lebensmittelkategorie + " VALUES (5000, 'Getreide')");
			statement.executeUpdate(INSERT + tables.lebensmittelkategorie + " VALUES (6000, 'Nuesse und Samen')");
			statement.executeUpdate(INSERT + tables.lebensmittelkategorie + " VALUES (7000, 'Fisch')");
			statement.executeUpdate(INSERT + tables.lebensmittelkategorie + " VALUES (8000, 'Milch und Milchprodukte')");
			statement.executeUpdate(INSERT + tables.lebensmittelkategorie + " VALUES (9000, 'Sonstiges')");
			
			statement.close();
			conn.getConn().commit();
			LOGGER.info("inserted data into table lebensmittelmittelkategorie");
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
			LOGGER.info("inserted data into table naehrstoff");
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
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (110, 1002)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (120, 1003)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (130, 1004)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (140, 1005)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (150, 1006)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (160, 2001)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (170, 2002)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (180, 2003)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (190, 2004)"); 
			
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (200, 2005)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (210, 3001)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (220, 3002)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (230, 3003)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (240, 3004)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (250, 3005)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (260, 4001)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (270, 4002)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (280, 5001)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (290, 5002)"); 
			
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (300, 6001)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (310, 6002)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (320, 7001)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (330, 7002)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (340, 7003)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (350, 7004)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (360, 7005)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (370, 8001)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (380, 8002)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (390, 8003)");
			
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (400, 8004)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (410, 9001)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (420, 9002)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (430, 9003)");
			statement.executeUpdate(INSERT + tables.FAVORIT + " VALUES (440, 9004)");
			
			statement.close();
			conn.getConn().commit();
			LOGGER.info("inserted data into table favorit");
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
			LOGGER.info("inserted data into table katzugehoerigkeit");
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "table katzugehoerigkeit could not be filled " + e);
		}
	}

	/*
	 * @see datenbank.insertion.DbInsertionInterface#insertIntoTableEnthaelt()
	 */
	@Override
	public void insertIntoTableEnthaelt() {
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
			LOGGER.info("inserted data into table enthaelt");
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
			LOGGER.info("inserted data into table naehrzugehoerigkeit");
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, " Exception occured during creation of table ", e);
		}
		
	}

}

