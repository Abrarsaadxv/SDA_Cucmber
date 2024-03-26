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

    @Given("open the website")
    public void open_the_website() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");


    }
    @Then("Insert {string} and {string} and {string}")
    public void insert_and_and(String Fname, String Lname, String age) {
        driver.findElement(By.id("firstname")).sendKeys(Fname);
        driver.findElement(By.id("surname")).sendKeys(Lname);
          driver.findElement(By.id("age")).sendKeys(age);



    }
    @Then("Select the {string}")
    public void select_the(String country) {
        WebElement SelectCountry = driver.findElement(By.id("country"));
        Select select = new Select(SelectCountry);
        select.selectByVisibleText(country);
       // driver.findElements(By.id("notes"))

    }
    @Then("Click on submit button")
    public void click_on_submit_button() {
        driver.findElement(By.xpath("//input['type =submit'][4]")).click();



    }
    @Then("Verfiy {string} Displayed")
    public void verfiy_displayed(String verfiymessage) {
        WebElement validationMessage = driver.findElement(By.xpath("//*[text()='Input Validation Response']"));
        Assert.assertTrue(validationMessage.getText().contains(verfiymessage));


    }
    @Then("Close the browser")
    public void close_the_browser() {
     //   driver.close();

    }
}
