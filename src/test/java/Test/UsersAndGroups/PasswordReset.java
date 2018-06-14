package Test.UsersAndGroups;


import Locations.UsersList;
import Test.Logon;

public class PasswordReset {

    Logon logon = new Logon();
    UsersList usersList = new UsersList();

    public void passwordReset(){

        logon.Logon();
        usersList.usersList();
    }

}
