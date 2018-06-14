package Locations;

import Mapping.FullAdministrationMenu;
import Mapping.TheLibraryView;
import BrowserFunctions.Driver;
import org.openqa.selenium.interactions.Actions;

public class FullAdminMenu extends Driver {
    TheLibraryView mapping = new TheLibraryView();
    Actions action = new Actions(driver);

    public void getFullAdminMenu () {
/*
        action.contextClick(mapping.getAdministration()).perform();
*/
        action.moveToElement(mapping.getAdministration()).click().build().perform();
        mapping.getFullAdministrationMenu().click();
    }


}
