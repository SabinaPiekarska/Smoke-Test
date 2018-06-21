package BrowserFunctions;


import Mapping.LogonPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static WebDriver driver;
    LogonPage logonMapping = new LogonPage();
    private String basicURL = "http://fhw2016-1/FH/FileHold/WebClient/LoginForm.aspx";

    @BeforeSuite
    //   Method that creates new Firefox driver and maximize browser window
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

    //     Method that opens registration page
    public void openTestingPage () throws InterruptedException {
        driver.get(basicURL);
        waitUntilPageLoads(logonMapping.getLogon());
    }

    public void quitDriver() {
        driver.quit();
    }

}