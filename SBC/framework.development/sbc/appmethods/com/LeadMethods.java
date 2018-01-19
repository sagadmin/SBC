package sbc.appmethods.com;

import org.openqa.selenium.support.ui.Select;

import sbc.pom.com.LeadModule;
import sbc.reposrity.com.Property;

public abstract class LeadMethods extends LoginMethods{
	
	public static void navigatetoLeadJourney(){
		
		driver.navigate().to(Property.navigateLeadHome);
		driver.navigate().to(Property.retailNTb);
	}
	
	public static void searchCustomer(){
		
		LeadModule.clk_next.click();
		
	}
	
	public static void SelectCustomerSalutaion(String Salutation){
		
		new Select(LeadModule.sel_Salutation).selectByVisibleText(Salutation);
	}
	
	public static void Enter_Firstname(String Fname){
		
		LeadModule.txt_fname.sendKeys(Fname);
	}
	
public static void Enter_MiddleName(String Mname){
		
		LeadModule.txt_mname.sendKeys(Mname);
	}

public static void Enter_Lastname(String Lname){
	
	LeadModule.txt_fname.sendKeys(Lname);
}

}
