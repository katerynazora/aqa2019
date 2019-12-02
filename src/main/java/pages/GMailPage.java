package pages;

import org.openqa.selenium.WebDriver;

public class GMailPage {

    private WebDriver driver;

    public GMailPage (WebDriver driver){
        this.driver = driver;
    }

    public void load(){
        driver.get("https://gmail.com/");
    }

    public void createMail(String mailTo, String emailSubj, String emailText){

    }
}
