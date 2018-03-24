package datenbank;

public interface DatabaseCreation {

	void setUpH2Database();
	
	void setUpTableLebensmitteldaten();
	
	void setUpTableZugriffsskala();
	
	void setUpTableLebensmittelkategorie();
	
	void setUpTableKategorieneinteilung();
	
	void setUpTableNaehrstoff();
	
	void setUpTableFavorit();
	
	void setUpTableKatzugehoerigkeit();
	
	void setUpTableEnhaelt();
	
	void setUpTableNaehrzugehoerigkeit();
}
