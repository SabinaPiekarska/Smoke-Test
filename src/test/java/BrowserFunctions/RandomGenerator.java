package BrowserFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class RandomGenerator {

    public void randomClick(List<WebElement> options) {
        Random random = new Random();
        int index = random.nextInt(options.size());
        options.get(index).click();
    }
    public void randomDropdownClick(WebElement element) {
        Select select = new Select(element);
        List<WebElement> elements = select.getOptions();
        randomClick(elements);}
}
