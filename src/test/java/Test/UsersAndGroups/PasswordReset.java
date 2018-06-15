//package Test.UsersAndGroups;
//
//import BrowserFunctions.Driver;
//import Locations.FullAdminMenu;
//import Locations.UsersList;
//import Test.Logon;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//
//
//public class PasswordReset extends Driver {
//
//    Logon logon = new Logon();
//    UsersList usersList = new UsersList();
//    FullAdminMenu fullAdmMenu = new FullAdminMenu();
//
//    public void passwordReset() throws InterruptedException {
//
//        logon.Logon();
//        fullAdmMenu.getFullAdminMenu();
//        waitUntilPageLoads(By.id("ctl00_ctl00_c_rpbMenu"));
//        usersList.usersList();
//    }
//
//}
