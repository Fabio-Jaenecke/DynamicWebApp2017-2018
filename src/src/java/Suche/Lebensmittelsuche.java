package Suche; 

import java.util.*;

import controller.Lebensmittelmanager;
import datenbank.Lebensmitteldaten;

public class Lebensmittelsuche {
	
	private ArrayList<Lebensmitteldaten> lebensmittel = new ArrayList<>();
	private Lebensmittelmanager lebensmittelliste = new Lebensmittelmanager();
	
	public void sucheLebensmittel(String name)
	{
		int index = 0; 
		boolean gefunden = false; 
		while(index < lebensmitteldaten.size() && !gefunden) {
			String name = lebensmittelliste.get(index); 
			System.out.println("Kategorie: " + name);
			System.out.println("Karenzphase: " + karenzphase); 
			System.out.println("Dauerernaehrung: " + dauerernaehrung);
			index++; 
	}

}
