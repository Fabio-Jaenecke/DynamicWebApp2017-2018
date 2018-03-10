package datenbank;

import java.io.Console;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnector {
	private static Connection conn = null;
	private static final LOGGER = Logger.getLogger();
	
	public DatabaseConenctor() {
		
		try {
			establishH2DBConnection();
			setUpH2Database();
		}
		catch(Exception e){
			LOGGER.log(Level.SEVERE, " You cannot use the database. Either there's already a connection"
					+ "or the configuration settings are false", e);
		}
	}
	
	private void setUpH2Database() {
		setUpTableLebensmitteldaten();
		setUpTableZugriffskala();
		setUpTableLebensmittelkategorie();
		setUpTableKategorieneinteilung();
		setUpTableNaehrstoff();		
	}
	
	private void setUpTableLebensmitteldaten() {
		Statement statement = conn.createStatement();
		statement.execute("drop table lebensmitteldaten if exists)");
		statement.execute("CREATE TABLE Lebensmitteldaten(lindex int(3) primary key, lname varchar(100),"
				+ " karenzphase varchar(100), dauerernaehrung varchar(100));";
		statement.close();
	};
	
	private void setUpTableZugriffsskala() {
		Statement statement = conn.createStatement();
		statement.execute("drop table zugriffsskala if exists)");
		statement.execute("CREATE TABLE Zugriffsskala(zindex int(3) primary key, platzierung int(3),"
				+ " aZugriffe int(3));";
		statement.close();
	};
	
	private void setUpTableLebensmittelkategorie() {
		Statement statement = conn.createStatement();
		statement.execute("drop table lebensmittelkategorie if exists)");
		statement.execute("CREATE TABLE Lebensmittelkategorie(kindex int(3) primary key, kname varchar(100));";
		statement.close();
	}
	
	private void setUpTableKategorieneinteilung() {
		Statement statement = conn.createStatement();
		statement.execute("drop table kategorieneinteilung if exists)");
		statement.execute("CREATE TABLE Kategorieneinteilung(keindex int(3) primary key, kindex1 int(3),"
				+ " kindex2 int(3), kindex3 int(3));";
		statement.close();
	};
	
	private void setUpTableNaehrstoff() {
		Statement statement = conn.createStatement();
		statement.execute("drop table naehrstoff if exists)");
		statement.execute("CREATE TABLE naehrstoff(nindex int(3) primary key, nname varchar(100));";
		statement.close();
	};
	
	private void setUpTableFavorit() {
		Statement statement = conn.createStatement();
		statement.execute("drop table favorit if exists)");
		statement.execute("CREATE TABLE Favorit(zindex int(3), lindex int(3));";
		statement.close();
	};		
	
	private void setUpTableKatzugehoerigkeit() {
		Statement statement = conn.createStatement();
		statement.execute("drop table katzugehoerigkeit if exists)");
		statement.execute("CREATE TABLE katzugehoerigkeit(lindex int(3), kindex int(3));";
		statement.close();
	};		
	
	private void setUpTableEnhaelt() {
		Statement statement = conn.createStatement();
		statement.execute("drop table enthaelt if exists)");
		statement.execute("CREATE TABLE Enthaelt(kindex int(3), keindex int(3));";
		statement.close();
	};		
	
	private void setUpTableNaehrzugehoerigkeit() {
		Statement statement = conn.createStatement();
		statement.execute("drop table naehrzugehoerigkeit if exists)");
		statement.execute("CREATE TABLE naehrzugehoerigkeit(nindex int(3), lindex(3));";
		statement.close();
	};		
	
	private static Connection establishH2DBConnection() {
		String DB_Connection = "jdbc:h2:~/test";
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

	
}	
