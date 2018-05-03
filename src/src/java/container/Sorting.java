package container;

public enum Sorting {
    ASC, DESC;
  
  @Override
  public String toString() {
      return name().toLowerCase();
  }
}
