package Lebensmittelsuche; 

import java.util.*;
import Lebensmittel.Lebensmittel; 

public class Lebensmittelsuche extends Lebensmittel {
	
	private String lebensmittelname; 
	private String lebensmittelkategorie; 
	private String karenzphase; 
	private String dauerernährung; 
	
	public Lebensmittelsuche(String lebensmittelname)
	{
		super();
	}
	
	public void sucheLebensmittel(String lebensmittelname)
	{
		int index = 0; 
		boolean gefunden = false; 
		while(index < lebensmittel.size() && !gefunden) {
			String lebensmittelname = lebensmittel.get(index); 
			System.out.println( + ": " + lebensmittelname);
			index++; 
	}

}
