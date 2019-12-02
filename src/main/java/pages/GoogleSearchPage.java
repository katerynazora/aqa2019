package pages;

import org.openqa.selenium.Keys;
import util.WebDriverFacade;

public class GoogleSearchPage extends AbstractPage {

    private static final String PAGE_URL = "https://google.com";

    public GoogleSearchPage(WebDriverFacade facade) {
        super(PAGE_URL, facade);
    }

    public void search(String searchInput) {
        facade.getElementByXpath("//input[@name='q']").sendKeys(searchInput);
        facade.getElementByXpath("//input[@name='q']").sendKeys(Keys.RETURN);
    }

    public void invokeGoogleMenu() {

    }

    public void selectMenuItem() {

    }
}
