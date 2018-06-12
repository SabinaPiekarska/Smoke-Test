package BrowserFunctions;

import Test.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {
    public WebDriver driver;
    String basicURL = "http://fhw2016-1/FH/FileHold/WebClient/LoginForm.aspx";

    public Driver() {
        this.driver = Main.driver;
    }

    //     Method that waits till specified element will be visible and enable to click
    public void waitUntilPageLoads(By load) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(load));
    }

    //     Method that opens registration page
    public void openTestingPage (){
        driver.get(basicURL);
    }

}