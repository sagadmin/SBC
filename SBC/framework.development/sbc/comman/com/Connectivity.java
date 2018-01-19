package sbc.comman.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import sbc.pom.com.LoginPage;
import sbc.reposrity.com.Property;

public class Connectivity implements Property {

	public static WebDriver driver = null;

	@BeforeMethod
	public void launchBrowser() {

		System.setProperty(driverpath, driverlocation);
		driver = new ChromeDriver();
		driver.get(application);
		new LoginPage(driver);
	}

}
