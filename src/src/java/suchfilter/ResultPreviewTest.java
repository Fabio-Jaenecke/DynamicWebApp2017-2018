package suchfilter;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;

/*
 * tests if search results for a keyword are correctly saved
 * for matching criterias of searchEngine a mockup-html is used
 */
public class ResultPreviewTest {

	ResultPreview resultPreview;
	
	/*
	 * creates a document from html file, makes search for keyword in searchEngine,
	 * creates searchresult and adds it to resultpreview
	 */
	@Before
	public void setUp() throws Exception {
		XmlConverter converter = new XmlConverter();
		ArrayList<Document> document = new ArrayList<>();
		Searchresult searchresult;
		ArrayList<Searchresult> result = new ArrayList<>();
		
		SearchEngine searcher = new SearchEngine("Lorem ipsum");
		document.add(converter.convertToXml(new File("src/java/suchfilter/testing/mockup.html")));
		searcher.sucheNachText(document);
		result.addAll(searcher.getSearchResults());
		searchresult = new Searchresult(document.get(0), result.get(0).getKeyElements());
		searchresult.prepareResult();
		resultPreview = new ResultPreview(
				searchresult.getPreviews().get(0).getUrl(), searchresult.getPreviews().get(0).getMetaData());
	}

	/*
	 * tests if url exists
	 */
	@Test
	public void testGetUrl() {
		assertNotNull(resultPreview.getUrl());
	}

	/*
	 * tests if metadata exists
	 */
	@Test
	public void testGetMetaData() {
		assertNotNull(resultPreview.getMetaData());
	}

}
