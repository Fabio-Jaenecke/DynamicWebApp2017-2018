package container;

/**
 *
 * Dieses Enum gibt die einzelnen Stufen von KarenzPhasen an.
 *
 */
public enum KarenzPhasen {
  GUT, MITTEL, SCHLECHT;
  
  @Override
  public String toString() {
      return name().toLowerCase();
  }
}
