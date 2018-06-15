package Test.Search;

import BrowserFunctions.Driver;
import Mapping.TheLibraryView;
import org.openqa.selenium.By;

public class Search extends Driver {
    TheLibraryView mapping = new TheLibraryView();

    public void search() throws InterruptedException {
        waitUntilPageLoads(By.id("ctl00_ctl00_c_LibraryTree_lstt25"));
        mapping.getSearchFromSideMenu().click();
        waitUntilPageLoads(By.id("ctl00_ctl00_c_c_SearchBar_FTSSearchTextBox"));
    }
    public void simpleSearch() {
        mapping.getSearchBar().sendKeys("pompeii");
        mapping.getSearchButton().click();
    }

}
