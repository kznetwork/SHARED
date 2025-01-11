package cleancode1.fitnesse.testablehtml;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fitnesse.wiki.PageCrawler;
import fitnesse.wiki.PageData;
import fitnesse.wiki.WikiPage;
import fitnesse.wiki.WikiPagePath;
import fitnesse.wiki.PathParser;

public class TestableHtmlTest {

    private TestableHtml testableHtml;
    private PageData mockPageData;
    private WikiPage mockWikiPage;
    private PageCrawler mockPageCrawler;

    @Before
    public void setUp() {
        testableHtml = new TestableHtml();
        mockPageData = mock(PageData.class);
        mockWikiPage = mock(WikiPage.class);
        mockPageCrawler = mock(PageCrawler.class);

        when(mockPageData.getWikiPage()).thenReturn(mockWikiPage);
        when(mockWikiPage.getPageCrawler()).thenReturn(mockPageCrawler);
    }

    @Test
    public void testTestableHtml_NoTestAttribute() throws Exception {
        when(mockPageData.hasAttribute("Test")).thenReturn(false);
        when(mockPageData.getHtml()).thenReturn("<html></html>");

        String result = testableHtml.testableHtml(mockPageData, true);

        assertEquals("<html></html>", result);
        verify(mockPageData).hasAttribute("Test");
        verify(mockPageData).getHtml();
    }

    @Test
    public void testTestableHtml_WithTestAttributeAndNoInheritedPages() throws Exception {
        when(mockPageData.hasAttribute("Test")).thenReturn(true);
        when(mockPageData.getContent()).thenReturn("Page Content");

        String result = testableHtml.testableHtml(mockPageData, true);

        assertEquals("Page Content", result.trim());
        verify(mockPageData).setContent(anyString());
    }

    @Test
    public void testAppendInheritedPage_SuiteSetup() throws Exception {
        WikiPage mockInheritedPage = mock(WikiPage.class);
        WikiPagePath mockPath = mock(WikiPagePath.class);

        when(mockPageData.hasAttribute("Test")).thenReturn(true);
        when(mockWikiPage.getPageCrawler()).thenReturn(mockPageCrawler);
        when(mockPageCrawler.getFullPath(mockInheritedPage)).thenReturn(mockPath);
        when(PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_SETUP_NAME, mockWikiPage)).thenReturn(mockInheritedPage);
        when(PathParser.render(mockPath)).thenReturn("SuiteSetupPath");

        when(mockPageData.getContent()).thenReturn("Page Content");

        String result = testableHtml.testableHtml(mockPageData, true);

        assertTrue(result.contains("!include -setup .SuiteSetupPath"));
        verify(mockPageData).setContent(anyString());
    }

    @Test
    public void testAppendInheritedPage_TearDown() throws Exception {
        WikiPage mockInheritedPage = mock(WikiPage.class);
        WikiPagePath mockPath = mock(WikiPagePath.class);

        when(mockPageData.hasAttribute("Test")).thenReturn(true);
        when(mockWikiPage.getPageCrawler()).thenReturn(mockPageCrawler);
        when(mockPageCrawler.getFullPath(mockInheritedPage)).thenReturn(mockPath);
        when(PageCrawlerImpl.getInheritedPage("TearDown", mockWikiPage)).thenReturn(mockInheritedPage);
        when(PathParser.render(mockPath)).thenReturn("TearDownPath");

        when(mockPageData.getContent()).thenReturn("Page Content");

        String result = testableHtml.testableHtml(mockPageData, true);

        assertTrue(result.contains("!include -teardown .TearDownPath"));
        verify(mockPageData).setContent(anyString());
    }

    @Test
    public void testTestableHtml_IncludeSuiteTeardown() throws Exception {
        WikiPage mockSuiteTeardown = mock(WikiPage.class);
        WikiPagePath mockPath = mock(WikiPagePath.class);

        when(mockPageData.hasAttribute("Test")).thenReturn(true);
        when(mockWikiPage.getPageCrawler()).thenReturn(mockPageCrawler);
        when(mockPageCrawler.getFullPath(mockSuiteTeardown)).thenReturn(mockPath);
        when(PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_TEARDOWN_NAME, mockWikiPage)).thenReturn(mockSuiteTeardown);
        when(PathParser.render(mockPath)).thenReturn("SuiteTeardownPath");

        when(mockPageData.getContent()).thenReturn("Page Content");

        String result = testableHtml.testableHtml(mockPageData, true);

        assertTrue(result.contains("!include -teardown .SuiteTeardownPath"));
        verify(mockPageData).setContent(anyString());
    }
}
