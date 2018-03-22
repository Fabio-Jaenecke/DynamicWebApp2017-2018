package Suche; 

import controller.Lebensmittelmanager;
import datenbank.Lebensmitteldaten;

public abstract class Lebensmittelsuche implements Suche {
	
	private Lebensmittelmanager lebensmittelmanager = new Lebensmittelmanager();
	
	public Lebensmitteldaten getLebensmittelInfoByName(String lebensmittelName) {
		return lebensmittelmanager.getLebensmittelInfoByName(lebensmittelName);
	}
}

	
