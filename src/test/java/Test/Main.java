package Test;


import BrowserFunctions.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Main {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        System.setProperty("webdriver.gecko.driver", "C:\\\\geckodriver.exe");
        driver = new FirefoxDriver(capabilities);
        Logon logonpage = new Logon();

        Driver driver = new Driver();
        AccessToTheFullAdminMenu fulladmmenu = new AccessToTheFullAdminMenu();

        driver.openTestingPage();
        driver.waitUntilPageLoads(By.id("Login_UserName"));
        logonpage.Logon();
      /*  driver.waitUntilPageLoads(By.xpath("/html/body/form/div[3]/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/span"));
        fulladmmenu.getAdminMenu();
        fulladmmenu.SystemManagement();*/
    }
}