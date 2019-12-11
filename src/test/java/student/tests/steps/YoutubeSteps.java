package student.tests.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class YoutubeSteps extends BaseStep {

    @Given("Youtube page is loaded")
    public void loadPage() {
        youtubePage.loadPage();
    }

    @When("I search for video {string}")
    public void searchForVideo(String value) {
        youtubePage.getSearch().sendKeys(value);
        youtubePage.getSearchButton().click();
    }
    @Then("Youtube page loaded successfully")
    public void validatePageloaded() {
        System.out.println("Youtube: Success!");
    }

    @Then("Youtube video found!")
    public void validateVideoFound() {
        System.out.println("validating...");
    }

    @Given("Search for Mammamia")
    public void loadPage1() {
        youtubePage.loadPage();
    }

    @When("I search for string {string}")
    public void searchForString (String value){
        youtubePage.getSearch().sendKeys(value);
        youtubePage.getSearchButton().click();
    }
    @Then("{string} is present in search results")
    public void isVideoResultPresent(String value){assertThat("Video result must be present in output",
            youtubePage.isValuePresentInTop(value),is(true));
    }
}

