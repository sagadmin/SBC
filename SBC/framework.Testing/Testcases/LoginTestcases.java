package Testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import sbc.appmethods.com.LoginMethods;
import sbc.pom.com.LoginPage;
import sbc.utility.com.Log;

public class LoginTestcases extends LoginMethods {

	@Test
	public static void loginintosystem() {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Valid Login TestCase Start Here:");

		Log.info("Enter Username");
		enter_username("ca1");

		Log.info("Enter Password");
		enter_password("acid_qa");

		Log.info("Click Login Button");
		Assert.assertTrue(LoginPage.btn_login.isDisplayed(), "Fail: Login Button did not found...");
		clk_login();
		
		
	}
}
