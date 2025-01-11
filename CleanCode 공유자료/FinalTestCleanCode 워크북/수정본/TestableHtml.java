package cleancode1.fitnesse.testablehtml;

import fitnesse.responders.run.SuiteResponder;
import fitnesse.wiki.*;

public class TestableHtml {

    public String testableHtml(PageData pageData, boolean includeSuiteSetup) throws Exception {
        if (!pageData.hasAttribute("Test")) {
            return pageData.getHtml();
        }

        StringBuffer buffer = new StringBuffer();

        appendSuiteSetup(buffer, pageData, includeSuiteSetup);
        appendSetup(buffer, pageData);

        buffer.append(pageData.getContent());

        appendTeardown(buffer, pageData);
        appendSuiteTeardown(buffer, pageData, includeSuiteSetup);

        pageData.setContent(buffer.toString());
        return pageData.getHtml();
    }

    private void appendSuiteSetup(StringBuffer buffer, PageData pageData, boolean includeSuiteSetup) throws Exception {
        if (includeSuiteSetup) {
            appendInheritedPage(buffer, pageData.getWikiPage(), SuiteResponder.SUITE_SETUP_NAME, "!include -setup .");
        }
    }

    private void appendSetup(StringBuffer buffer, PageData pageData) throws Exception {
        appendInheritedPage(buffer, pageData.getWikiPage(), "SetUp", "!include -setup .");
    }

    private void appendTeardown(StringBuffer buffer, PageData pageData) throws Exception {
        appendInheritedPage(buffer, pageData.getWikiPage(), "TearDown", "!include -teardown .");
    }

    private void appendSuiteTeardown(StringBuffer buffer, PageData pageData, boolean includeSuiteSetup) throws Exception {
        if (includeSuiteSetup) {
            appendInheritedPage(buffer, pageData.getWikiPage(), SuiteResponder.SUITE_TEARDOWN_NAME, "!include -teardown .");
        }
    }

    private void appendInheritedPage(StringBuffer buffer, WikiPage wikiPage, String pageName, String prefix) throws Exception {
        WikiPage inheritedPage = PageCrawlerImpl.getInheritedPage(pageName, wikiPage);
        if (inheritedPage != null) {
            WikiPagePath pagePath = wikiPage.getPageCrawler().getFullPath(inheritedPage);
            String pagePathName = PathParser.render(pagePath);
            buffer.append(prefix).append(pagePathName).append("\n");
        }
    }
}
