package com.google.stepsdefinition;

import com.google.pages.GoogleHomePage;
import com.google.pages.GoogleSearchResultsPage;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class GoogleSearchSteps{

    @Steps
    GoogleHomePage googleHomePage;

    @Steps
    GoogleSearchResultsPage googleSearchResultsPage;

    @Given("User is on Google Home")
    public void givenUserIsOnGoogleHome() {
        googleHomePage.navigateToGoogleHome();
    }

    @When("Make a search with '<keyword>'")
    public void whenMakeASearchWithkeyword(@Named("keyword") String strKeyword) {
        googleHomePage.makeASearchWithKeyword(strKeyword);
    }

    @Then("Navigate to search Result Page with expected result as '<expectedResult>'")
    public void thenNavigateToSearchResultPageWithExpectedResultAsexpectedResult(@Named("expectedResult") String strExpectedResult) {
        Assert.assertTrue(googleSearchResultsPage.isExpectedResultDisplayed(strExpectedResult));
    }
}
