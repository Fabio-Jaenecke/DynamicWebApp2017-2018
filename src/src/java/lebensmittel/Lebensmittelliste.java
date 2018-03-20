package lebensmittel;

import java.util.*; 

/**
 * Eine Klasse zur Verwaltung von Lebensmitteln.
 *
 * @author mjtre
 * @version 17.03.2018 
 */
public class Lebensmittelliste
{
	// Eine ArrayList, in der die Namen von Lebensmitteln gespeichert
	// werden können.  
	private ArrayList<String> lebensmittel; 
	
	/**
	 * Erzeuge eine Lebensmittelsammlung. 
	 */
	public Lebensmittelliste()
	{
		lebensmittel = new ArrayList<>(); 
	}
	
	/**
	 * Füge der Sammlung ein Lebensmittel hinzu.
	 * @param lebensmittelname das hinzugefügte Lebensmittel.
	 */
	public void lebensmittelHinzufuegen(String lebensmittelname)
	{
		lebensmittel.add(lebensmittelname);
	}
	
	/**
	 * Liefere die Anzahl der Lebensmittel in dieser Sammlung. 
	 * @return die Anzahl der Lebensmittel in dieser Sammlung.
	 */
	public int gibAbzahlLebensmittel()
	{
		return lebensmittel.size(); 
	}
	
	/**
	 * Gib ein Lebensmittel aus der Sammlung auf die Konsole aus. 
	 * @param index der Index des Lebensmittels, dessen Name ausgegeben werden soll.
	 */
	public void lebensmittelAusgeben(int index)
	{
		if(index >= 0 && index < lebensmittel.size()) {
			String lebensmittelname = lebensmittel.get(index); 
			System.out.println(lebensmittelname);
		}
	}
	
	/**
	 * Entferne ein Lebensmittel aus der Sammlung.
	 * @param index der Index des zu entfernenden Lebensmittels.
	 */
	public void entferneLebensmittel(int index)
	{
		if(index >= 0 && index < lebensmittel.size()) {
			lebensmittel.remove(index); 
		}
	}
}
