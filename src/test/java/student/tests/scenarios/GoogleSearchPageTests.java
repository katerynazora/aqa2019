package student.tests.scenarios;

import org.testng.annotations.Test;
import student.tests.steps.GSearchSteps;

public class GoogleSearchPageTests extends AbstractTest {

    private GSearchSteps steps = GSearchSteps.getInstance();

    @Test
    public void validatePageIsLoaded() {
        steps.loadPage();
        //TODO: validate page is loaded
    }

    @Test
    public void validateSearchRelevance() {
        steps.loadPage();
        steps.search("Mammamia");
        steps.getFirstSearchResult();
    }
}
