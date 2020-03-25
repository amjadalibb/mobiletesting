package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Menu {

	private final AppiumDriver<MobileElement> driver;

	String _menuScrollableList="com.Plus500:id/menu_drawer";
	String _logoutClassName="android.widget.RelativeLayout";

	public Menu(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public void scrollLeftMenuToItem(String itemName) {
		try {
			driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().resourceId(\"" + _menuScrollableList + "\")).getChildByText("
							+ "new UiSelector().className(\"" + _logoutClassName + "\"), \"" + itemName + "\")"));
		}catch (Exception e){
			System.out.println("Cannot scroll further");
		}
	}
}
