package Test.UsersAndGroups;

import Locations.FullAdminMenu;
import Locations.UsersList;
import Test.Logon;


public class PasswordReset{

    Logon logon = new Logon();
    UsersList usersList = new UsersList();
    FullAdminMenu fullAdmMenu = new FullAdminMenu();


    public void passwordReset(){

        logon.Logon();
        fullAdmMenu.getFullAdminMenu();
        usersList.usersList();
    }

}
