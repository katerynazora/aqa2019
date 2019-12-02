package student.tests.steps;

import pages.YoutubePage;
import util.WebDriverFacade;

public class YoutubeSteps {

    private final YoutubePage page = new YoutubePage(WebDriverFacade.getInstance());

    public void loadPage() {
        page.loadPage();
    }
}
