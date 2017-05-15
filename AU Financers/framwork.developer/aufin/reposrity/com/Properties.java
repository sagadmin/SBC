package aufin.reposrity.com;

import aufin.common.com.CommonMethods;
import aufin.common.com.TestData;
import aufin.common.com.aufinscript;

public interface Properties {
	String chromepaths = "C:\\Eclipse\\chromedriver.exe";
	String chromeDriver = "webdriver.chrome.driver";
	String webSiteURL = aufinscript.getURL();
	String TestDataSheet = "C:\\Users\\Ishant Kushwaha\\Desktop\\AUFIN.xlsx";
	String msg_BlankField = "We did not found any value";
	String Liability_URL ="http://aufin.crmnext.com/sn/app/AutoFlow/RunFlow?x=m7psnshf4ta9s48wn98htatrcvwuts7cv37vrqt75m6n3yh4ynwqunl5vuk4675v&layid=wfvNipXtJ%2Fin55oO6wCXeQ%3D%3D&pid=kpp0IyYNUG2zvnD4wtl77g%3D%3D&cogtype=false";
	String Asset_URL =aufinscript.getAssertURL();
	CommonMethods common = new CommonMethods();
	TestData data = new TestData();
	String panRegex ="([A-Z]){5}([0-9]){4}([A-Z]){1}";
	String aadharRegex ="([2-9]){1}([0-9]){11}";
	String alphabetciReg ="[a-zA-Z]";
	String customerphoto ="C:\\Users\\admin\\Desktop\\photo.jpg";

}
