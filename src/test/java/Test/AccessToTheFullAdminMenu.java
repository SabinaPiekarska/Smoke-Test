package Test;

import Mapping.FullAdministrationMenu;
import Mapping.TheLibraryView;
import BrowserFunctions.Driver;

public class AccessToTheFullAdminMenu extends Driver {
    TheLibraryView mapping = new TheLibraryView();
    FullAdministrationMenu fulladminmenu = new FullAdministrationMenu();

    public void getAdminMenu () {
        mapping.getAdministration().click();
        mapping.getFullAdministrationMenu().click();
    }
    public void SystemManagement(){
        fulladminmenu.getSystemManagement().click();
        fulladminmenu.getUserManagement().click();
        fulladminmenu.getUsers().click();
    }

}
