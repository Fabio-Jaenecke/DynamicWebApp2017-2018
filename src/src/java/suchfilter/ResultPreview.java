package suchfilter;

/*
 * result which is displayed on webpage.
 * contains link to site and short metadata of keyword text
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
