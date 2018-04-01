package datenbank.creation;

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
		
	}

	@Override
	public void setUpTableZugriffsskala() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUpTableLebensmittelkategorie() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUpTableNaehrstoff(){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUpTableFavorit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUpTableKatzugehoerigkeit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUpTableEnhaelt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUpTableNaehrzugehoerigkeit() {
		// TODO Auto-generated method stub
		
	}
	

}
