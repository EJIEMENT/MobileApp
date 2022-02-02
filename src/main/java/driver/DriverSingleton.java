package driver;

import capabilitiesfactory.CapabilityManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {
    private static AndroidDriver<MobileElement> androidDriver;
    private static CapabilityManager capabilityManager = new CapabilityManager();

    private DriverSingleton() {
    }

    public static AndroidDriver getDriver() {
        if (androidDriver == null) {
            androidDriver = new AndroidDriver(capabilityManager.getAppiumUrl(), capabilityManager.getDesiredCapabilities());
            androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return androidDriver;

    }

    public static void quitDriver() {
        androidDriver.quit();
    }

}

