package suchfilter;

/*
 * Ergebnis, das auf der Webseite angezeigt wird.
 * enthält einen Link zur Site und kurze Metadaten des Keyword-Textes
 */
public class ResultPreview {
  
  private String url;
  private String metaData;
  
  public ResultPreview(String url, String metaData) {
    this.url = url;
    this.metaData = metaData;
  }
  
  public String getUrl() {
    return url;
  }
  
  public String getMetaData() {
    return metaData;
  }
}
