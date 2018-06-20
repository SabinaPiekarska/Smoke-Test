package Test.Library;

import BrowserFunctions.Driver;
import BrowserFunctions.RandomGenerator;
import Credentials.Users;
import Mapping.TheLibraryView;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;


public class CreateCabinet extends Driver {

    public void createACabinet() throws InterruptedException {
        TheLibraryView mapping = new TheLibraryView();
        Users user = new Users();
        RandomGenerator generator = new RandomGenerator();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Actions action = new Actions(driver);

        waitUntilPageLoads(mapping.getLibraryTreeList());
        js.executeScript("\"javascript:TreeView_ToggleNode(ctl00_ctl00_c_LibraryTree_lst_Data,25,document.getElementById('ctl00_ctl00_c_LibraryTree_lstn25'),' ',document.getElementById('ctl00_ctl00_c_LibraryTree_lstn25Nodes'))\"");
        action.contextClick(mapping.getLibraryTree()).perform();
        mapping.getAddCabinet().click();
        waitUntilPageLoads(mapping.getCabinetName());
        mapping.getCabinetName().sendKeys("Cab " + user.getSysadm());
        mapping.getSchemaList().click();
        generator.randomDropdownClick(mapping.getSchemaList());
        mapping.getNextButton().click();
        waitUntilPageLoads(mapping.getAddGroupsButton());
        mapping.getAddGroupsButton().click();
        while(mapping.getCurrentMembersOfCabinet().getAttribute("value") == null){
            waitUntilPageLoads(mapping.getUsersList());
        }
        mapping.getSaveButton().click();
        quitDriver();
        /*((JavascriptExecutor)driver).executeScript("javascript:setTimeout('__doPostBack(\'ctl00$ctl00$c$c$CabinetWizard1$Wizard$ManageMembershipControl$CurrentMembersListBox\',\'\')', 0)");*/
    }
}
