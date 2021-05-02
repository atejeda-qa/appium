import Pages.ScreenPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class CalculatorTest {
    AppiumDriver driver;
    ScreenPage screenPage = new ScreenPage();

    @BeforeClass
    public void openApp() throws MalformedURLException {
        String url = "http://127.0.0.1:4723/wd/hub";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3a API 29");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.calculator");
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver = new AppiumDriver(new URL(url), caps);
    }

    @Test
    public void sum_of_2_numbers() {
       driver.findElementById(screenPage.getNumberInPad("3")).click();
       driver.findElementByAccessibilityId(screenPage.getPlus_button()).click();
       driver.findElementById(screenPage.getNumberInPad("4")).click();
       driver.findElementByAccessibilityId(screenPage.getEqual_button()).click();
       Assert.assertEquals(driver.findElementById(screenPage.getResult()).getText(), "7");
    }

    @Test
    public void subtraction_of_2_numbers() {
        driver.findElementById(screenPage.getNumberInPad("9")).click();
        driver.findElementByAccessibilityId(screenPage.getMinus_button()).click();
        driver.findElementById(screenPage.getNumberInPad("4")).click();
        driver.findElementByAccessibilityId(screenPage.getEqual_button()).click();
        Assert.assertEquals(driver.findElementById(screenPage.getResult()).getText(), "5");
    }

    @Test
    public void multiply_2_numbers() {
        driver.findElementById(screenPage.getNumberInPad("8")).click();
        driver.findElementByAccessibilityId(screenPage.getMultiply_button()).click();
        driver.findElementById(screenPage.getNumberInPad("2")).click();
        driver.findElementByAccessibilityId(screenPage.getEqual_button()).click();
        Assert.assertEquals(driver.findElementById(screenPage.getResult()).getText(), "16");
    }

    @Test
    public void division_of_2_numbers() {
        driver.findElementById(screenPage.getNumberInPad("9")).click();
        driver.findElementByAccessibilityId(screenPage.getDivide_button()).click();
        driver.findElementById(screenPage.getNumberInPad("2")).click();
        driver.findElementByAccessibilityId(screenPage.getEqual_button()).click();
        Assert.assertEquals(driver.findElementById(screenPage.getResult()).getText(), "4.5");
    }

}
