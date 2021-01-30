package util.TypifiedElement;

import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import ru.yandex.qatools.htmlelements.element.TypifiedElement;


public class WebElement extends TypifiedElement implements Locatable {
    //extends TypifiedElement from ru.yandex as selenium's webelement .isDisplayed() isnt working
    //Implement locatable to get the location
    public WebElement(org.openqa.selenium.WebElement wrappedElement) {
        super(wrappedElement);
    }


    @Override
    public Coordinates getCoordinates() {
        return null;
    }
}
