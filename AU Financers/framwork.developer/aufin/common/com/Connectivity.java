package aufin.common.com;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import aufin.pom.com.LeadPage;
import aufin.pom.com.LoginPage;
import aufin.reposrity.com.Properties;

public class Connectivity implements Properties {

	public static WebDriver driver = null;

	@Before
	public void launchBrowser() {
		System.setProperty(chromeDriver, chromepaths);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		System.out.println(webSiteURL);
		driver.get(webSiteURL);
		driver.manage().window().maximize();
		new LoginPage(driver);
		new LeadPage(driver);

	}
	
//	@AfterSuite
//	public void closeBrowser(){
//		
//		driver.close();
//	}

}
