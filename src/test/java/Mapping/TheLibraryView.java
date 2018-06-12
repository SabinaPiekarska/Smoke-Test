package Mapping;

import BrowserFunctions.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TheLibraryView extends Driver{

    public WebElement getAdministration () {
        return driver.findElement(By.id("ctl00_ctl00_administrationMenu"));
    }
    public WebElement getFullAdministrationMenu () {
        return driver.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/ul/li[1]/a"));
    }
}
