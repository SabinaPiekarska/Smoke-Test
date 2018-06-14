package Test;


import BrowserFunctions.Driver;
import Credentials.Users;
import Mapping.LogonPage;

public class Logon extends Driver {

    public void Logon() {
    LogonPage logonpage = new LogonPage();
    Users user = new Users();

        logonpage.getLogon().sendKeys(user.getSysadm());
        logonpage.getPassword().sendKeys(user.getPassword());
        logonpage.getLogonButton().click();

}
}
