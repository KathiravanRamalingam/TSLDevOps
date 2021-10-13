package LoginTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import LoginApp.LoginApp;

public class AppTest {
	@Test(description = "Login with valid details")
	  public void loginTest() throws Exception {
		  LoginApp ap = new LoginApp();
		  boolean status = ap.userLogin("userdemo", "pwd");
		  Assert.assertTrue(status);
	  }
	  @Test(description = "Login with invalid details")
	  public void loginTest2() throws Exception {
		  LoginApp ap = new LoginApp();
		  boolean status = ap.userLogin("userdemo", "pwd123");
		  Assert.assertFalse(status);
	  }
}
