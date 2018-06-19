package Test.Search;

import BrowserFunctions.Driver;
import Mapping.TheLibraryView;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class AdvancedSearch extends Driver {
    TheLibraryView mapping = new TheLibraryView();
    Search search = new Search();
    Actions action = new Actions(driver);

    public void getAdvancedSearchLink(){
        mapping.getAdvancedLink().click();
    }

    public void advancedSearch() throws InterruptedException {
        search.search();
        getAdvancedSearchLink();
        waitUntilPageLoads(By.id("ctl00_ctl00_c_c_SearchBar_DataList_ctl00_ctrl_0_SAoF_cont_Text"));
        action.moveToElement(mapping.getFileOrMetadata());
//        action.moveToElement(mapping.getCheckOutStatus());
//        action.click().build().perform();
//        waitUntilPageLoads(By.id("ctl00_ctl00_c_c_SearchBar_DataList_ctl00_ctrl_0_COS_eq_SDDM_Arrow"));
//        mapping.getDrpDownMenuArrow().click();
//        action.moveToElement(mapping.getCheckIn());
//        action.click().build().perform();

        action.moveToElement(mapping.getFileDate());
        action.click().build().perform();
        action.moveToElement(mapping.getLibraryLocation());
        action.click().build().perform();
        action.moveToElement(mapping.getOwnedByMe());
        action.click().build().perform();
        action.moveToElement(mapping.getWorkflowStatus());
        action.click().build().perform();
        action.moveToElement(mapping.getPerson());
        action.click().build().perform();
//        mapping.getAdvancedSearchButton().click();
    }
}
