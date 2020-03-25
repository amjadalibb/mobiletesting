package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	public AppiumDriver<MobileElement> driver;
	
	@BeforeSuite
	public void setup() {
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-G900I");
			caps.setCapability(MobileCapabilityType.UDID, "4796cf03");
			caps.setCapability("appPackage", "com.Plus500");
			caps.setCapability("appActivity", "com.plus500.screens.mainScreen.DrawerMainActivity");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, caps);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			System.out.println("Application Started ...");
		} catch (MalformedURLException exp) {
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
	@AfterSuite
	public void teardown() {
	     driver.quit();
	}
}
