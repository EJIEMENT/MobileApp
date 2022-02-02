package cltest;

import driver.DriverSingleton;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageobject.CalculatorPage;

public class CalculatorTest {
    CalculatorPage calculatorPage = new CalculatorPage();
    @Test
    public void noHistoryMassageTest(){
        String mass = calculatorPage.pressDigit1()
                .pressDigit5()
                .multiplyDigits()
                .pressDigit2()
                .pressDigit7()
                .equalsDigits()
                .openHistoryPage()
                .clearHistory()
                .openHistoryPage()
                .getMassage();
        Assert.assertEquals(mass,"No History");
    }

    @AfterTest
    public void closeDriver(){
        DriverSingleton.quitDriver();
    }
}
