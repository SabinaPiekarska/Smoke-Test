package BrowserFunctions;


import Mapping.LogonPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


import java.util.concurrent.TimeUnit;

public class Driver {

    @BeforeSuite
    //   Method that creates new Firefox driver and maximize browser win    public static WebDriver driver;dow
    public void createDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\\\geckodriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("marionette", true);
        driver = new FirefoxDriver(firefoxOptions);
        driver.manage().window().maximize();
    }

    //     Method that waits till specified element will be visible and enable to click
    public void waitUntilPageLoads(WebElement load) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, 60);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(load));
    }



    public void quitDriver() {
        driver.quit();
    }

}