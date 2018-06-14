package Test;

import Mapping.FullAdministrationMenu;
import Mapping.TheLibraryView;
import BrowserFunctions.Driver;

public class FullAdminMenu extends Driver {
    TheLibraryView mapping = new TheLibraryView();


    public void getAdminMenu () {
        mapping.getAdministration().click();
        mapping.getFullAdministrationMenu().click();
    }


}
