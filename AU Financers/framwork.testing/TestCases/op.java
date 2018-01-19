package TestCases;

import static org.junit.Assert.*;

import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import aufin.appmethods.com.LeadMethods;
import aufin.reposrity.com.LeadData;
import aufin.utility.com.Log;
import aufin.reposrity.com.Properties;
import aufin.appmethods.com.LoginMethod;
import aufin.pom.com.LeadPage;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import aufin.appmethods.com.LeadMethods;
import aufin.common.com.aufinscript;
import aufin.pom.com.LeadPage;
import aufin.reposrity.com.LeadData;
import aufin.utility.com.Log;

public class op extends LeadMethods{
	String CustomerName;
	String Leadid;
	String LeadStatus;
	String LeadOwner;
	String dupeEntity;
	String dupeProduct;
	String dupeMobile;
	String dupeFname;
	String dupeMname;
	String dupeLname;
	String dupeAddhar;

	@Test
	public void NavigatetoLead() throws InterruptedException {
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Navigate to Lead Module");
		

		Log.info("Enter Username");
		Enter_txtName(LeadData.cseusername);
		Log.info("Entered Username is" + " " + LeadData.cseusername);

		Log.info("Enter Password");
		Enter_txtPassword(LeadData.csepassword);
		Log.info("Entered Password is" + " " + LeadData.csepassword);

		Log.info("Click on Login Button");
		click_LoginButton();
		// Assert.assertFalse(LeadPage.txt_username.isDisplayed(), "Failed :
		// Inavlid Username Or Password Found!!!!");
		
		
		Log.info("Navigate to Asset");
		driver.navigate().to("http://aufinqa/sn/app/AutoFlow/RunFlow?x=m7psnshf4ta9h2w6nn864pxdgzugpu8vd7aex6j94r36ftdyvkv9zyr2v9g52dw3&layid=102430&pid=222619&cogtype=false");

		

		Log.info("Select Entity Type");
		select_Entity(LeadData.entity);
		dupeEntity =LeadData.entity;

		LeadPage.icon_ProductSearch.click();
		Thread.sleep(2000);
		
		LeadPage.icon_txt_searchbox.sendKeys("Wheels");
		Thread.sleep(2000);
		
		LeadPage.icon_txt_searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		LeadPage.icon_txt_searchResult.click();
		
		Log.info("Select Product");
		System.out.println(LeadData.product);
		select_ProductType(LeadData.product);
		dupeProduct=LeadData.product;
			
		Thread.sleep(2000);
		Log.info("Enter Mobile Number");
		enter_MobileNo(LeadData.mobile_number);
		dupeMobile =LeadData.mobile_number;

		Log.info("Select Salution");
		Select_Salution(LeadData.salutration);

		Log.info("Enter FirstName");
		enter_FirstName("pawan");
		

//		Log.info("Enter Middle Name");
//		enter_MiddleName("Singh");
		

		Log.info("Enter Last Name");
		enter_LastName("Sharma");
		

		Log.info("Enter ShortName");
		enter_shortName("Pawan");

		
//
//		Log.info("Select Date of Birth");
//		selectDate("23", "Jan", "1980");
//
//		Log.info("Enter AadharCard No");
//		enter_AadharCard("85632154789561256");
//	

//		Log.info("Select Form Type");
//		select_form60("Form60");
//
//		Log.info("Select Gender Type");
//		selectGender(LeadData.Gender);
//
//		Log.info("Select Residance Type");
//		selectResidance(1);
//
//		Log.info("Enter Current Address Details");
//		enterCurrentAddressLine1(LeadData.CurrentAddress);
//
//		Log.info("Select Current AddressPincode");
//		selectcurrentPincode("201005");
//
//		

		Log.info("Click Save&Processd");
		clickSaveProcessedButton();

		Log.info("POT taken for success logged in");
		

		Log.endTestCase("----TESTCASE ENDED HERE-----");

	}
	
//	@Test
//
//	public void createApplicantLeadOnNewStage() throws Exception {
//
//		DOMConfigurator.configure("log.xml");
//		Log.startTestCase("Craete an RLOS Lead for Individual Entity");
//
//		Log.info("Navigate to Asset");
//		navigate_to_asset();
//
//		common.ImplicityWait(20);
//
//		Log.info("Select Entity Type");
//		select_Entity(LeadData.entity);
//		dupeEntity =LeadData.entity;
//
//		Log.info("Select Product Category");
//		select_ProductCategory("Wheels");
//
//		Log.info("Select Product");
//		System.out.println(LeadData.product);
//		select_ProductType(LeadData.product);
//		dupeProduct=LeadData.product;
//		
//
//		Log.info("Enter Mobile Number");
//		enter_MobileNo(LeadData.mobile_number);
//		dupeMobile =LeadData.mobile_number;
//
//		Log.info("Select Salution");
//		Select_Salution(LeadData.salutration);
//
//		Log.info("Enter FirstName");
//		enter_FirstName(LeadData.Fname);
//		dupeFname=LeadData.Fname;
//
//		Log.info("Enter Middle Name");
//		enter_MiddleName(LeadData.MName);
//		dupeMname=LeadData.MName;
//
//		Log.info("Enter Last Name");
//		enter_LastName(LeadData.LName);
//		dupeLname =LeadData.LName;
//
//		Log.info("Enter ShortName");
//		enter_shortName(LeadData.ShortName);
//
//		common.downscroll();
//
//		Log.info("Select Date of Birth");
//		selectDate(LeadData.Date, LeadData.month, LeadData.Year);
//
//		Log.info("Enter AadharCard No");
//		enter_AadharCard(LeadData.aadhar);
//		dupeAddhar=LeadData.aadhar;
//
//		Log.info("Select Form Type");
//		select_form60("Form60");
//
//		Log.info("Select Gender Type");
//		selectGender(LeadData.Gender);
//
//		Log.info("Select Residance Type");
//		selectResidance(1);
//
//		Log.info("Enter Current Address Details");
//		enterCurrentAddressLine1(LeadData.CurrentAddress);
//
//		Log.info("Select Current AddressPincode");
//		selectcurrentPincode("201005");
//
//		common.downscroll();
//
//		Log.info("Click Save&Processd");
//		clickSaveProcessedButton();
//		
////		if(aufinscript.ck6.isSelected()==true){
////			common.ImplicityWait(30);
////			LeadtoLeadDedupe();
////			
////			logOutwithCSE();
////			loginwithbranch();
////			DOMConfigurator.configure("log.xml");
////			Log.startTestCase("Logged in with Branch Manager");
////
////			common.ImplicityWait(20);
////			
////			driver.navigate().refresh();
////			Log.info("Select lead view");
////			selectcustommodule("Asset ");
////			selectLeadCustomview("Duplicate Lead Confirmation *");
////			Log.info("Click and open lead");
////			leadDetailsingrid();
////
////			Log.info("Click On Edit button");
////			clickEditButton();
////
////			common.ImplicityWait(10);
////
////			Log.info("Approved Duplicate");
////			actionsonBM("Duplicate Lead Confirmation");
////
////			Log.info("Click Save Button");
////			clickSaveProcessedButton();
////			
////			Log.info("Logged out from System");
////			click_LoginOutButton();
////
////			NavigatetoLead();
////
////			
////		}
//		Log.endTestCase("-----TESTCASE ENDED HERE---------");
//
//	}

}
