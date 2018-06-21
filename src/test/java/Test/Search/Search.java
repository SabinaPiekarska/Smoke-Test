package Test.Search;

import BrowserFunctions.Driver;
import BrowserFunctions.Tools;
import Credentials.SearchQueries;
import Credentials.Users;
import Mapping.Search.SearchMapping;
import Mapping.TheLibraryView;
import Test.Logon;
import org.openqa.selenium.By;

public class Search extends Driver {
    SearchMapping searchMapping = new SearchMapping();
    TheLibraryView mapping = new TheLibraryView();
    SearchQueries query = new SearchQueries();
    Tools tools = new Tools();
    Logon logon = new Logon();

    Logon log = new Logon();

    public void searchUsefulElements(String userLogin) throws InterruptedException {
        log.Logon(userLogin);
        searchOperator();
        log.logoff();
    }

    public void search() throws InterruptedException {
        waitUntilPageLoads(mapping.getLibraryTreeList());
        searchMapping.getSearchFromSideMenu().click();
        waitUntilPageLoads(searchMapping.getSearchBar());
    }

    public void simpleSearch(String searchConditions) throws InterruptedException {
        search();
        tools.clearSendKeys(searchMapping.getSearchBar(),searchConditions);
        searchMapping.getSearchButton().click();
        waitUntilPageLoads(mapping.getMainPanel());
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
    public void simpleSearchOperators(String userName) throws InterruptedException {
        logon.Logon(userName);
        searchOperator();
        logon.logoff();
    }

}
