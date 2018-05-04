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
  protected int zindex;
  protected int platzierung;
  protected int azugriffe;
  protected int kindex;
  protected String kname;
  
  public abstract boolean isNil();
  
  public abstract String getLname();
}
