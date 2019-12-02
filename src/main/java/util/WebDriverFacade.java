package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverFacade {

    private static WebDriver driver;

    private final static WebDriverFacade instance = new WebDriverFacade();

    private WebDriverFacade() {
        WebDriverManager manager = WebDriverManager.chromedriver();
        manager.setup();
        driver = new ChromeDriver();
    }

    public static WebDriverFacade getInstance() {
        return instance;
    }

    public WebElement getElementByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public List<WebElement> getElementsByXpath(String xpath) {
        return driver.findElements(By.xpath(xpath));
    }

    public void loadPage(String url) {
        driver.get(url);
    }

    public void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
