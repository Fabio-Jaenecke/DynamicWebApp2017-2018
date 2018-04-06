package datenbank.manager;

import datenbank.creation.DbCreation;
import datenbank.insertion.DbInsertion;

/**
 * sets up tables for database and inserts them with date
 * @author Raphael
 *
 */
public class DbManager {
	
	DbCreation creation = new DbCreation();
	DbInsertion insertion = new DbInsertion();
	
	/**
	 * for the moment, dbManager only sets up and inserts to tables
	 * so we only need an empty constructor
	 */
	public DbManager() {
		
	}
}
