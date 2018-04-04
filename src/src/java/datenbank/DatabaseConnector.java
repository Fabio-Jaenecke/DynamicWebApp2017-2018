package datenbank;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * establish database connection and set up tables
 * @author Raphael
 *
 */
public class DatabaseConnector {
	private static Connection conn = null;
	private static final Logger LOGGER = Logger.getLogger(DatabaseConnector.class.getName());
	
	/**
	 * constructor for class DatabaseConstructor
	 */
	public DatabaseConnector() {
		try {
			conn = establishH2DBConnection();
			setUpH2Database();
		}
		catch(Exception e){
			LOGGER.log(Level.SEVERE, " You cannot use the database. Either there's already a connection "
					+ "or the configuration settings are false", e);
		}
	}
	
	/**
	 * try to establish database connection
	 * @return database connection
	 */
	public Connection establishH2DBConnection() {
		String DB_Connection = "jdbc:h2:~/histarantia";
		String DB_Driver = "org.h2.Driver";	
		String DB_User = "user";
		String DB_Password = "";
		
		try {
			Class.forName(DB_Driver);
		} 
		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			conn = DriverManager.getConnection(DB_Connection, DB_User, DB_Password);
		} 
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return conn;
	}

	/*
	 * set up different tables
	 */
	public void setUpH2Database() {
		setUpTableLebensmitteldaten();
		setUpTableZugriffsskala();
		setUpTableLebensmittelkategorie();
		setUpTableNaehrstoff();
		setUpTableFavorit();
		setUpTableKatzugehoerigkeit();
		setUpTableEnhaelt();
		setUpTableNaehrzugehoerigkeit();
	}
	
	/*
	 * set up table lebensmitteldaten
	 */
	public void setUpTableLebensmitteldaten() {
		try {
			Statement statement;
			statement = conn.createStatement();
			statement.execute("drop table lebensmitteldaten if exists");
			statement.execute("CREATE TABLE lebensmitteldaten(lindex int(4) primary key, lname varchar(100),"
				+ " karenzphase varchar(100), dauerernaehrung varchar(100));");
			
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (1001, 'Schwein', 'mittel', 'gut')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (1002, 'Rind', 'gut', 'gut')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (1003, 'Haehnchen', 'gut', 'gut')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (1004, 'Kalb', 'gut', 'gut')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (1005, 'Salami', 'schlecht', 'schlecht')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (1006, 'Bratwurst', 'schlecht', 'schlecht')");
			
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (2001, 'Apfel', 'gut', 'gut')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (2002, 'Birne', 'schlecht', 'mittel')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (2003, 'Mango', 'gut', 'gut')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (2004, 'Banane', 'schlecht', 'schlecht')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (2005, 'Pfirsich', 'gut', 'gut')");
			
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (3001, 'Gurke', 'gut', 'gut')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (3002, 'Brokoli', 'gut', 'gut')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (3003, 'Spinat', 'schlecht', 'schlecht')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (3004, 'Zwiebel', 'mittel', 'gut')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (3005, 'Paprika', 'schlecht', 'mittel')");
			
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (4001, 'Erbse', 'schlecht', 'schlecht')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (4002, 'Sojabohnen', 'schlecht', 'schlecht')");
			
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (5001, 'Reis', 'gut', 'gut')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (5002, 'Meis', 'gut', 'gut')");
			
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (6001, 'Erdnuesse', 'schlecht', 'schlecht')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (6002, 'Samen', 'gut', 'gut')");
			
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (7001, 'Thun-frisch', 'schlecht', 'mittel')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (7002, 'Thun-conserve', 'schlecht', 'schlecht')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (7003, 'Fischstaebchen', 'gut', 'gut')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (7004, 'Seeteufel', 'gut', 'gut')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (7005, 'Dorade', 'gut', 'gut')");
			
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (8001, 'Hutenkaese', 'gut', 'gut')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (8002, 'Joghurt', 'gut', 'gut')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (8003, 'Hartkaese', 'schlecht', 'schlecht')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (8004, 'Milch', 'mittel', 'gut')");
			
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (9001, 'Kaffee', 'mittel', 'mittel')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (9002, 'Ei', 'mittel', 'gut')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (9003, 'Teig', 'gut', 'gut')");
			statement.executeUpdate("INSERT INTO lebensmitteldaten " + "VALUES (9004, 'Alkohol', 'schlecht', 'schlecht')");
			
			
			statement.close();
			conn.commit();
		} catch (SQLException e) {
			catchException(e);
		}
		
	};
	
	/*
	 * set up table zugriffsskala
	 */
	public void setUpTableZugriffsskala() {
		try {
			Statement statement = conn.createStatement();
			statement.execute("drop table zugriffsskala if exists");
			statement.execute("CREATE TABLE zugriffsskala(zindex int(3) primary key, platzierung int(3),"
					+ " aZugriffe int(3));");
			
			statement.executeUpdate("INSERT INTO zugriffsskala " + "VALUES (100, 11, 111)");
			statement.executeUpdate("INSERT INTO zugriffsskala " + "VALUES (200, 12, 211)");
			statement.executeUpdate("INSERT INTO zugriffsskala " + "VALUES (300, 13, 121)");
			statement.executeUpdate("INSERT INTO zugriffsskala " + "VALUES (400, 14, 112)");
			statement.executeUpdate("INSERT INTO zugriffsskala " + "VALUES (500, 15, 113)");
			
			statement.close();
			conn.commit();
		} catch (SQLException e) {
			catchException(e);
		}
	};
	
	/*
	 * set up table lebensmittelkategorie
	 */
	public void setUpTableLebensmittelkategorie() {
		try {
			Statement statement = conn.createStatement();
			statement.execute("drop table lebensmittelkategorie if exists");
			statement.execute("CREATE TABLE lebensmittelkategorie(kindex int(4) primary key, kname varchar(100));");
		
			statement.executeUpdate("INSERT INTO lebensmittelkategorie " + "VALUES (1000, 'Fleisch')");
			statement.executeUpdate("INSERT INTO lebensmittelkategorie " + "VALUES (2000, 'Obst')");
			statement.executeUpdate("INSERT INTO lebensmittelkategorie " + "VALUES (3000, 'Gemuese')");
			statement.executeUpdate("INSERT INTO lebensmittelkategorie " + "VALUES (4000, 'Huelsenfruechte')");
			statement.executeUpdate("INSERT INTO lebensmittelkategorie " + "VALUES (5000, 'Getreide')");
			statement.executeUpdate("INSERT INTO lebensmittelkategorie " + "VALUES (6000, 'Nuesse und Samen')");
			statement.executeUpdate("INSERT INTO lebensmittelkategorie " + "VALUES (7000, 'Fisch')");
			statement.executeUpdate("INSERT INTO lebensmittelkategorie " + "VALUES (8000, 'Milch und Milchprodukte')");
			statement.executeUpdate("INSERT INTO lebensmittelkategorie " + "VALUES (9000, 'Sonstiges')");
			
			statement.close();
			
			conn.commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, " Exception occured during creation of table ", e);
		}
	}
	
	
	/*
	 * set up table naehrstoff
	 */
	public void setUpTableNaehrstoff() {
		try {
			Statement statement = conn.createStatement();
			statement.execute("drop table naehrstoff if exists");
			statement.execute("CREATE TABLE naehrstoff(nname varchar(100) primary key);");
			
			statement.executeUpdate("INSERT INTO naehrstoff " + "VALUES ('Staerkebeilage')");
			statement.executeUpdate("INSERT INTO naehrstoff " + "VALUES ('Proteine')");
			statement.executeUpdate("INSERT INTO naehrstoff " + "VALUES ('Vitamine')");
			
			statement.close();
			conn.commit();
		} catch (SQLException e) {
			catchException(e);
		}
	};
	
	/*
	 * set up table favorit
	 */
	public void setUpTableFavorit() {
		try {
			Statement statement = conn.createStatement();
			statement.execute("drop table favorit if exists");
			statement.execute("CREATE TABLE favorit(zindex int(3), lindex int(4), primary key(zindex, lindex),"
					+ "foreign key(zindex) references zugriffsskala, foreign key(lindex) references lebensmitteldaten);");
			
			statement.executeUpdate("INSERT INTO favorit " + "VALUES (100, 1001)");
			statement.executeUpdate("INSERT INTO favorit " + "VALUES (200, 2001)");
			statement.executeUpdate("INSERT INTO favorit " + "VALUES (300, 3001)");
			statement.executeUpdate("INSERT INTO favorit " + "VALUES (400, 4001)");
			
			statement.close();
			conn.commit();
		} catch (SQLException e) {
			catchException(e);
		}
	};		
	
	/*
	 * set up table katzugehoerigkeit
	 */
	public void setUpTableKatzugehoerigkeit() {
		try {
			Statement statement = conn.createStatement();
			statement.execute("drop table katzugehoerigkeit if exists");
			statement.execute("CREATE TABLE katzugehoerigkeit(lindex int(4), kindex int(4),"
					+ " primary key(lindex, kindex),foreign key(kindex) references lebensmittelkategorie"
					+ ", foreign key(lindex) references lebensmitteldaten);");
			
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (1001, 1000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (1002, 1000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (1003, 1000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (1004, 1000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (1005, 1000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (1006, 1000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (2001, 2000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (2002, 2000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (2003, 2000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (2004, 2000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (2005, 2000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (3001, 3000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (3002, 3000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (3003, 3000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (3004, 3000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (3005, 3000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (4001, 4000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (4002, 4000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (5001, 5000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (5002, 5000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (6001, 6000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (6002, 6000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (7001, 7000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (7002, 7000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (7003, 7000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (7004, 7000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (7005, 7000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (8001, 8000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (8002, 8000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (8003, 8000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (8004, 8000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (9001, 9000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (9002, 9000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (9003, 9000)");
			statement.executeUpdate("INSERT INTO katzugehoerigkeit " + "VALUES (9004, 9000)");
			
			statement.close();
			conn.commit();
		} catch (SQLException e) {
			catchException(e);
		}
	};		
	
	/*
	 * set up table enthaelt
	 */
	public void setUpTableEnhaelt() {
		try {
			Statement statement = conn.createStatement();
			statement.execute("drop table enthaelt if exists");
			statement.execute("CREATE TABLE enthaelt(kindex int(4), nname varchar(100), primary key(kindex, nname),"
					+ " foreign key(kindex) references lebensmittelkategorie, "
					+ "foreign key(nname) references naehrstoff);");
			
			statement.executeUpdate("INSERT INTO enthaelt " + "VALUES (1000, 'Proteine')");
			statement.executeUpdate("INSERT INTO enthaelt " + "VALUES (2000, 'Vitamine')");
			statement.executeUpdate("INSERT INTO enthaelt " + "VALUES (3000, 'Vitamine')");
			statement.executeUpdate("INSERT INTO enthaelt " + "VALUES (5000, 'Staerkebeilage')");
			statement.executeUpdate("INSERT INTO enthaelt " + "VALUES (6000, 'Vitamine')");
			statement.executeUpdate("INSERT INTO enthaelt " + "VALUES (7000, 'Proteine')");
			statement.executeUpdate("INSERT INTO enthaelt " + "VALUES (8000, 'Proteine')");
			statement.executeUpdate("INSERT INTO enthaelt " + "VALUES (9000, 'Staerkebeilage')");
			
			statement.close();
			conn.commit();
		} catch (SQLException e) {
			catchException(e);
		}
	};		
	
	/*
	 * set up table naehrzugheorigkeit
	 */
	public void setUpTableNaehrzugehoerigkeit() {
		try {
			Statement statement = conn.createStatement();
			statement.execute("drop table naehrzugehoerigkeit if exists");
			statement.execute("CREATE TABLE naehrzugehoerigkeit(lindex int(4), nname varchar(100), primary key(lindex, nname)," 
					+ " foreign key(lindex) references lebensmitteldaten, foreign key(nname) references naehrstoff);");
			
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (1001, 'Proteine')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (1002, 'Proteine')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (1003, 'Proteine')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (1004, 'Proteine')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (2001, 'Vitamine')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (2002, 'Vitamine')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (2003, 'Vitamine')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (2004, 'Vitamine')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (3001, 'Vitamine')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (3002, 'Vitamine')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (3003, 'Vitamine')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (3004, 'Vitamine')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (5001, 'Staerkebeilage')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (5002, 'Staerkebeilage')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (7001, 'Proteine')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (7002, 'Proteine')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (7003, 'Proteine')");
			statement.executeUpdate("INSERT INTO naehrzugehoerigkeit " + "VALUES (9003, 'Staerkebeilage')");
			
			statement.close();
			conn.commit();
		} catch (SQLException e) {
			catchException(e);
		}
	}
	
	/*
	 * print error message for exception
	 */
	private void catchException(Exception e) {
		LOGGER.log(Level.SEVERE, " Exception occured during creation of table ", e);
	}

	/*
	 * close connection after usage
	 */
	protected void finalize() throws SQLException {
    	if(null != conn) {
    		conn.close();    
    	}
    }
	
}	
