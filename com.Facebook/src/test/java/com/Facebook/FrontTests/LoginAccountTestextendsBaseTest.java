package com.Facebook.FrontTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.Facebook.Frontpages.LoginAccount;

public class LoginAccountTestextendsBaseTest {
	
	@Test
	public void loginTest() {
		LoginAccount lap=PageFactory.initElements(driver, LoginAccount.class);
	    lap.userName("Davis");
	    lap.passWord("97987");
	    lap.submit();
	}
}
