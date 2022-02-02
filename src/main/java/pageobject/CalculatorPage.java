package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends BasePage {
    @FindBy(id = "com.google.android.calculator:id/digit_2")
    private WebElement digit2;
    @FindBy(id = "com.google.android.calculator:id/digit_5")
    private WebElement digit5;
    @FindBy(id = "com.google.android.calculator:id/digit_7")
    private WebElement digit7;
    @FindBy(id = "com.google.android.calculator:id/digit_1")
    private WebElement digit1;
    @FindBy(id = "com.google.android.calculator:id/eq")
    private WebElement equalsSign;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    private WebElement multiply;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"More options\"]")
    private WebElement buttonMore;
    @FindBy(xpath = "//*[contains(@text, 'History')]")
    private WebElement tagHistory;

    public CalculatorPage pressDigit1() {
        digit1.click();
        return this;
    }

    public CalculatorPage pressDigit2() {
        digit2.click();
        return this;
    }

    public CalculatorPage pressDigit5() {
        digit5.click();
        return this;
    }

    public CalculatorPage pressDigit7() {
        digit7.click();
        return this;
    }

    public CalculatorPage multiplyDigits() {
        multiply.click();
        return this;
    }

    public CalculatorPage equalsDigits() {
        equalsSign.click();
        return this;
    }

    public HistoryPage openHistoryPage() {
        waitVisibilityOfElement(20,digit1);
        buttonMore.click();
        tagHistory.click();
        return new HistoryPage();
    }

}
