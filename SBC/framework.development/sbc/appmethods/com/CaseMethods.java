//Created by Rizwan
package sbc.appmethods.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import sbc.reposrity.com.Property;
import sbc.pom.com.LeadPage;
import sbc.reposrity.com.Property;

public abstract class CaseMethods extends LoginMethods {

	public static void clkQuickAccess() {

		LeadPage.clk_Quickaccess.click();

	}

	public static void clkSalesJourney() {

		LeadPage.clk_salesjourney.click();
	}

	

}