/****@Author by Rizwan-Dated-27-Feb-18***/
package sbc.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CasePage extends LoginPage {

	public CasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//ul[@id='js-vnav']/li[2]/a/i")
	public static WebElement clk_Quickaccess;
	
	@FindBy(linkText="Sales Journey")
	public static WebElement clk_salesjourney;
	
	@FindBy(xpath="//a[@id='1']/p/span")
	public static WebElement clk_ntbJourney;
	
	@FindBy(linkText="Next")
	public static WebElement clk_firstNext;
	
	@FindBy(id="SalutationID")
	public static WebElement select_Salutation;
	
	@FindBy(id="FirstName")
	public static WebElement txt_Fname;
	
	@FindBy(id="MiddleName")
	public static WebElement txt_mName;
	
	@FindBy(id="LastName")
	public static WebElement txt_Lname;
	
	@FindBy(xpath="//select[@id='SuffixID']//option[2]")
	public static WebElement sel_suffix;
	
	@FindBy(id="MobilePhone")
	public static WebElement txt_MobilePhone;
	
	@FindBy(xpath="//select[@id='LEA_EX3_107']")
	public static WebElement sel_MultiProducts;
	
	@FindBy(id="LEA_EX3_125")
	public static WebElement sel_Intresed;
	
	@FindBy(linkText="Next")
	public static WebElement clk_secondNext;
	
	@FindBy(id="LeadSourceID")
	public static WebElement sel_LeadSource;
	
	
	@FindBy(id="ProductCategoryID")
	public static WebElement sel_ProductCategory;
		
	
	@FindBy(id="ProductID")
	public static WebElement sel_Product;
	
	
	@FindBy(linkText="Next")
	public static WebElement clk_thidNext;
	
	@FindBy(xpath="//ul[@id='js-vnav']/li[5]/a/i/span")
	public static WebElement clk_Sales;
	
	@FindBy(linkText="Leads")
	public static WebElement clk_SalesLeads;
	
	@FindBy(xpath="sdd-drCustomViewFilter_select_1")
	public static WebElement select_ModuleFilter;
	
	@FindBy(xpath="sdd-drCustomViewFilter_select_2")
	public static WebElement select_StageViews;
	
	@FindBy(linkText="Leads")
	public static WebElement clk_Leads;
	
	@FindBy(id="widget_23_M_LeadID")
	public static WebElement txt_leadId;
	
	@FindBy(id="//div[@id='row0grid_23']")
	public static WebElement click_searchLead;
	
	}
