package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

    private static final String YOUTUBE_BTN_XPATH = "//a[contains(@href,'you')]";

    private static final String IFRAME_XPATH = "//iframe";

    private WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void load() {
        driver.get("https://google.com/");
    }

    public void search(String searchInput) {

    }

    public void invokeGoogleMenu() {
        driver.findElement(By.id("gbwa")).click();
    }

    public void selectMenuItem() {
        driver.switchTo().frame(driver.findElement(By.xpath(IFRAME_XPATH)));
        driver.findElement(By.xpath(YOUTUBE_BTN_XPATH)).click();
        driver.switchTo().defaultContent();
    }
}
