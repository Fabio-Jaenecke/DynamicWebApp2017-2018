package container;

/**
 * Dieses Enum gibt die möglichen SQL-Sortierungen an.
 *
 */
public enum Sorting {
    ASC, DESC;
  
  @Override
  public String toString() {
      return name().toLowerCase();
  }
}
