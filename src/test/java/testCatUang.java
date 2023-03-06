import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class testCatUang {

    public static AndroidDriver<MobileElement> driver;
    private testCatUang catatanUang;

    public testCatUang(AndroidDriver<MobileElement> driver) {

    }

    @BeforeClass
    Void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "sdk_gphone_arm64");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("appPackage", "com.chad.financialrecord");
        capabilities.setCapability("appActivity", "com.rookie.catatankeuangan.feature.splash.SplashActivity");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        return null;
    }

    @BeforeMethod
    public void pageObject() {
        catatanUang = new testCatUang(driver);
    }

    @Test
    public void addExpense() {
        catatanUang.addExpense();
    }
}