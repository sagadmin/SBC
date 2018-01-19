package sbc.appmethods.com;

import sbc.comman.com.Connectivity;
import sbc.pom.com.LoginPage;

public abstract class LoginMethods extends Connectivity{
	
	public static void enter_username(String username){
		LoginPage.txt_username.sendKeys(username);
	}
	
	public static void enter_password(String password){
		LoginPage.txt_password.sendKeys(password);
	}
	
	public static void clk_login(){
		
		LoginPage.btn_login.click();
	}

}
