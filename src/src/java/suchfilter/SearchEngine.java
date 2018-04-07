package suchfilter;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class SearchEngine {

	ConverterManager manager = new ConverterManager();
	
	public Elements searchForHTags(Document doc) {
		Elements htags = doc.getElementsByTag("h");
		return htags;
	}
	
	public Elements searchForATags(Document doc) {
		Elements htags = doc.getElementsByTag("a");
		return htags;
	}
	
	public Elements searchForTableHeadsTags(Document doc) {
		Elements htags = doc.getElementsByTag("a");
		return htags;
	}
	
	public Elements searchForPTags(Document doc) {
		Elements htags = doc.getElementsByTag("a");
		return htags;
	}
}
