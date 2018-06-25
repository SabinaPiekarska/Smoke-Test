package Mapping;

import BrowserFunctions.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FullAdministrationMenu extends Driver {

    public WebElement getSystemManagement(){
        return driver.findElement(By.xpath("//div[@id='ctl00_ctl00_c_rpbMenu']//span[text()='System management']"));
    }
    public WebElement getUserManagement(){
        return driver.findElement(By.xpath("//div[@id='ctl00_ctl00_c_rpbMenu']//span[text()='User Management']"));
    }
    public WebElement getUsers(){
        return driver.findElement(By.xpath("//div[@id='ctl00_ctl00_c_rpbMenu']//span[text()='UsersForm']"));
    }

}
