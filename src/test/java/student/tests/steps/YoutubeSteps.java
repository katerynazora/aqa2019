package student.tests.steps;

import pages.YoutubePage;
import util.WebDriverFacade;

public class YoutubeSteps {

    private final YoutubePage page;

    private final static YoutubeSteps instance = new YoutubeSteps();

    private YoutubeSteps() {
        page = new YoutubePage(WebDriverFacade.getInstance());
    }

    public static YoutubeSteps getInstance() {
        return instance;
    }

    public void loadPage() {
        page.loadPage();
    }

    public boolean isPageLoaded() {
        //TODO: fill this method
        return false;
    }

    public void search(String value) {
        //TODO: fill this method
    }

    public String getFirstSearchResult() {
        //TODO: fill this method
        return "";
    }
}
