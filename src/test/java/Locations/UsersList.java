package Locations;

import BrowserFunctions.Driver;
import Mapping.FullAdministrationMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class UsersList extends Driver {

    FullAdministrationMenu fulladminmenu = new FullAdministrationMenu();
    JavascriptExecutor js = (JavascriptExecutor)driver;

    public void usersList() throws InterruptedException {
        fulladminmenu.getSystemManagement().click();
        fulladminmenu.getUserManagement().click();
        fulladminmenu.getUsers().click();
    }
}
