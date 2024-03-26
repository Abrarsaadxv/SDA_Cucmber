package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;
 import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    public Hooks() {
    }
    @Before
    public void setUp(Scenario scenario) {
        System.out.println("Before the scenario: Setting up the environment...");
        System.out.println("Scenario id: " + scenario.getId());
        System.out.println("Scenario name: " + scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("After the scenario, cleaning up the test environment");
        System.out.println("Scenario status: " + String.valueOf(scenario.getStatus()));
        System.out.println("Scenario isFailed?: " + scenario.isFailed());
        if (scenario.isFailed()) {
            byte[] screenshot = (byte[])((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "FailedScreenshot");
        }

    }

}
