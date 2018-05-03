package container;

public enum KarenzPhasen {
  GUT, MITTEL, SCHLECHT;
  
  @Override
  public String toString() {
      return name().toLowerCase();
  }
}
