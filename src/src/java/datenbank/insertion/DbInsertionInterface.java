package datenbank.insertion;

/*
 * interface for inserting data to tables.
 * every method inserts data to one table
 */
public interface DbInsertionInterface {

	void insertIntoTableLebensmitteldaten();
	
	void insertIntoTableZugriffsskala();
	
	void insertIntoTableLebensmittelkategorie();
	
	void insertIntoTableNaehrstoff();
	
	void insertIntoTableFavorit();
	
	void insertIntoTableKatzugehoerigkeit();
	
	void insertIntoTableEnhaelt();
	
	void insertIntoTableNaehrzugehoerigkeit();
}
