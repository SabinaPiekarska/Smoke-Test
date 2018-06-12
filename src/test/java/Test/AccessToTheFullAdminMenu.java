package Test;

import Mapping.TheLibraryView;
import BrowserFunctions.Driver;

public class AccessToTheFullAdminMenu extends Driver {
    TheLibraryView mapping = new TheLibraryView();

    public void getAdminMenu () {
        mapping.getAdministration().click();
        mapping.getFullAdministrationMenu().click();
    }


}
