package TestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import aufin.common.com.aufinscript;
import aufin.pom.com.LeadPage;
import aufin.reposrity.com.LeadData;
import aufin.utility.com.Log;

public class AssetChanges extends IndividualLead{
  
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
	
	
	@Test(priority=0)
	public void NavigatetoLead() {
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

		Log.info("POT taken for success logged in");
		common.TakeScreenshots();

		Log.endTestCase("----TESTCASE ENDED HERE-----");

	}
	
	/**************************************************************
	 * @author Ishant Kushwaha
	 * 
	 * @TestCase : Create a New Asset lead for individual Customer
	 * 
	 * @serialData : April 24, 2017
	 * 
	 ***************************************************************/

	@Test(priority=1)

	public void createApplicantLeadOnNewStage() throws Exception {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Craete an RLOS Lead for Individual Entity");

		Log.info("Navigate to Asset");
		navigate_to_asset();

		common.ImplicityWait(20);

		Log.info("Select Entity Type");
		select_Entity(LeadData.entity);
		dupeEntity =LeadData.entity;

		Log.info("Select Product Category");
		select_ProductCategory("Wheels");

		Log.info("Select Product");
		System.out.println(LeadData.product);
		select_ProductType(LeadData.product);
		dupeProduct=LeadData.product;
		

		Log.info("Enter Mobile Number");
		enter_MobileNo(LeadData.mobile_number);
		dupeMobile =LeadData.mobile_number;

		Log.info("Select Salution");
		Select_Salution(LeadData.salutration);

		Log.info("Enter FirstName");
		enter_FirstName(LeadData.Fname);
		dupeFname=LeadData.Fname;

		Log.info("Enter Middle Name");
		enter_MiddleName(LeadData.MName);
		dupeMname=LeadData.MName;

		Log.info("Enter Last Name");
		enter_LastName(LeadData.LName);
		dupeLname =LeadData.LName;

		Log.info("Enter ShortName");
		enter_shortName(LeadData.ShortName);

		common.downscroll();

		Log.info("Select Date of Birth");
		selectDate(LeadData.Date, LeadData.month, LeadData.Year);

		Log.info("Enter AadharCard No");
		enter_AadharCard(LeadData.aadhar);
		dupeAddhar=LeadData.aadhar;

		Log.info("Select Form Type");
		select_form60("Form60");

		Log.info("Select Gender Type");
		selectGender(LeadData.Gender);

		Log.info("Select Residance Type");
		selectResidance(1);

		Log.info("Enter Current Address Details");
		enterCurrentAddressLine1(LeadData.CurrentAddress);

		Log.info("Select Current AddressPincode");
		selectcurrentPincode("201005");

		common.downscroll();

		Log.info("Click Save&Processd");
		clickSaveProcessedButton();
		
//		if(aufinscript.ck6.isSelected()==true){
//			common.ImplicityWait(30);
//			LeadtoLeadDedupe();
//			
//			logOutwithCSE();
//			loginwithbranch();
//			DOMConfigurator.configure("log.xml");
//			Log.startTestCase("Logged in with Branch Manager");
//
//			common.ImplicityWait(20);
//			
//			driver.navigate().refresh();
//			Log.info("Select lead view");
//			selectcustommodule("Asset ");
//			selectLeadCustomview("Duplicate Lead Confirmation *");
//			Log.info("Click and open lead");
//			leadDetailsingrid();
//
//			Log.info("Click On Edit button");
//			clickEditButton();
//
//			common.ImplicityWait(10);
//
//			Log.info("Approved Duplicate");
//			actionsonBM("Duplicate Lead Confirmation");
//
//			Log.info("Click Save Button");
//			clickSaveProcessedButton();
//			
//			Log.info("Logged out from System");
//			click_LoginOutButton();
//
//			NavigatetoLead();
//
//			
//		}
		Log.endTestCase("-----TESTCASE ENDED HERE---------");

	}
	
	
	/***********************************************************
	 * @author Ishant Kushwaha
	 * 
	 * 
	 * @TestCase : Move a lead From New Stage to Doc collected.
	 * 
	 * @serialData : April 25,2017
	 * 
	 ***********************************************************/

	@Test(priority=2)
	public void moveLeadToDocCollected()  {
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Move a lead from New to Doc collected Stage");

		common.ImplicityWait(20);

		navigateToLeadHomeScreen();
		
		driver.navigate().refresh();
		
		if(aufinscript.ck6.isSelected()){
			selectcustommodule("Asset ");
			selectLeadCustomview("Approve Duplicate *");
			
		}
		
			Log.info("Select lead view");
			selectcustommodule("Asset ");
			selectLeadCustomview("New Lead *");


		Log.info("Click and open lead");
		leadDetailsingrid();

		common.ImplicityWait(20);

		Log.info("Click On Edit button");
		clickEditButton();

		Log.info("click on Doc collected stage");
		click_docCollectedStage();

		Log.info("Select RiskClassification");
		selectRiskClassification(2);

		Log.info("Enter Loan Amount");
		enterLoanAmount(LeadData.LoanAmount);

		Log.info("Select Industry");
		selectIndutryd("Food");

		Log.info("Select SubInd");
		selectSubIndus("FISH");

		Log.info("Upload Customer Photo");
		uploadCustomerPhoto(LeadData.CustomerPhoto);

		Log.info("Upload Customer Signature");
		uploadCustomerSign(LeadData.CustomerSignature);
		
		common.ImplicityWait(30);

		Log.info("Fill PhotoID Name");
		fillPhotoIdKYCDetails("Aadhar Card", "Aadhar123", "Aadga", "C:\\Users\\Ishant Kushwaha\\Desktop\\SA BUgs\\106980.png");

		common.ImplicityWait(20);
		Log.info("Select permananet address");
		enterPermananetAddressLine1("Permanant");

		selectPermanenetPincode("201005");

		Log.info("Click Save Button");
		clickSaveProcessedButton();

		Log.info("Lead Status found as" + "  " + LeadStatus);
		LeadStatus = LeadPage.getLeadStatus.getText();
		Assert.assertEquals(LeadStatus, "Pending BM Recommendation");
		System.out.println(LeadStatus);

		// Log.info("Lead Owner found as" + " " + LeadOwner);
		LeadOwner = LeadPage.getLeadOwner.getText();
		// Assert.assertEquals(LeadOwner, "Mangamuri");
		// System.out.println("LeadOwner");
		
		
		closeLeadHandoffscreen();
		
		

	}
	
	
	@Test(priority=3)
	public void FillCOApplicantLayout() throws InterruptedException {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("CLOS Lead for Child Layout");

		common.ImplicityWait(20);

		 navigateToLeadHomeScreen();
		
		 Log.info("Select lead view");
		 selectcustommodule("Asset ");
		 selectLeadCustomview("New Lead *");
		
		 Log.info("Click and open lead");
		 leadDetailsingrid();

		Log.info("Select Co-applicantLayout");
		selectCoapplicantLayout();

		Log.info("Select Entity");
		select_Entity(LeadData.CoapplicantEntity);

		Log.info("Select Salutraion");
		Select_Salution("M/S.");

		Log.info("Fill FirstName");
		enter_FirstName(LeadData.CoapplicantFname);

		Log.info("Enter Middle Name");
		enter_MiddleName(LeadData.CoapplicantMname);

		Log.info("Enter Last Name");
		enter_LastName(LeadData.CoapplicantLname);

		Log.info("Enter Short Name");
		enter_shortName(LeadData.CoapplicantShortName);

		Log.info("enter Mobile Number");
		enter_MobileNo(LeadData.CoappliantMobileNo);

		Log.info("select Corporate KYC1");
		selectcmpnykyc1doc();
		selectcmyKYC1Issuedate("10", "2015", "Jan");

		Log.info("Enter KYC Doc1 Number");
		entercmpnyKYC1DocNo("1569");
		
		
		common.ImplicityWait(30);

		Log.info("Upload KYC1 Attachement");
		uploadCompanyKYC1Document("C:\\Users\\Ishant Kushwaha\\Desktop\\SA BUgs\\109167.png");

		// Log.info("Insert KYC 1 Expire Date");
		// selectcmyKYC1Expiredate("20", "2018", "Mar");

		Log.info("Select Corporate KYC2");
		selectKYC2DocType();

		Log.info("Select KYC 2 DocumentName");
		entercmpyKYC2DocumentName("dfg");

		Log.info("Enter KYC2 Doc Number");
		entercmpnyKYC2DocNo("4545");

		Log.info("Upload KYC 2 Doc");
		uploadCompanyKYC2Document("C:\\Users\\Ishant Kushwaha\\Desktop\\images.png");

		// Log.info("Select KYC Issue Date");
		// selectcmyKYC2Issuedate("20", "2018", "Jun");

		// Log.info("Select KYC2 Expire Date");
		// selectcmyKYC2Expiredate("23","2020", "Jan");

		Log.info("Enter Corporate Company Address");
		entercorpCurrentAddress("dfg");

		Log.info("Select Corporate Company Pin");
		selectComapnyPincode("201005");

		Log.info("Enter Company Name/Entity Name");
		enterCompanyNameEntityName("Sphonx");

		Log.info("Select DOI");
		selectDOI("20", "May", "2015");

		Log.info("Click Save Button");
		corporateSaveBtn();
		
		closeLeadHandoffscreen();
		
		
		handoffchildswitch();
		
		Log.info("Click On Edit button");
		clickEditButton();
		
		Log.info("Click Save Button");
		corporateSaveBtn();

	}


}
