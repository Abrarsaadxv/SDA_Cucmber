package stepdefinitions.HW;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;


public class homework1Day2 {
    @Given("the user navigates to the {string} page")
    public void theUserNavigatesToThePage(String url) {
        Driver.getDriver().get("https:www.google.com");
           Driver.getDriver().findElement(By.name("q")).sendKeys(url+Keys.ENTER);



//         System.out.println("Navigating to page: " + url);

    }


    @Then("the user waites for {int} seconds")
    public void theUserWaitesForSeconds(int arg0) throws InterruptedException {
        Thread.sleep(5000);
    }

    @And("the user verifies that the page contains {string}")
    public void theUserVerifiesThatThePageContains(String arg0) {
//        Assert.assertTrue();
    }

    @And("the user close the page")
    public void theUserCloseThePage() {
    }
}
