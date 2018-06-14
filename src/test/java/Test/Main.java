package Test;


import BrowserFunctions.Driver;
import Locations.FullAdminMenu;
import Test.Library.CreateCabinet;
import Test.UsersAndGroups.PasswordReset;
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
        CreateCabinet cabcreate = new CreateCabinet();
        PasswordReset passrester = new PasswordReset();

        Driver driver = new Driver();
        FullAdminMenu fulladmmenu = new FullAdminMenu();

        driver.openTestingPage();
        driver.waitUntilPageLoads(By.id("Login_UserName"));
        passrester.passwordReset();
        /*logonpage.Logon();
        cabcreate.createACabinet();
*/
      /*  driver.waitUntilPageLoads(By.xpath("/html/body/form/div[3]/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/span"));
        fulladmmenu.getAdminMenu();
        fulladmmenu.SystemManagement();*/
    }
}