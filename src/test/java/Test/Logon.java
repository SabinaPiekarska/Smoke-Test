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
    private String basicURL = "http://fhw2016-1/FH/FileHold/WebClient/LoginForm.aspx";

    //     Method that opens registration page
    public void openTestingPage () throws InterruptedException {
        driver.get(basicURL);
        waitUntilPageLoads(logonMapping.getLogon());
    }
    public void Logon(String userName) throws InterruptedException {
        tools.clearSendKeys(logonMapping.getLogon(), userName);
        tools.clearSendKeys(logonMapping.getPassword(), user.getPassword());
        logonMapping.getLogonButton().click();
}
    public void logoff(){
        mapping.getLogoffButton().click();
    }
}
