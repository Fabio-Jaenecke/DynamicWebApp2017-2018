package controller;

import java.util.*;

import datenbank.container.Lebensmitteldaten; 

/**
 * Eine Klasse zur Verwaltung von Lebensmitteln.
 *
 * @author mjtre
 * @version 17.03.2018 
 */
public class Lebensmittelmanager
{
	// Eine ArrayList, in der die Namen von Lebensmitteln gespeichert
	// werden koennen.  
	private ArrayList<Lebensmitteldaten> lebensmittel; 
	
	/**
	 * Erzeuge eine Lebensmittelsammlung. 
	 */
	public Lebensmittelmanager()
	{
		lebensmittel = new ArrayList<>(); 
	}
	
	/**
	 * Fuege der Sammlung ein Lebensmittel hinzu.
	 * @param lebensmittelname das hinzugefuegte Lebensmittel.
	 */
	public void lebensmittelHinzufuegen(Lebensmitteldaten lebensmittelname)
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
			String lebensmittelname = lebensmittel.get(index).getLname(); 
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
	
	/**
	 * Gib die Kategorie anhand des Lebensmittelnamens. 
	 * @param name der Name des zu suchenden Lebensmittels.
	 * @return kategorie
	 */
	public String getKategorie(String name) {
		String kategorie = null;
		for(Lebensmitteldaten lebensmittelIterator : lebensmittel) {
			if(lebensmittelIterator.getLname().equals(name)) {
				kategorie = lebensmittelIterator.getKategorie();
				break;
			}
		}
		return kategorie;
	}
	
	/**
	 * Gib die Karenzphase anhand des Lebensmittelnamens.
	 * @param name der Name des zu suchenden Lebensmittels.
	 * @return karenzphase
	 */
	public String getKarenzphase(String name) {
		String karenzphase = null;
		for(Lebensmitteldaten lebensmittelIterator : lebensmittel) {
			if(lebensmittelIterator.getLname().equals(name)) {
				karenzphase = lebensmittelIterator.getKarenzphase();
				break;
			}
		}
		return karenzphase;
	}
	
	/** 
	 * Gib die Dauerernaehrung anhand des Lebensmittelnamens.
	 * @param name der Name des zu suchenden Lebensmittels. 
	 * @return dauerernaehrung
	 */
	public String getDauerernaehrung(String name) {
		String dauerernaehrung = null;
		for(Lebensmitteldaten lebensmittelIterator : lebensmittel) {
			if(lebensmittelIterator.getLname().equals(name)) {
				dauerernaehrung = lebensmittelIterator.getDauerernaehrung();
				break;
			}
		}
		return dauerernaehrung;
	}
	
	/**
	 * Gib alle Lebensmittelinformationen. 
	 * @param name der Name des zu suchenden Lebensmittels.
	 * @return lebensmittel 
	 * @return null falls Lebensmittel nicht gefunden
	 */
	public Lebensmitteldaten getLebensmittelInfoByName(String name) {
		for(Lebensmitteldaten lebensmittel: lebensmittel) {
			if(lebensmittel.getLname().equals(name)) {
				return lebensmittel;
			}
		}
		return null;
	}
	
	/**
	 * Gib alle Lebensmittelinformationen pro Kategorie. 
	 * @param kategorie die Kategorie des zu suchenden Lebensmittels.
	 * @param name der Name des zu suchenden Lebensmittels.
	 * @return lebensmittel 
	 * @return null falls Lebensmittel nicht gefunden
	 */
	public Lebensmitteldaten getLebensmittelInfoByKategorie(String name, String kategorie) {
		for(Lebensmitteldaten lebensmittel : lebensmittel) {
			if(lebensmittel.getKategorie().equals(kategorie)) {
				if(lebensmittel.getLname().equals(name)) {
					return lebensmittel;
				}
			}
		}
		return null;
	}
}
