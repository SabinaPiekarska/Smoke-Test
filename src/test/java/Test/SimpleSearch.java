package Test;

import Credentials.Users;
import Test.Search.Search;
import org.testng.annotations.Test;

public class SimpleSearch {
    Logon logon = new Logon();
    Search search = new Search();
    Users userName = new Users();

    @Test
    public void simpleSearch() throws InterruptedException {
        logon.createDriver();
        logon.openTestingPage();
        search.simpleSearchOperators(userName.getUser00());
        search.simpleSearchOperators(userName.getUser01());
        search.simpleSearchOperators(userName.getUser02());
        search.simpleSearchOperators(userName.getUser03());
        search.simpleSearchOperators(userName.getUser04());
        search.simpleSearchOperators(userName.getUser05());
        search.simpleSearchOperators(userName.getUser06());
        search.simpleSearchOperators(userName.getUser07());
        search.simpleSearchOperators(userName.getUser08());
        search.simpleSearchOperators(userName.getUser09());
        search.simpleSearchOperators(userName.getUser10());
        search.simpleSearchOperators(userName.getSysadm());
    }

}
