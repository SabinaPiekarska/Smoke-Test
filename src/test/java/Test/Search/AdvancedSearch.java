package Test.Search;

import BrowserFunctions.Driver;
import Mapping.Search.SearchMapping;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class AdvancedSearch extends Driver {
    SearchMapping searchMapping = new SearchMapping();
    Search search = new Search();
    Actions action = new Actions(driver);

    public void getAdvancedSearchLink(){
        searchMapping.getAdvancedLink().click();
    }

    public void advancedSearch() throws InterruptedException {
        search.search();
        getAdvancedSearchLink();
        waitUntilPageLoads(searchMapping.getFileOrMetadata());
//        action.moveToElement(searchMapping.getFileOrMetadata());
//        searchMapping.getDrpDownMenuArrow().click();
        action.moveToElement(searchMapping.getContainsInFTS());
        action.moveToElement(searchMapping.getDoesNotContainInFTS());
        action.click().build().perform();
        //        action.moveToElement(mapping.getCheckOutStatus());
//        action.click().build().perform();
//        waitUntilPageLoads(By.id("ctl00_ctl00_c_c_SearchBar_DataList_ctl00_ctrl_0_COS_eq_SDDM_Arrow"));
//        mapping.getDrpDownMenuArrow().click();
//        action.moveToElement(mapping.getCheckIn());
//        action.click().build().perform();

//        action.moveToElement(mapping.getFileDate());
//        action.click().build().perform();
//        action.moveToElement(mapping.getLibraryLocation());
//        action.click().build().perform();
//        action.moveToElement(mapping.getOwnedByMe());
//        action.click().build().perform();
//        action.moveToElement(mapping.getWorkflowStatus());
//        action.click().build().perform();


//        mapping.getAdvancedSearchButton().click();
    }
}
