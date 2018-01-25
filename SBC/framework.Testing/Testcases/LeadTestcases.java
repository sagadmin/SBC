package Testcases;

import org.apache.bcel.verifier.structurals.OperandStack;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import sbc.appmethods.com.LeadMethods;
import sbc.pom.com.LeadPage;
import sbc.pom.com.LoginPage;
import sbc.reposrity.com.LeadData;
import sbc.utility.com.Log;

public class LeadTestcases extends LeadMethods {
	
	static String LeadId;

	@Test(priority = 0)
	public static void NavigatetoLead() {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Valid Login TestCase Start Here:");

		Log.info("Enter Username");
		enter_username("ca1");

		Log.info("Enter Password");
		enter_password("acid_qa");

		Log.info("Click Login Button");
		Assert.assertTrue(LoginPage.btn_login.isDisplayed(), "Fail: Login Button did not found...");
		clk_login();

		Log.info("Click Quick Assess Button");
		clkQuickAccess();

		common.ImplicityWait(20);
		Assert.assertTrue(LeadPage.clk_salesjourney.isDisplayed(), "Fail : Sales Jouney Did not found..");
		clkSalesJourney();

		clkNTBSalesJourney();

	}

	@Test(priority = 1)
	public static void IndividualAUtoloanLead() {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Valid Login TestCase Start Here:");

		Log.info("Click Customer Next Button");
		clk_NextButton();

		Log.info("Select Salutation");
		SelectSalutaion(LeadData.Salutation);

		Log.info("Enter Customer FirstName");
		EnterFirstName(LeadData.FName);

		Log.info("Enter Customer Middle Name");
		EnterMiddleName(LeadData.MName);

		Log.info("Enter Last Name");
		EnterLastName(LeadData.LName);

		// Log.info("Enter Suffix");
		// SelSuffix(LeadData.Suffix);

		Log.info("Enter Mobile Number");
		enterMobile(LeadData.Mobile);

		Log.info("Select Multiple Product");
		selectMultipleProductNo();

		Log.info("Select Intrsted in");
		selectIntrestedin(LeadData.ProductCat);

		Log.info("Select 2nd Next Button");
		clk_2ndNextButton();

		Log.info("Select Lead Source");
		selectLeadSource(LeadData.LeadSource);

		Log.info("Select Product category");
		selectProductCategory(LeadData.ProductCategory);
		common.ImplicityWait(20);
		Log.info("Select Product");
		selectProduct(LeadData.Product);

		Log.info("Click Next Button");
		clk3rdNextButton();
		
		LeadId= driver.findElement(By.xpath("//div[@id='divContents']/div[1]/div[3]/div[1]/span")).getText();

	}
	
	@Test(priority=2)
	public static void setAppointment(){
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Valid Login TestCase Start Here:");
		
		Log.info("Click Sales Module");
		clkSalesModule();
		
		Log.info("Click Lead Module");
		clkLeadModule();
		
		Log.info("enter Lead id for search");
		enterLeadidforsearch(LeadId);
	}

}
