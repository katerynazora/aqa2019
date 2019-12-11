package student.tests.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GSearchSteps extends BaseStep {

    @Given("google page is loaded")
    public void loadPage() {
        googleSearchPage.loadPage();
    }

    @When("I search for {string}")
    public void search(String value) {
        googleSearchPage.search(value);
//        googleSearchPage.getSearchButton().click();
    }

    @Then("{string} is present in search results")
    public void isSearchResultPresent(String value) {
        assertThat("Search result must be present in output",
                googleSearchPage.isValuePresentInTop(value),is(true));
    }
}
