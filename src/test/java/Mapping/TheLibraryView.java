package Mapping;

import BrowserFunctions.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TheLibraryView extends Driver{

    public WebElement getAdministration () {
        return driver.findElement(By.id("ctl00_ctl00_administrationMenu"));
    }
    public WebElement getFullAdministrationMenu () {
        return driver.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/ul/li[1]/a"));
    }
    public WebElement getMenuOptions(){
        return driver.findElement(By.id("ctl00_ctl00_c_rpbMenu"));
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

    //Search
    public WebElement getSearchFromSideMenu(){
        return driver.findElement(By.xpath("//div[@id='myNodePanel_SMF']//a[text()='Search']"));
    }
    public WebElement getSearchBar(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_SearchBar_FTSSearchTextBox"));
    }
    public WebElement getSearchButton(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_SearchBar_SearchButton"));
    }
    public WebElement getAdvancedLink(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_SearchBar_AdvancedLink"));
    }
    public WebElement getAdvancedSearchBar(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_SearchBar_DataList_ctl00_ctrl_0_SAoF_cont_Text"));
    }
    public WebElement getFileOrMetadata(){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='File or Metadata']"));
    }
    public WebElement getCheckOutStatus(){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Checked Out Status']"));
    }
    public WebElement getDrpDownMenuArrow(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_SearchBar_DataList_ctl00_ctrl_0_COS_eq_SDDM_Arrow"));
    }
    public WebElement getCheckIn(){
        return driver.findElement(By.xpath("//ul[@class='rcbList']//child::li[2]"));
    }
    public WebElement getCheckOut (){
        return driver.findElement(By.xpath("//ul[@class='rcbList']//child::li[2]"));
    }
    public WebElement getAdvancedSearchButton(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_SearchBar_SearchAdvButton"));
    }
    public WebElement getPerson (){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Person']"));
    }
    public WebElement getOwnedByMe (){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Owned by Me']"));
    }
    public WebElement getSearchResults (){
        return driver.findElement(By.id("ctl00_ctl00_c_c_SearchResultsLabel"));
    }
    public WebElement getFileDate (){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='File Date']"));
    }
    public WebElement getWorkflowStatus (){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Workflow Status']"));
    }
    public WebElement getLibraryLocation (){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Library Location']"));
    }
//    public WebElement get (){
//        return driver.findElement(By.id(""));
//    }
//    public WebElement get (){
//        return driver.findElement(By.id(""));
//    }
//    public WebElement get (){
//        return driver.findElement(By.id(""));
//    }


    public WebElement getLogoffButton(){
        return driver.findElement(By.id("ctl00_ctl00_LogOutButton"));
    }
}
