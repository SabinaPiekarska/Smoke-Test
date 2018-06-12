package Test;

import Mapping.LogonPage;

public class Logon {

    public void Logon(){
    LogonPage logonpage = new LogonPage();

    logonpage.getLogon().sendKeys("sysadm");
    logonpage.getPassword().sendKeys("asdqwe");
    logonpage.getLogonButton().click();
}
}
