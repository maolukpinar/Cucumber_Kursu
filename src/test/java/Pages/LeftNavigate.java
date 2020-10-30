package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftNavigate {

    // setup   (//span[text()='Setup'])[1]
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath ="(//span[text()='Parameters'])[1]" )
    private WebElement parametersİ;

    @FindBy(xpath = "//span[text()='Countries'])[1])")
            private WebElement country;
}
