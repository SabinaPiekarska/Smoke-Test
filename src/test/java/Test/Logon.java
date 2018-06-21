package Test;


import BrowserFunctions.Driver;
import BrowserFunctions.Tools;
import Credentials.Users;
import Mapping.LogonPage;
import Mapping.TheLibraryView;

public class Logon extends Driver {

    LogonPage logonMapping = new LogonPage();
    TheLibraryView mapping = new TheLibraryView();
    Users user = new Users();
    Tools tools = new Tools();


    public void Logon(String userName) throws InterruptedException {
        openTestingPage();
        tools.clearSendKeys(logonMapping.getLogon(), userName);
        tools.clearSendKeys(logonMapping.getPassword(), user.getPassword());
        logonMapping.getLogonButton().click();
}
    public void logoff(){
        mapping.getLogoffButton().click();
    }
}
