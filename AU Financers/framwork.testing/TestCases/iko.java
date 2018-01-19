package TestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import aufin.appmethods.com.LeadMethods;
import aufin.common.com.aufinscript;
import aufin.pom.com.LeadPage;
import aufin.reposrity.com.LeadData;
import aufin.utility.com.Log;
import org.junit.*;
import org.junit.*;
import static org.junit.Assert.*;
public class iko extends LeadMethods {

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

	/***********************************************************************************************
	 * 
	 * @author Ishant Kushwah
	 * 
	 * @TestCase : Logged in System with CSE user for asset Lead
	 * 
	 * @serialData : April 24, 2017
	 * 
	 ************************************************************************************************/
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
	 * @throws InterruptedException 
	 * 
	 * @TestCase : Move a lead From New Stage to Doc collected.
	 * 
	 * @serialData : April 25,2017
	 * 
	 ***********************************************************/

	@Test(priority=2)
	public void moveLeadToDocCollected() throws InterruptedException {
		
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
		
		common.ImplicityWait(20);

		Log.info("Fill PhotoID Name");
		fillPhotoIdKYCDetails("Voter ID", "voter", "Aadga");

		uploadPhotoIdProof("C:\\Users\\Ishant Kushwaha\\Desktop\\iko8.png");
		

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

	}

	/*****************************************************************
	 * @author Ishant Kushwaha
	 * 
	 * @TestCase : Move a lead on doc collected .
	 * 
	 * @serialData: April 26, 2017
	 ******************************************************************/

	@Test(priority=4)
	public void logOutwithCSE() {
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Logged out");

		Log.info("Logged out from System");
		click_LoginOutButton();

	}

	/*****************************************************************
	 * @author Ishant Kushwaha
	 * 
	 * @TestCase : Login with Branch Manager .
	 * 
	 * @serialData: April 26, 2017
	 ******************************************************************/

	@Test(priority=5)
	public void loginwithbranch() {
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Logged in with Branch Manager");

		Log.info("enter Branch Manager Username");
		Enter_txtName(LeadOwner);

		Log.info("Enter Branch Manager Password");
		Enter_txtPassword("acid_qa");

		Log.info("Click Login Button");
		click_LoginButton();

		Log.info("Navigate to Lead Hoem Screen");
		navigateToLeadHomeScreen();

	}

	/*****************************************************************
	 * @author Ishant Kushwaha
	 * 
	 * @TestCase : Recommended or reject a lead.
	 * 
	 * @serialData: April 26, 2017
	 ******************************************************************/

	@Test(priority=6)
	public void takeactionByBM() {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Logged in with Branch Manager");

		common.ImplicityWait(20);

		Log.info("Select lead view");
		selectcustommodule("Asset ");
		selectLeadCustomview("Pending BM Recommendation *");

		Log.info("Click and open lead");
		leadDetailsingrid();

		Log.info("Click On Edit button");
		clickEditButton();

		common.ImplicityWait(20);

		Log.info("Recommended Asset Lead");
		actionsonBM("Approved");

		Log.info("Click Save Button");
		clickSaveProcessedButton();
		
		closeLeadHandoffscreen();
		
		
	
		
	
		
	}
	

	/*****************************************************************
	 * @author Ishant Kushwaha
	 * 
	 * @TestCase : Lead Search
	 * 
	 * @serialData: April 27, 2017
	 ******************************************************************/

	@Test(enabled=false)
	public void LeadSearchonHome() {
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Lead Search from Home Screen");
		
		common.ImplicityWait(20);
		navigateToLeadHomeScreen();
		LeadSearchonHOmeScreen("Lead No", "dfghjk");
	}

	/********************************************************************
	 * @author Ishant Kushwaha
	 * 
	 * @TestCase : Lead to Lead Dedupe Testcase
	 * 
	 * @throws Exception
	 ***********************************************************************/

	public void LeadtoLeadDedupe() throws Exception {
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Craete an RLOS Lead for Individual Entity");

		Log.info("Navigate to Asset");
		navigate_to_asset();

		common.ImplicityWait(20);

		Log.info("Select Entity Type");
		select_Entity(dupeEntity);

		Log.info("Select Product Category");
		select_ProductCategory("Wheels");

		Log.info("Select Product");
		System.out.println(LeadData.product);
		select_ProductType(LeadData.product);
		

		Log.info("Enter Mobile Number");
		enter_MobileNo(dupeMobile);
		

		Log.info("Select Salution");
		Select_Salution(LeadData.salutration);

		Log.info("Enter FirstName");
		enter_FirstName(dupeFname);
		

		Log.info("Enter Middle Name");
		enter_MiddleName(dupeMname);

		Log.info("Enter Last Name");
		enter_LastName(dupeLname);

		Log.info("Enter ShortName");
		enter_shortName(LeadData.ShortName);

		common.downscroll();

		Log.info("Select Date of Birth");
		selectDate(LeadData.Date, LeadData.month, LeadData.Year);

		Log.info("Enter AadharCard No");
		enter_AadharCard(dupeAddhar);

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
		
		common.ImplicityWait(20);
		takeDedupeaction("ignore");
		
		
		
		
		
	}

	/**********************************************************************
	 * @author Ishant Kushwaha
	 * @throws Exception 
	 * 
	 * @TestCase : Lead to Customer De dupe TestCases
	 * 
	 * 
	 **********************************************************************/

	@Test(enabled = false)
	public void LeadtoCustomerDedupe() throws Exception {
		Log.startTestCase("Craete an RLOS Lead for Individual Entity");

		Log.info("Navigate to Asset");
		navigate_to_asset();

		common.ImplicityWait(20);

		Log.info("Select Entity Type");
		select_Entity(dupeEntity);

		Log.info("Select Product Category");
		select_ProductCategory("Wheels");

		Log.info("Select Product");
		System.out.println(LeadData.product);
		select_ProductType(LeadData.product);
		

		Log.info("Enter Mobile Number");
		enter_MobileNo(LeadData.mobile_number);
		

		Log.info("Select Salution");
		Select_Salution(LeadData.salutration);

		Log.info("Enter FirstName");
		enter_FirstName(LeadData.Fname);
		

		Log.info("Enter Middle Name");
		enter_MiddleName(LeadData.LName);

		Log.info("Enter Last Name");
		enter_LastName(LeadData.LName);

		Log.info("Enter ShortName");
		enter_shortName(LeadData.ShortName);

		common.downscroll();

		Log.info("Select Date of Birth");
		selectDate(LeadData.Date, LeadData.month, LeadData.Year);

		Log.info("Enter AadharCard No");
		enter_AadharCard(dupeAddhar);

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
		
		common.ImplicityWait(20);
		takeDedupeaction("ignore");

		

	}

	/*************************************************************
	 * @author Ishant Kushwaha
	 * 
	 * @TestCase :Here we logged element related to corporate customer
	 * 
	 * 
	 **************************************************************/

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
		
		
		common.ImplicityWait(20);

		Log.info("Upload KYC1 Attachement");
		uploadCompanyKYC1Document("C:\\Users\\Ishant Kushwaha\\Desktop\\images.png");

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

	}

	/*************************************************************************************
	 * @author Ishant Kushwaha
	 * @throws InterruptedException 
	 * 
	 * @TestCase : Coapplicant LeadHandoff
	 * 
	 * 
	 * 
	 *************************************************************************************/

	@Test(priority=7)
	public void coapplicantLeadHandoff() throws InterruptedException {
		
		common.ImplicityWait(20);
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("HandoffChildLead");
	
		closeLeadHandoffscreen();
		
		
		handoffchildswitch();
		
		Log.info("Click On Edit button");
		clickEditButton();
		
		Log.info("Click Save Button");
		corporateSaveBtn();
		
		

	}

	

	/*************************************************************************************************
	 * @author Ishant Kushwaha
	 * 
	 * @TestCase : Coapplicant RLOS Process
	 * 
	 * 
	 * @throws InterruptedException
	 ************************************************************************************************/

	@Test(priority=3)
	public void childRLOSProcess() throws InterruptedException {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Craete an RLOS Process for Child");
		
		common.ImplicityWait(20);
		Log.info("Select Co-applicantLayout");
		selectCoapplicantLayout();

		common.ImplicityWait(20);

		Log.info("Select Entity Type");
		select_Entity(LeadData.entity);

		Log.info("Enter Mobile Number");
		enter_MobileNo(LeadData.mobile_number);

		Log.info("Select Salution");
		Select_Salution(LeadData.salutration);

		Log.info("Enter FirstName");
		enter_FirstName(LeadData.Fname);

		Log.info("Enter Middle Name");
		enter_MiddleName(LeadData.MName);

		Log.info("Enter Last Name");
		enter_LastName(LeadData.LName);

		Log.info("Enter ShortName");
		enter_shortName(LeadData.ShortName);

		common.downscroll();

		Log.info("Select Date of Birth");
		childRlosselectDate(LeadData.Date, LeadData.month, LeadData.Year);

		Log.info("Enter AadharCard No");
		enter_AadharCard(LeadData.aadhar);

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

		Log.info("Upload Customer Photo");
		uploadCustomerPhoto(LeadData.CustomerPhoto);

		Log.info("Upload Customer Signature");
		uploadCustomerSign(LeadData.CustomerSignature);
		
		common.ImplicityWait(20);
		common.ExplicityWait(50);
		 Log.info("Fill PhotoID Name");
		 childfillPhotoIdKYCDetailsonchild("Aadhar Card", "Aadhar123", "Aadga",
		 "C:\\Users\\Ishant Kushwaha\\Desktop\\images.png");
//		 fillPhotoIdKYCDetails("Aadhar Card", "Aadhar123", "Aadga", "C:\\Users\\Ishant Kushwaha\\Desktop\\images.png");

		common.ImplicityWait(20);
		Log.info("Select permananet address");
		enterPermananetAddressLine1("Permanant");

		childRlosPermanenetPincode("201005");

		Log.info("Click Save Button");
		corporateSaveBtn();

	}

	@Test(priority = 1,enabled=true)
	public void CLOSPRocessforparent() {

		DOMConfigurator.configure("log.xml");
		Log.startTestCase("Craete an CLOS Lead for Parent");

		Log.info("Navigate to Asset");
		navigate_to_asset();

		common.ImplicityWait(20);

		Log.info("click on Doc collected stage");
		click_docCollectedStage();

		Log.info("Select Entity");
		select_Entity(LeadData.CoapplicantEntity);

		Log.info("Select Product Category");
		select_ProductCategory("Wheels");

		Log.info("Select Product");
		System.out.println(LeadData.product);
		select_ProductType(LeadData.product);

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

		Log.info("Select Industry");
		CompanyselectIndutryd("Food");

		Log.info("Select SubInd");
		selectSubIndus("FISH");

		Log.info("select Corporate KYC1");
		selectcmpnykyc1doc();
		selectcmyKYC1Issuedate("10", "2015", "Jan");

		Log.info("Document Name");
		enterCompanyKYC1DOCNAME("TEST");

		Log.info("Enter KYC Doc1 Number");
		entercmpnyKYC1DocNo("1569");

		Log.info("Select RiskClassification");
		selectRiskClassification(2);

		Log.info("Enter Loan Amount");
		enterLoanAmount(LeadData.LoanAmount);

		common.downscroll();

		Log.info("Upload KYC1 Attachement");
		CompanyKYC1Atatchement("C:\\Users\\Ishant Kushwaha\\Desktop\\images.png");

		// Log.info("Insert KYC 1 Expire Date");
		// selectcmyKYC1Expiredate("20", "2018", "Mar");

		Log.info("Select Corporate KYC2");
		selectKYC2DocType();

		Log.info("Select KYC 2 DocumentName");
		entercmpyKYC2DocumentName("dfg");

		Log.info("Enter KYC2 Doc Number");
		entercmpnyKYC2DocNo("4545");

		Log.info("Upload KYC 2 Doc");
		CompanyKYC2Atatchement("C:\\Users\\Ishant Kushwaha\\Desktop\\images.png");

		// Log.info("Select KYC Issue Date");
		// selectcmyKYC2Issuedate("20", "2018", "Jun");

		// Log.info("Select KYC2 Expire Date");
		// selectcmyKYC2Expiredate("23","2020", "Jan");

		common.downscroll();

		Log.info("Enter Corporate Company Address");
		entercorpCurrentAddress("dfg");

		Log.info("Select Corporate Company Pin");
		CompanyselectComapnyPincode("201005");

		Log.info("Enter Company Name/Entity Name");
		enterCompanyNameEntityName("Sphonx");

		Log.info("Select DOI");
		selectDOI("20", "May", "2015");

		Log.info("Click Save&Processed");
		clickSaveProcessedButton();
		
		LeadOwner = LeadPage.getLeadOwner.getText();

	}
	
	
	public void createFraudLead() throws Exception{
		
		DOMConfigurator.configure("log.xml");
		Log.startTestCase("AML FRAUD Lead");
		
		
		Log.info("Create a lead");
		createApplicantLeadOnNewStage();
		
		Log.info("Move to Doc Collected");
		moveLeadToDocCollected();
		
		Log.info("Sent for bm");
		logOutwithCSE();
		
		Log.info("Logged in with Branch Manager");
		loginwithbranch();
		
		Log.info("Take Action on Lead");
		takeactionByBM();
		
		Log.info("Verify alert notification get Displayed");
	}
}
