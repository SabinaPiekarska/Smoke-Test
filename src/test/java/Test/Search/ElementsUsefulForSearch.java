package Test.Search;

import BrowserFunctions.Driver;
import Credentials.Users;
import org.testng.annotations.Test;
import Test.Logon;

public class ElementsUsefulForSearch {
    Search search = new Search();
    Users usersName = new Users();
    Logon logon = new Logon();

    @Test
    public void elementsUsefulForSearch() throws InterruptedException {
//        logon.createDriver();
        logon.openTestingPage();
        search.searchUsefulElements(usersName.getUser00());
        search.searchUsefulElements(usersName.getUser01());
        search.searchUsefulElements(usersName.getUser02());
        search.searchUsefulElements(usersName.getUser03());
        search.searchUsefulElements(usersName.getUser04());
        search.searchUsefulElements(usersName.getUser05());
        search.searchUsefulElements(usersName.getUser06());
        search.searchUsefulElements(usersName.getUser07());
        search.searchUsefulElements(usersName.getUser08());
        search.searchUsefulElements(usersName.getUser09());
        search.searchUsefulElements(usersName.getUser10());
        search.searchUsefulElements(usersName.getSysadm());
    }
}
