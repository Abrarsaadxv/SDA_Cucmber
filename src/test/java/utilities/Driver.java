package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    private  Driver(){}


    private  static  ThreadLocal<WebDriver> driver = new ThreadLocal<>();

public  static WebDriver getDriver() {

    if (driver.get() == null) {
        switch (ConfigReader.getProoperty("browser")) {

            case "chrome":
                driver.set(new ChromeDriver());
                break;
            default:
                driver.set(new ChromeDriver());
                break;


        }

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get().manage().window().maximize();

    }
    return driver.get();

}
    public static void closeDriver(){
        driver.get().close();
        driver.set(null);
    }


}


