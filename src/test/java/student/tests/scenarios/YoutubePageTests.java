package student.tests.scenarios;

import org.testng.annotations.Test;
import student.tests.steps.YoutubeSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class YoutubePageTests extends AbstractTest {

    private YoutubeSteps steps = YoutubeSteps.getInstance();

    @Test
    public void testYoutubeLoad() {
        steps.loadPage();
        assertThat("Youtube page was expected.", steps.isPageLoaded(), is(true));
    }

    @Test
    public void testYoutubeSearchRelevant() {
        steps.loadPage();
        steps.search("Mammamia", true);
        assertThat("Search result must be present in output", steps.isValuePresentInTop("Mamma Mia", 3), is(true));
    }
}
