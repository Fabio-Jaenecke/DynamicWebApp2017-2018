package datenbank.creation;

/**
 * interface for creation of tables
 * @author Raphael
 *
 */
public interface DbCreationInterface {

	void setUpTables();
	
	void setUpTableLebensmitteldaten();
	
	void setUpTableZugriffsskala();
	
	void setUpTableLebensmittelkategorie();
	
	void setUpTableNaehrstoff();
	
	void setUpTableFavorit();
	
	void setUpTableKatzugehoerigkeit();
	
	void setUpTableEnhaelt();
	
	void setUpTableNaehrzugehoerigkeit();

		
}
