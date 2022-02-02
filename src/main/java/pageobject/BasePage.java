package pageobject;

import driver.DriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(DriverSingleton.getDriver(), this);
    }

    public void waitVisibilityOfElement(long timeToWait, WebElement element) {
        WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), timeToWait);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
