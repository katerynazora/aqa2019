package student.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;

public class MyTestNG {

    private WebDriver driver;

    private GoogleSearchPage googleSearchPage;

    @BeforeSuite
    public void setUpWebDriver() {
        WebDriverManager manager = WebDriverManager.chromedriver();
        manager.setup();
        driver = new ChromeDriver();
        googleSearchPage = new GoogleSearchPage(driver);
    }

    @BeforeMethod
    public void loadGoogleCom() throws InterruptedException {
        googleSearchPage.load();
        Thread.sleep(2000);
    }

    @Test
    public void someTest() throws InterruptedException {
        driver.get("https://youtube.com");
        Thread.sleep(5000);
    }

    @Test
    public void somTest1() throws InterruptedException {
        driver.get("http://ukr.net");
        Thread.sleep(5000);
    }

    @Test
    public void somTest2() throws InterruptedException {
        driver.get("https://twitter.com");
        Thread.sleep(5000);
    }

    @AfterSuite
    public void quitDriver() {
        driver.quit();
    }
}
