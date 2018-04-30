package datenbank.creation;

/**
 * Interface zum Einfügen von Daten in Tabellen.
 * Jede Methode erstellt eine Tabelle. 
 */
public interface DbCreationInterface {

	void setUpTables();
	
	void setUpTablelebensmittelDaten();
	
	void setUpTableZugriffsskala();
	
	void setUpTablelebensmittelkategorie();
	
	void setUpTableNaehrstoff();
	
	void setUpTableFavorit();
	
	void setUpTableKatzugehoerigkeit();
	
	void setUpTableEnthaelt();
	
	void setUpTableNaehrzugehoerigkeit();
		
}
