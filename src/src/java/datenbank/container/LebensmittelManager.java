package datenbank.container;

/**
 * Definiert die Verwaltung von Lebensmitteln für den Zugriff auf die Datenbank.
 */
public abstract class LebensmittelManager {

  protected String lebensmittelname;
  protected int index;
  protected String karenzphase;
  protected String dauerernaehrung;
  protected String kategorie;
  protected int zindex;
  protected int platzierung;
  protected int azugriffe;
  protected int kindex;
  protected String kname;
  
  /**
   * Gibt Lebensmitteldaten die Zuweisung 'Null' oder 'Nicht Null'
   * 
   * @return true or false
   */
  public abstract boolean isNil();
  
  public abstract String getLname();
}
