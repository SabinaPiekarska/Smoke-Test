package Test;

import Credentials.Users;
import Test.Search.Search;

public class SimpleSearch {
    Users usersname = new Users();
    Search search = new Search();
    Logon log = new Logon();

    public void simpleSearch(String userLogin) throws InterruptedException {
        log.Logon(userLogin);
        search.searchOperator();
        log.logoff();
    }
    public void execute() {
        simpleSearch(usersname.getUser00);
    }
}
