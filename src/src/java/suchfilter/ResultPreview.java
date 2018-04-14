package suchfilter;

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
