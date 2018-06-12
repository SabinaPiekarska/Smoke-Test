package Mapping;

import BrowserFunctions.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogonPage extends Driver {

    public WebElement getLogon(){
        return driver.findElement(By.id("Login_UserName"));
    }
    public WebElement getPassword(){
        return driver.findElement(By.id("Login_Password"));
    }
    public WebElement getLogonButton(){
        return driver.findElement(By.id("Login_LoginButton"));
    }
}
