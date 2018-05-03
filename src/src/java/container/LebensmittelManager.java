package container;

/**
 * Eine Klasse zur Verwaltung von Lebensmitteln.
 */
public abstract class LebensmittelManager {

  protected String lebensmittelname;
  protected int index;
  protected String karenzphase;
  protected String dauerernaehrung;
  protected String kategorie;
  
  public abstract boolean isNil();
  
  public abstract String getLname();
}
