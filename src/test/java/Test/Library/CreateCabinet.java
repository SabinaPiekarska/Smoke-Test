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

        waitUntilPageLoads(By.id("ctl00_ctl00_c_LibraryTree_lstt25"));
        js.executeScript("\"javascript:TreeView_ToggleNode(ctl00_ctl00_c_LibraryTree_lst_Data,25,document.getElementById('ctl00_ctl00_c_LibraryTree_lstn25'),' ',document.getElementById('ctl00_ctl00_c_LibraryTree_lstn25Nodes'))\"");
        action.contextClick(mapping.getLibraryTree()).perform();
        mapping.getAddCabinet().click();
        waitUntilPageLoads(By.id("ctl00_ctl00_c_c_CabinetWizard1_Wizard_CabinetNameTextBox"));
        mapping.getCabinetName().sendKeys("Cab " + user.getSysadm());
        mapping.getSchemaList().click();
        generator.randomDropdownClick(mapping.getSchemaList());
        mapping.getNextButton().click();
        waitUntilPageLoads(By.id("ctl00_ctl00_c_c_CabinetWizard1_Wizard_ManageMembershipControl_AddGroupsButton"));
        mapping.getAddGroups().click();
        while(mapping.getCurrentMembersOfCabinet().getAttribute("value") == null){
            waitUntilPageLoads(By.xpath("/html/body/form/div[3]/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr/td[2]/div/div[1]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/table/tbody/tr/td/table/tbody/tr[2]/td[3]/div[1]/select/option[1]"));
        }
        mapping.getSaveButton().click();
        quitDriver();
        /*((JavascriptExecutor)driver).executeScript("javascript:setTimeout('__doPostBack(\'ctl00$ctl00$c$c$CabinetWizard1$Wizard$ManageMembershipControl$CurrentMembersListBox\',\'\')', 0)");*/
    }
}
