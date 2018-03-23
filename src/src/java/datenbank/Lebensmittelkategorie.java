package datenbank;

/**
 * stellt die Java-Klasse zur Entitaet Lebensmittelkategorie
 * in der Datenbank da
 * @author Raphael Caradonna
 *
 */
public class Lebensmittelkategorie {

	private int kindex;
	private String kname;
	
	public Lebensmittelkategorie(int kindex, String kname) {
		this.kindex = kindex;
		this.kname = kname;
	}
	
	public int getKindex() {
		return kindex;
	}
	public void setKindex(int kindex) {
		this.kindex = kindex;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
}
