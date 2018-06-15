package Test;


import BrowserFunctions.Driver;
import Credentials.Users;
import Mapping.LogonPage;
import Mapping.TheLibraryView;
import org.testng.annotations.Test;

public class Logon extends Driver {

    LogonPage logonpage = new LogonPage();
    TheLibraryView mapping = new TheLibraryView();
    Users user = new Users();


    public void Logon(String userName) {
        logonpage.getLogon().sendKeys(userName);
        logonpage.getPassword().sendKeys(user.getPassword());
        logonpage.getLogonButton().click();
}
    public void logoff(){
        mapping.getLogoffButton().click();
    }
}
