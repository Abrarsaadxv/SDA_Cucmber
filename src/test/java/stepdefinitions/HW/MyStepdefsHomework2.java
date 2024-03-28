package stepdefinitions.HW;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyStepdefsHomework2 {
    WebDriver driver;
    @Given("user open browser")
    public void userOpenBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @When("I am on the broswer")
    public void iAmOnTheBroswer() {
        driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");

    }

    @Then("I should click on the {string} button and wait")
    public void iShouldClickOnTheStartButtonAndWait(String arg0) {
        driver.findElement(By.id("button00")).click();

    }

    @And("Click on the {string} button and wait")
    public void clickOnTheFirstButtonAndWait(String arg0) throws InterruptedException {
        driver.findElement(By.id("button01")).click();
        Thread.sleep(1000);

    }


    @And("click on the {string} button and wait")
    public void clickOnTheSeondButtonAndWait(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("button02")).click();
Thread.sleep(2000);
        driver.findElement(By.id("button03")).click();

        Assert.assertTrue(driver.findElement(By.id("buttonmessage")).isDisplayed());
    }



    @Then("close the browser")
    public void closeTheBrowser() {
      //  driver.close();
    }



}
