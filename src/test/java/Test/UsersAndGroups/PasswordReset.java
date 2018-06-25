package Test.UsersAndGroups;

import BrowserFunctions.Driver;
import Credentials.Users;
import Mapping.FullAdministrationMenu;
import Mapping.TheLibraryView;
import Test.Logon;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class PasswordReset extends Driver{


    Logon logon = new Logon();
    Users user = new Users();
    FullAdministrationMenu adminMenuMapping = new FullAdministrationMenu();
    TheLibraryView mapping = new TheLibraryView();
    Actions action = new Actions(driver);

    public void getFullAdminMenu () throws InterruptedException {
/*
        action.contextClick(mapping.getAdministration()).perform();
*/
        waitUntilPageLoads(mapping.getAdministration());
//        action.moveToElement(mapping.getAdministration()).click().build().perform();
        mapping.getAdministration().click();
        mapping.getFullAdministrationMenu().click();
    }

    @Test
    public void passwordReset() throws InterruptedException {
        createDriver();
        logon.openTestingPage();
        logon.Logon(user.getSysadm());
        getFullAdminMenu();
        waitUntilPageLoads(adminMenuMapping.getSystemManagement());
        adminMenuMapping.getSystemManagement().click();
        waitUntilPageLoads(adminMenuMapping.getUserManagement());
        adminMenuMapping.getUserManagement().click();
        waitUntilPageLoads(adminMenuMapping.getUsers());
        adminMenuMapping.getUsers().click();
    }

}
