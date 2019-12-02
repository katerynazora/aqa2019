package student.tests;

import org.testng.annotations.Test;

public class GoogleMapsPageTests extends AbstractTest {

    public GoogleMapsPageTests() {
        super();
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
