package student.tests.steps;

import pages.YoutubePage;
import util.WebDriverFacade;

public class GSearchSteps {

    private final YoutubePage page = new YoutubePage(WebDriverFacade.getInstance());

    public void loadPage() {
        page.loadPage();
    }
}
