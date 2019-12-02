package student.tests.scenarios;

import org.testng.annotations.AfterSuite;
import util.WebDriverFacade;

public class AbstractTest {

    @AfterSuite
    public void quitDriver() {
        WebDriverFacade.getInstance().quit();
    }
}
