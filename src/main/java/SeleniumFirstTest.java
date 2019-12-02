import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GMailPage;
import pages.GoogleSearchPage;

public class SeleniumFirstTest {

    public static void main(String... args) {
        WebDriverManager manager = WebDriverManager.chromedriver();
        manager.setup();

        WebDriver driver = new ChromeDriver();


    }
}
