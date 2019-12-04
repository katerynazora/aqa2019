package student.tests.steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
        return page.getSearch().isDisplayed();
    }

    public WebElement setSearchFieldValue(String value) {
        WebElement input = page.getSearch();
        input.click();
        input.sendKeys(value);
        return input;
    }

    public void search(String value, boolean useButton) {
        if (useButton) {
            setSearchFieldValue(value);
            page.getSearchButton().click();
        } else {
            setSearchFieldValue(value).sendKeys(Keys.RETURN);
        }
    }

    public boolean isValuePresentInTop(String value, int amountOfResults) {
        for (WebElement element : page.getSearchResults().subList(0, amountOfResults)) {
            if (element.getText().contains(value)) {
                return true;
            }
        }
        return false;
    }
}
