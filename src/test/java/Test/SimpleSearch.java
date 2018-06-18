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
    public void execute() throws InterruptedException {
//        simpleSearch(usersname.getUser00());
//        simpleSearch(usersname.getUser01());
        simpleSearch(usersname.getUser02());
        simpleSearch(usersname.getUser03());
        simpleSearch(usersname.getUser04());
        simpleSearch(usersname.getUser05());
        simpleSearch(usersname.getUser06());
        simpleSearch(usersname.getUser07());
        simpleSearch(usersname.getUser08());
        simpleSearch(usersname.getUser09());
        simpleSearch(usersname.getUser10());
        simpleSearch(usersname.getSysadm());
    }
}
