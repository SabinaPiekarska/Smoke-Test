package Test;


import BrowserFunctions.Driver;
import Credentials.Users;
import Mapping.LogonPage;

public class Logon extends Driver {

    LogonPage logonpage = new LogonPage();
    Users user = new Users();

    public void Logon() {
        logonpage.getLogon().sendKeys(user.getSysadm());
        logonpage.getPassword().sendKeys(user.getPassword());
        logonpage.getLogonButton().click();
}
}
