package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HistoryPage extends BasePage{
    @FindBy(xpath= "//*[contains(@text, 'No History')]")
    private WebElement massageNoHistory;
    @FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"More options\"])[1]")
    private WebElement buttonMore;
    @FindBy(id = "com.google.android.calculator:id/title")
    private WebElement buttonClear;
    @FindBy(id = "android:id/button1")
    private WebElement buttonOk;

    public CalculatorPage clearHistory(){
        buttonMore.click();
        buttonClear.click();
        buttonOk.click();
        return new CalculatorPage();
    }
    public String getMassage(){
        return massageNoHistory.getText();
    }
}
