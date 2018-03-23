package datenbank;

/**
 * stellt die Java-Klasse zur Entitaet Nahrstoff
 * in der Datenbank da
 * @author Raphael Caradonna
 *
 */
public class Naehrstoff {
	
	private int nindex;
	private String nname;
	
	public Naehrstoff(int nindex, String nname) {
		this.nindex = nindex;
		this.nname = nname;
	}
	public int getNindex() {
		return nindex;
	}
	public void setNindex(int nindex) {
		this.nindex = nindex;
	}
	public String getNname() {
		return nname;
	}
	public void setNname(String nname) {
		this.nname = nname;
	}
}
