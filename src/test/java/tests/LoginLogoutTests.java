package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import pages.LoginLogoutPage;

public class LoginLogoutTests extends BaseClass {
	LoginLogoutPage plus500;
	
	String _testUser = "test4@helloplus500.com";
	String _password = "password1";
	
	@Test(priority=1, description="Signup User and login", groups="All")
	public void signupTest() throws InterruptedException {
		plus500 = new LoginLogoutPage(this.driver); 
		boolean result = plus500.signUp(_testUser, _password);
		AssertJUnit.assertTrue("User could not Signup", result == true);
	}

	@Test(priority=2, description="Logout User after Signup", groups="All")
	public void logoutTestAfterSignup() throws InterruptedException {
		plus500 = new LoginLogoutPage(this.driver); 
		boolean loggedOut = plus500.logout();
		AssertJUnit.assertTrue("User could not logout", loggedOut == true);
	}
	
	@Test(priority=3, description="Login User after Create", groups="All")
	public void loginTest() throws InterruptedException {
		plus500 = new LoginLogoutPage(this.driver); 
		boolean result = plus500.login(_testUser, _password);
		AssertJUnit.assertTrue("User could not login", result == true);
	}

	@Test(priority=4, description="Logout User after Login", groups="All")
	public void logoutTestAfterLogin() throws InterruptedException {
		plus500 = new LoginLogoutPage(this.driver); 
		boolean loggedOut = plus500.logout();
		AssertJUnit.assertTrue("User could not logout", loggedOut == true);
	}
}
