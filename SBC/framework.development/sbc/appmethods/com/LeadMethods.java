package sbc.appmethods.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import sbc.reposrity.com.Property;
import sbc.pom.com.LeadPage;
import sbc.reposrity.com.Property;

public abstract class LeadMethods extends LoginMethods {

	public static void clkQuickAccess() {

		LeadPage.clk_Quickaccess.click();

	}

	public static void clkSalesJourney() {

		LeadPage.clk_salesjourney.click();
	}

	public static void clkNTBSalesJourney() {

		LeadPage.clk_ntbJourney.click();
	}

	public static void clk_NextButton() {

		LeadPage.clk_firstNext.click();
	}

	public static void SelectSalutaion(String Salutation) {

		new Select(LeadPage.select_Salutation).selectByVisibleText(Salutation);
	}

	public static void EnterFirstName(String Fname) {

		LeadPage.txt_Fname.sendKeys(Fname);
	}

	public static void EnterLastName(String Lname) {

		LeadPage.txt_Lname.sendKeys(Lname);
	}

	public static void EnterMiddleName(String Mname) {

		LeadPage.txt_mName.sendKeys(Mname);
	}

	public static void SelSuffix(String Suffix) {
		new Select(LeadPage.sel_suffix).selectByVisibleText(Suffix);
	}

	public static void enterMobile(String mobile) {

		LeadPage.txt_MobilePhone.sendKeys(mobile);
	}

	public static void selectMultipleProductNo() {

		new Select(LeadPage.sel_MultiProducts).selectByVisibleText("No");
	}

	public static void selectIntrestedin(String productcat) {

		new Select(LeadPage.sel_Intresed).selectByVisibleText(productcat);
	}

	public static void selectProductCategory(String ProductCategory) {
		new Select(LeadPage.sel_ProductCategory).selectByVisibleText(ProductCategory);
	}

	public static void selectLeadSource(String leadSource) {

		new Select(LeadPage.sel_LeadSource).selectByVisibleText(leadSource);
	}

	public static void selectProduct(String Product) {
		new Select(LeadPage.sel_Product).selectByVisibleText(Product);
	}

	public static void clk_2ndNextButton() {

		LeadPage.clk_secondNext.click();
	}

	public static void clk3rdNextButton() {

		LeadPage.clk_thidNext.click();
	}

	public static void clkSalesModule() {

		LeadPage.clk_Sales.click();
	}

	public static void clkLeadModule() {

		LeadPage.clk_SalesLeads.click();

	}

	public static void enterLeadidforsearch(String Leadid) {

		LeadPage.txt_leadId.sendKeys(Leadid);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER);

	}

}