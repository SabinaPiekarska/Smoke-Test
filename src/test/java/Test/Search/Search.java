package Test.Search;

import BrowserFunctions.Driver;
import Credentials.SearchQueries;
import Mapping.Search.SearchMapping;
import org.openqa.selenium.By;

public class Search extends Driver {
    SearchMapping searchMapping = new SearchMapping();
    SearchQueries query = new SearchQueries();

    public void search() throws InterruptedException {
        waitUntilPageLoads(By.id("ctl00_ctl00_c_LibraryTree_lstt0"));
        searchMapping.getSearchFromSideMenu().click();
        waitUntilPageLoads(By.id("ctl00_ctl00_c_c_SearchBar_FTSSearchTextBox"));
    }

    public void simpleSearch(String searchConditions) throws InterruptedException {
        search();
        searchMapping.getSearchBar().clear();
        searchMapping.getSearchBar().sendKeys(searchConditions);
        searchMapping.getSearchButton().click();
        waitUntilPageLoads(By.id("ctl00_ctl00_c_c_MainPanel"));
        String result = searchMapping.getSearchResults().getText();
        if (result.equalsIgnoreCase("No Search Results"))
            System.out.println("no results ");
        else
            System.out.println("search results");

    }

        public void searchOperator() throws InterruptedException {

        simpleSearch(query.getAndOperator());

        simpleSearch(query.getNotOperator());

        simpleSearch(query.getOrOperator());

        simpleSearch(query.getEqualOperator());

        simpleSearch(query.getAndNotOperator());

        simpleSearch(query.getNoiseWordsOperator());

        simpleSearch(query.getQuestionMarkOperator());

        simpleSearch(query.getwAndAsteriskOperator());

        simpleSearch(query.getAmpersandOperator());
    }

}
