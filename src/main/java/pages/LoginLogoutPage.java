package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginLogoutPage {

	private final AppiumDriver<MobileElement> driver;

	By _option = By.id("SelectModeDemoBtn");
	By _newUser = By.id("NewUser");
	By _newPwd = By.id("NewPassword");
	By _loginUser = By.id("LoginUser");
	By _loginPwd = By.id("LoginPassword");
	By _loginBtn = By.id("LoginBtn");
	By _createBtn = By.id("SubmitNewUserBtn");
	By _tradeBonusSwitchButton = By.id("promotionButton");
	By _alreadyHaveAccount = By.id("Already_Have_An_Account_Link");

	By _menu = By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
	By _logout = By.xpath("//android.widget.TextView[@text=\"Logout\"]");

	public LoginLogoutPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public boolean login(String userName, String password ) throws InterruptedException{
		driver.findElement(_option).click();
		if(driver.findElements(_alreadyHaveAccount).size() > 0)
			driver.findElement(_alreadyHaveAccount).click();
		driver.findElement(_loginUser).sendKeys(userName);
		driver.findElement(_loginPwd).sendKeys(password);
		driver.findElement(_loginBtn).click();
		return driver.findElement(_tradeBonusSwitchButton).isDisplayed();
	}

	public boolean logout() throws InterruptedException {
		driver.findElement(_menu).click();
		Menu menu = new Menu(this.driver);
		menu.scrollLeftMenuToItem("Logout");
		driver.findElement(_logout).click();
		return driver.findElement(_option).isDisplayed();
	}

	public boolean signUp(String userName, String password ) throws InterruptedException{
		driver.findElement(_option).click();
		driver.findElement(_newUser).sendKeys(userName);
		driver.findElement(_newPwd).sendKeys(password);
		driver.findElement(_createBtn).click();
		return driver.findElement(_tradeBonusSwitchButton).isDisplayed();
	}
}
