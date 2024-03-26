package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class scenariooutlinestepdef {
    @Given("the user navigates to the Ebay homepage")
    public void theUserNavigatesToTheEbayHomepage() {
        Driver.getDriver().get("https://www.ebay.com");

    }


    @When("the user searches for {string}")
    public void theUserSearchesFor(String string) {
        Driver.getDriver().findElement(By.id("gh-ac")).sendKeys(string + Keys.ENTER);


    }

    @Then("the user verifies that the search results contain {string}")
    public void theUserVerifiesThatTheSearchResultsContain(String string) {
      List<WebElement> serchresult = Driver.getDriver().findElements(By.xpath(""));

    }
}
