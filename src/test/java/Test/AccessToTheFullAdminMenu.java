package Test;

import BrowserFunctions.Driver;
import Mapping.TheLibraryView;

public class AccessToTheFullAdminMenu extends Driver {
    TheLibraryView mapping = new TheLibraryView();

    public void getAdminMenu () {
        mapping.getAdministration().click();
        mapping.getFullAdministrationMenu().click();
    }


}
