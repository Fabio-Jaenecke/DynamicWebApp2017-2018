package datenbank.container;

/** Diese Klasse dient als Null-Objekt vom Typ Lebensmitteldaten.
 * 
 * @author fabio jaenecke
 *
 */
public class NullLebensmittelDaten extends LebensmittelManager {
  
  /**
   * Standardkonstruktor fuer ein Lebensmittel.
   * @param name der Name des Lebensmittels
   */
  public NullLebensmittelDaten(String lebensmittelname) {
    this.lebensmittelname = lebensmittelname;
  }

  /**
   * Gib den Lebensmittelnamen.
   * @return lebensmittelname
   */
  @Override
  public String getLname() {
    return "Not available in the Database";
  }
  
  @Override
  public boolean isNil() {
     return true;
  }
}
