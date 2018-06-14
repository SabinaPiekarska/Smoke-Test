package Locations;

import Mapping.FullAdministrationMenu;

public class UsersList {

    FullAdministrationMenu fulladminmenu = new FullAdministrationMenu();

    public void usersList(){
        fulladminmenu.getSystemManagement().click();
        fulladminmenu.getUserManagement().click();
        fulladminmenu.getUsers().click();
    }
}
