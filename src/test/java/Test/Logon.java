package Test;


import BrowserFunctions.Driver;
import Mapping.LogonPage;
import Mapping.TheLibraryView;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class Logon extends Driver {

    public void Logon() throws InterruptedException {
    LogonPage logonpage = new LogonPage();
    TheLibraryView mapping = new TheLibraryView();

    logonpage.getLogon().sendKeys("sysadm");
    logonpage.getPassword().sendKeys("asdqwe");
    logonpage.getLogonButton().click();
        ((JavascriptExecutor)driver).executeScript("\"javascript:TreeView_ToggleNode(ctl00_ctl00_c_LibraryTree_lst_Data,25,document.getElementById('ctl00_ctl00_c_LibraryTree_lstn25'),' ',document.getElementById('ctl00_ctl00_c_LibraryTree_lstn25Nodes'))\"");
        waitUntilPageLoads(By.id("ctl00_ctl00_c_LibraryTree_lstt25"));
    Actions action = new Actions(driver);
    action.contextClick(mapping.getLibraryTree()).perform();
    mapping.getAddCabinet().click();
    waitUntilPageLoads(By.id("ctl00_ctl00_c_c_CabinetWizard1_Wizard_CabinetNameTextBox"));
    mapping.getCabinetName().sendKeys("Test sysadm");
    mapping.getSchemaList().click();
    randomDropdownClick(mapping.getSchemaList());
}
}
