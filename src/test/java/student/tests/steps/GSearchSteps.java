package student.tests.steps;

import pages.GoogleSearchPage;
import util.WebDriverFacade;

public class GSearchSteps {

    private final GoogleSearchPage page;

    private final static GSearchSteps instance = new GSearchSteps();

    private GSearchSteps() {
        page = new GoogleSearchPage(WebDriverFacade.getInstance());
    }

    public static GSearchSteps getInstance() {
        return instance;
    }

    public void loadPage() {
        page.loadPage();
    }

    public boolean isPageLoaded() {
        //TODO: fill method
        return false;
    }

    public void search(String value) {
        //TODO: fill method
    }

    public String getFirstSearchResult() {
        //TODO: fill method
        return "";
    }
}
