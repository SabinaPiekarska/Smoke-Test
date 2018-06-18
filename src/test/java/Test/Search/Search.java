package Test.Search;

import BrowserFunctions.Driver;
import Credentials.SearchQueries;
import Mapping.TheLibraryView;
import org.openqa.selenium.By;

public class Search extends Driver {
    TheLibraryView mapping = new TheLibraryView();
    SearchQueries query = new SearchQueries();

    public void search() throws InterruptedException {
        waitUntilPageLoads(By.id("ctl00_ctl00_c_LibraryTree_lstt25"));
        mapping.getSearchFromSideMenu().click();
        waitUntilPageLoads(By.id("ctl00_ctl00_c_c_SearchBar_FTSSearchTextBox"));
    }
    public void simpleSearch() throws InterruptedException {
        mapping.getSearchBar().sendKeys(query.getEqualOperator());
        mapping.getSearchButton().click();
        waitUntilPageLoads(By.id("ctl00_ctl00_c_c_MainPanel"));
        String result = mapping.getSearchResults().getText();
        if(result.equalsIgnoreCase("No Search Results"))
            System.out.println("no results");
        else
            System.out.println("search results");

    }

}
