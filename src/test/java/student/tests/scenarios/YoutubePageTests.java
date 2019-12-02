package student.tests;

import org.testng.annotations.Test;
import pages.YoutubePage;
import util.WebDriverFacade;

public class YoutubePageTests extends AbstractTest {

    public YoutubePageTests() {
        super(new YoutubePage(WebDriverFacade.getInstance()));
    }

    @Test
    public void someTest() throws InterruptedException {
        googleSearchPage.load();
        Thread.sleep(5000);
        youtubePage.loadPage();
        Thread.sleep(5000);
        googleMapsPage.loadPage();
        Thread.sleep(5000);
    }


}
