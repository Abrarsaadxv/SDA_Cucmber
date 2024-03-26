package stepdefinitions.HW;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class MyStepdefsHomework3 {
    WebDriver driver;
    @Then("I should  fill The First and last name")
    public void iShouldFillTheFirstAndLastName() {
        driver= new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
        driver.findElement(By.id("firstname")).sendKeys("Alex");
        driver.findElement(By.id("surname")).sendKeys("Alii");
//        driver.findElement(By.id("age")).sendKeys("33");
    }

    @And("I should  fill The age")
    public void iShouldFillTheAge() {
        driver.findElement(By.id("age")).sendKeys("33");


    }

    @Then("I should  write the  Country:")
    public void iShouldWriteTheCountry() {
        WebElement country = driver.findElement(By.id("country"));
        Select select = new Select(country);
        select.deselectByIndex(4);

    }

    @And("I should  write the  a Notes")
    public void iShouldWriteTheANotes() {
//      WebElement addnote=  driver.findElement(By.id("notes"));
//      addnote.click();
//       addnote.sendKeys(" student  at SDA");

    }

    @Then("I should  submit the form")
    public void iShouldSubmitTheForm() {
//        driver.findElement(By.xpath("//input['type =submit'][4]")).click();

    }

    @Then("I close the  browser")
    public void iCloseTheBrowser() {
//        driver.close();

    }
}
