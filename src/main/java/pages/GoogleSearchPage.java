package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import util.WebDriverFacade;

import java.util.List;

public class GoogleSearchPage extends AbstractPage {

    private static final String PAGE_URL = "https://google.com";

    public GoogleSearchPage(WebDriverFacade facade) {
        super(PAGE_URL, facade);
    }

    public void search(String searchInput) {
        facade.getElementByXpath("//input[@name='q']").sendKeys(searchInput);
        facade.getElementByXpath("//input[@name='q']").sendKeys(Keys.RETURN);
    }
    public WebElement getSearchButton() {
        return facade.waitForElement(By.xpath("//div[@class='gNO89b']//input[@name='btnK']"));
                                               //div[@class='gNO89b']//input[@name='btnK']
    }
    public List<WebElement> getSearchResults() {
        return facade.waitForElements(By.xpath("//*[@class='bkWMgd']"));
    }

    public boolean isValuePresentInTop(String value) {
        for (WebElement element : getSearchResults()) {
            if (element.getText().contains(value)) {
                return true;
            }
        }
        return false;
    }

    public void selectMenuItem() {

    }
}
