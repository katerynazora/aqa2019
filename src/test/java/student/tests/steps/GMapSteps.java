package student.tests.steps;

import pages.GoogleMapsPage;
import util.WebDriverFacade;

public class GMapSteps {

    private final GoogleMapsPage page;

    private final static GMapSteps instance = new GMapSteps();

    private GMapSteps() {
        page = new GoogleMapsPage(WebDriverFacade.getInstance());
    }

    public static GMapSteps getInstance() {
        return instance;
    }

    public void loadPage() {
        page.loadPage();
    }

    public void search(String value) {
        //TODO: fill method
    }
}
