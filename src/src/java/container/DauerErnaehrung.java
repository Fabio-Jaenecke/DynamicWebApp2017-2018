package container;

/**
 * Dieses Enum gibt die einzelnen Stufen von DauerErnaehrung an.
 *
 */
public enum DauerErnaehrung {
  GUT, MITTEL,SCHLECHT;
  
  @Override
  public String toString() {
      return name().toLowerCase();
  }
}
