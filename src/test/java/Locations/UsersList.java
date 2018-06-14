package Locations;

import BrowserFunctions.Driver;
import Mapping.FullAdministrationMenu;
import org.openqa.selenium.JavascriptExecutor;

public class UsersList extends Driver {

    FullAdministrationMenu fulladminmenu = new FullAdministrationMenu();
    JavascriptExecutor js = (JavascriptExecutor)driver;

    public void usersList(){
        fulladminmenu.getSystemManagement().click();
        js.executeScript("javascript:InvokeResize();");
        fulladminmenu.getUserManagement().click();
        fulladminmenu.getUsers().click();
    }
}
