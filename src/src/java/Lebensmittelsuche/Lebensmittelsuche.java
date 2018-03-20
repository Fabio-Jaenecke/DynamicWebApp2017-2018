package Lebensmittelsuche; 

import java.util.*;
import datenbank.Lebensmittel;
import lebensmittel.Lebensmittelliste;

public class Lebensmittelsuche {
	
	private ArrayList<Lebensmittel> lebensmittel = new ArrayList<>();
	private Lebensmittelliste lebensmittelliste = new Lebensmittelliste();
	
	public void sucheLebensmittel(String name)
	{
		int index = 0; 
		boolean gefunden = false; 
		while(index < lebensmittel.size() && !gefunden) {
			String name = name.get(index); 
			System.out.println("Kategorie: " + name);
			System.out.println("Karenzphase: " + karenzphase); 
			System.out.println("Dauerernaehrung: " + dauerernaehrung);
			index++; 
	}
		
}
