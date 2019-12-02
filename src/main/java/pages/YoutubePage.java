package pages;

import util.WebDriverFacade;

public class YoutubePage extends AbstractPage {

    private static final String PAGE_URL = "https://youtube.com";

    public YoutubePage(WebDriverFacade facade) {
        super(PAGE_URL, facade);
    }
}
