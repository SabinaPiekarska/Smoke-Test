package Mapping;

import BrowserFunctions.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TheLibraryView extends Driver{

    public WebElement getAdministration () {
        return driver.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/span"));
    }
    public WebElement getFullAdministrationMenu () {
        return driver.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/ul/li[1]/a"));
    }
    public WebElement getLibraryTree(){
        return driver.findElement(By.id("myNodePanel_LIB"));
    }
    public WebElement getAddCabinet(){
        return driver.findElement(By.xpath("/html/body/form/div[1]/ul/li[5]"));
    }
    //Add Cabinet fields
    public WebElement getCabinetName() {
        return driver.findElement(By.id("ctl00_ctl00_c_c_CabinetWizard1_Wizard_CabinetNameTextBox"));
    }
    public WebElement getSchemaList(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_CabinetWizard1_Wizard_SchemasList"));
    }
    public WebElement getNextButton(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_CabinetWizard1_Wizard_StartNavigationTemplateContainerID_StartNextButton"));
    }
    public WebElement getAddGroups(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_CabinetWizard1_Wizard_ManageMembershipControl_AddGroupsButton"));
    }
    public WebElement getSaveButton(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_CabinetWizard1_Wizard_StepNavigationTemplateContainerID_StartFinishButton"));
    }
    public WebElement getCurrentMembersOfCabinet(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_CabinetWizard1_Wizard_ManageMembershipControl_CurrentMembersListBox"));
    }
}
