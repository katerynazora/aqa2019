package student.tests;

import org.testng.annotations.Test;

public class CrossPageIntegrationTests extends AbstractTest {

    public CrossPageIntegrationTests() {
        super();
    }

    @Test
    public void someTest() throws InterruptedException {
        googleSearchPage.load();
        Thread.sleep(5000);
        youtubePage.loadPage();
        Thread.sleep(5000);
    }
}
