package sbc.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadModule extends LoginPage {

	public LeadModule(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(id="2_0_193562_97aa22c4-4046-4225-a3ec-3b55f5ab06d0")
	public static WebElement clk_next;
	
	@FindBy(id="SalutationID")
	public static WebElement sel_Salutation;
	
	@FindBy(id="FirstName")
	public static WebElement txt_fname;
	
	@FindBy(id="MiddleName")
	public static WebElement txt_mname;
	
	
	@FindBy(id="LastName")
	public static WebElement txt_Lname;
	
	@FindBy(id="SuffixID")
	public static WebElement sel_suffix;
	
	@FindBy(id="MobilePhone")
	public static WebElement txt_mobile;
	
	@FindBy(id="LEA_EX3_107")
	public static WebElement sel_multiproduct;
	
	@FindBy(id="LEA_EX3_125")
	public static WebElement sel_intrested; 
	
	@FindBy(id="2_2_193562_4ffcaa77-dd1c-4226-93fd-d893dfcb7609")
	public static WebElement clk_next1;
	
	@FindBy(id="LeadSourceID")
	public static WebElement sel_LeadSource;
	
	@FindBy(id="ProductCategoryID")
	public static WebElement sel_ProductCategory;
	
	@FindBy(id="ProductID")
	public static WebElement sel_Product;
	
	@FindBy(id="2_4_193562_96229f8b-68fe-4a50-aaab-aee55803a637")
	public static WebElement clk_next2;
	
	
	
	

}
