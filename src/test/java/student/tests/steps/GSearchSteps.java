package student.tests.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GSearchSteps extends BaseStep {

    @Given("google page is loaded")
    public void loadPage() {
        googleSearchPage.loadPage();
    }

    @When("I switch to {string} page")
    public void switchTOPage(String value) {
        youtubePage.loadPage();
        System.out.println("Not implemented yet!");
    }

    @When("I search for {string}")
    public void search(String value) {
        googleSearchPage.search(value);
    }

    @Then("{string} is present in search results")
    public void isSearchResultPresent(String value) {
        System.out.println("I've searched for " + value);
    }
}
