package BrowserFunctions;

import org.openqa.selenium.WebElement;

public class Tools {
    public void clearSendKeys(WebElement location, String textToSend){
        location.clear();
        location.sendKeys(textToSend);
    }

}
