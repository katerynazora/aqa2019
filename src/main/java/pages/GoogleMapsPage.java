package pages;

import util.WebDriverFacade;

public class GoogleMapsPage extends AbstractPage {

    private static final String PAGE_URL = "https://maps.google.com";

    public GoogleMapsPage(WebDriverFacade driver) {
        super(PAGE_URL, driver);
    }
}
