package suchfilter;

import org.jsoup.nodes.Element;

public class Vorschau {

	private String url;
	private String tagName;
	private String text;
	
	public Vorschau(Element element) {
		this.tagName = element.tagName();
		this.text = element.text();
	}

	public String getTagName() {
		return tagName;
	}

	public String getText() {
		return text;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
}
