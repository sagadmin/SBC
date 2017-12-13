package aufin.reposrity.com;

import aufin.common.com.TestData;
import aufin.common.com.aufinscript;

public interface LeadData extends Properties{
	
	String cseusername ="cse";
	String csepassword ="acid_qa";
	String bmusername ="117049";
	String bmpassword ="acid_qa";
	String entity ="INDIVIDUAL - FULL KYC";
	String product =  "Tractor (Used)";//aufinscript.getProduct();                                    
	String mobile_number ="9856321589";//data.randomMobileNumber(10);
	String salutration ="MR.";
	String Fname =  data.randomAlphaNumeric(5);
	String MName =data.randomAlphaNumeric(5);
	String LName =data.randomAlphaNumeric(5);
	String ShortName =data.randomAlphaNumeric(3);
	String Date = data.randomDateGenrated(2);
	String month ="Aug";
	String Year ="1968";
	String aadhar =data.randomaadharnumber(16);
	String Gender ="Male";
	String CurrentAddress ="Banglore"; 
	String fullName = Fname+MName+LName;
	String LoanAmount ="500";
	String CustomerPhoto ="C:\\Users\\Ishant Kushwaha\\Desktop\\iko1.png";
	String CustomerSignature="C:\\Users\\Ishant Kushwaha\\Desktop\\iko1.png";
	String filename = data.randomAlphaNumeric(2);
	
	
	
	////////////////////////////////////////////////////////////////////////////////////
	String coapplicantLeadStatusBM="BM Recommended";
	String CoapplicantEntity ="PARTNERSHIP FIRM";
	String CoapplicantFname =data.randomAlphaNumeric(6);
	String CoapplicantMname =data.randomAlphaNumeric(6);
	String CoapplicantLname =data.randomAlphaNumeric(5);
	String CoapplicantShortName=data.randomAlphaNumeric(3);
	String CoappliantMobileNo=data.randomMobileNumber(10);
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	String co_EntityType="GOVT.";
	String co_Salutaion="M/S.";
	String co_Fname=data.randomAlphaNumeric(6);
	String co_mname=data.randomAlphaNumeric(2);
	String co_Lname=data.randomAlphaNumeric(3);
	String co_ShortName=data.randomAlphaNumeric(3);
	String co_MobileNo=data.randomMobileNumber(10);
	
	///////////////////////////////////////////////////////////////////////////////////////
	

}
