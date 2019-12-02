package student.tests;

import org.testng.annotations.AfterSuite;
import pages.AbstractPage;
import pages.GoogleMapsPage;
import pages.GoogleSearchPage;
import pages.YoutubePage;
import util.WebDriverFacade;

public class AbstractTest {

    protected static GoogleMapsPage googleMapsPage;

    protected static GoogleSearchPage googleSearchPage;

    protected static YoutubePage youtubePage;

    public AbstractTest() {

    }

    public AbstractTest(AbstractPage page) {
        if (page instanceof GoogleSearchPage) {
            googleSearchPage = (GoogleSearchPage) page;
        }
        if (page instanceof GoogleMapsPage) {
            googleMapsPage = (GoogleMapsPage) page;
        }
        if (page instanceof YoutubePage) {
            youtubePage = (YoutubePage) page;
        }
    }

    @AfterSuite
    public void quitDriver() {
        WebDriverFacade.getInstance().quit();
    }
}
