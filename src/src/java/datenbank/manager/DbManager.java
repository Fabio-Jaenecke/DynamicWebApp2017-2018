package datenbank.manager;

import datenbank.creation.DbCreation;
import datenbank.insertion.DbInsertion;

public class DbManager {
	
	DbCreation creation = new DbCreation();
	DbInsertion insertion = new DbInsertion();
	
	public DbManager() {
		
	}
}
