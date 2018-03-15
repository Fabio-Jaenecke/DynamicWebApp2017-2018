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
			LOGGER.log(Level.SEVERE, " You cannot use the database. Either there's already a connection"
					+ "or the configuration settings are false", e);
		}
	}
	
	/**
	 * try to establish database connection
	 * @return database connection
	 */
	private static Connection establishH2DBConnection() {
		String DB_Connection = "jdbc:h2:~/test";
		//String DB_Connection = "jdbc:mysql://localhost:3306/";
		String DB_Driver = "org.h2.Driver";	
		String DB_User = "sa";
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
	private void setUpH2Database() {
		setUpTableLebensmitteldaten();
		setUpTableZugriffsskala();
		setUpTableLebensmittelkategorie();
		setUpTableKategorieneinteilung();
		setUpTableNaehrstoff();
		setUpTableFavorit();
		setUpTableKatzugehoerigkeit();
		setUpTableEnhaelt();
		setUpTableNaehrzugehoerigkeit();
	}
	
	/*
	 * set up table lebensmitteldaten
	 */
	private void setUpTableLebensmitteldaten() {
		try {
			Statement statement;
			statement = conn.createStatement();
			statement.execute("drop table lebensmitteldaten if exists");
			statement.execute("CREATE TABLE lebensmitteldaten(lindex int(3) primary key, lname varchar(100),"
				+ " karenzphase varchar(100), dauerernaehrung varchar(100));");
			statement.close();
			conn.commit();
		} catch (SQLException e) {
			catchException(e);
		}
		
	};
	
	/*
	 * set up table zugriffsskala
	 */
	private void setUpTableZugriffsskala() {
		try {
			Statement statement = conn.createStatement();
			statement.execute("drop table zugriffsskala if exists");
			statement.execute("CREATE TABLE zugriffsskala(zindex int(3) primary key, platzierung int(3),"
					+ " aZugriffe int(3));");
			statement.close();
			conn.commit();
		} catch (SQLException e) {
			catchException(e);
		}
	};
	
	/*
	 * set up table lebensmittelkategorie
	 */
	private void setUpTableLebensmittelkategorie() {
		try {
			Statement statement = conn.createStatement();
			statement.execute("drop table lebensmittelkategorie if exists");
			statement.execute("CREATE TABLE lebensmittelkategorie(kindex int(3) primary key, kname varchar(100));");
			statement.close();
			conn.commit();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, " Exception occured during creation of table ", e);
		}
	}
	
	/*
	 * set up table kategorieneinteilung
	 */
	private void setUpTableKategorieneinteilung() {
		try {
			Statement statement = conn.createStatement();
			statement.execute("drop table kategorieneinteilung if exists");
			statement.execute("CREATE TABLE kategorieneinteilung(keindex int(3) primary key, kindex1 int(3),"
					+ " kindex2 int(3), kindex3 int(3));");
			statement.close();
			conn.commit();
		} catch (SQLException e) {
			catchException(e);
		}
	};
	
	/*
	 * set up table naehrstoff
	 */
	private void setUpTableNaehrstoff() {
		try {
			Statement statement = conn.createStatement();
			statement.execute("drop table naehrstoff if exists");
			statement.execute("CREATE TABLE naehrstoff(nindex int(3) primary key, nname varchar(100));");
			statement.close();
			conn.commit();
		} catch (SQLException e) {
			catchException(e);
		}
	};
	
	/*
	 * set up table favorit
	 */
	private void setUpTableFavorit() {
		try {
			Statement statement = conn.createStatement();
			statement.execute("drop table favorit if exists");
			statement.execute("CREATE TABLE favorit(zindex int(3), lindex int(3), primary key(zindex, lindex),"
					+ "foreign key(zindex) references zugriffsskala, foreign key(lindex) references lebensmitteldaten));");
			statement.close();
			conn.commit();
		} catch (SQLException e) {
			catchException(e);
		}
	};		
	
	/*
	 * set up table katzugehoerigkeit
	 */
	private void setUpTableKatzugehoerigkeit() {
		try {
			Statement statement = conn.createStatement();
			statement.execute("drop table katzugehoerigkeit if exists");
			statement.execute("CREATE TABLE katzugehoerigkeit(lindex int(3), kindex int(3),"
					+ " primary key(kindex, lindex),foreign key(kindex) references lebensmittelkategorie"
					+ ", foreign key(lindex) references lebensmitteldaten);");
			statement.close();
			conn.commit();
		} catch (SQLException e) {
			catchException(e);
		}
	};		
	
	/*
	 * set up table enthaelt
	 */
	private void setUpTableEnhaelt() {
		try {
			Statement statement = conn.createStatement();
			statement.execute("drop table enthaelt if exists");
			statement.execute("CREATE TABLE enthaelt(kindex int(3), keindex int(3), primary key(kindex, keindex),"
					+ " foreign key(kindex) references lebensmittelkategorie, "
					+ "foreign key(keindex) references kategorieneinteilung);");
			statement.close();
			conn.commit();
		} catch (SQLException e) {
			catchException(e);
		}
	};		
	
	/*
	 * set up table naehrzugheorigkeit
	 */
	private void setUpTableNaehrzugehoerigkeit() {
		try {
			Statement statement = conn.createStatement();
			statement.execute("drop table naehrzugehoerigkeit if exists");
			statement.execute("CREATE TABLE naehrzugehoerigkeit(nindex int(3), lindex(3), primary key(nindex, lindex)," 
					+ " foreign key(nindex) references naehrstoff, foreign key(lindex) references lebensmitteldaten);");
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
