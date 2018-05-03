package container;

public enum DauerErnaehrung {
  GUT, MITTEL,SCHLECHT;
  
  @Override
  public String toString() {
      return name().toLowerCase();
  }
}
