package student.tests.scenarios;

import org.testng.annotations.Test;
import student.tests.steps.YoutubeSteps;

public class YoutubePageTests extends AbstractTest {

    private YoutubeSteps steps = YoutubeSteps.getInstance();

    @Test
    public void testYoutubeLoad() {
        steps.loadPage();
        //TODO: check assertTrue() if page has been loaded
    }

    @Test
    public void testYoutubeSearchRelevant() {
        steps.loadPage();
        steps.search("Mammamia");
        // TODO: assert serach value: ABBA Mammamia
    }
}
