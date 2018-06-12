package Mapping;

import BrowserFunctions.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FullAdministrationMenu extends Driver {

    public WebElement getSystemManagement(){
        return driver.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[1]/div/ul/li[4]/a/span/span[2]"));
    }
    public WebElement getUserManagement(){
        return driver.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[1]/div/ul/li[4]/div/ul/li[1]/div/ul/li[1]/a/span/span[2]"));
    }
    public WebElement getUsers(){
        return driver.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[1]/div/ul/li[4]/div/ul/li[1]/div/ul/li[1]/a/span/span[2]"));
    }

}
