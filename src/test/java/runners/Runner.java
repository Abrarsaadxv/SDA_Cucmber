package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepdefinitions"},
        features = {"src/test/resources/feateures/dataTable.feature"},
        plugin = {"html:cucumber-reports/html/report.html", "json:cucumber-reports/json/report.json"},
        monochrome = true ,
        dryRun = false

)
public class Runner {
    public Runner() {
    }
}
