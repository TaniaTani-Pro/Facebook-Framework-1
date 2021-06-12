package com.Facebook.Frontpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginAccountwithConstractor {
	
		WebDriver driver;

		@FindBy(how=How.XPATH, using="//input[@id='email']") WebElement emailTextBox;
		
		@FindBy(id="pass") public WebElement locatorPass;
		
		@FindBy(how=How.XPATH, using="//a[starts-with(@id, 'u_0_2')]")  WebElement submitTextBox;
		
		
		public LoginAccountwithConstractor(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		public WebElement userName(String uName) {	
			emailTextBox.sendKeys(uName);
			System.out.println("username test");
			return emailTextBox;
			
		}
		
		public WebElement passWord(String pass) {
			locatorPass.sendKeys(pass);
			System.out.println("pass  test");
			return emailTextBox;
			
			
		}
		
		public WebElement submit() {
			System.out.println("submit test");
			submitTextBox.click();
			return emailTextBox;
			
		}

		public void loginAccount( String uName, String pass) {
			this.userName(uName);
			this.passWord(pass);
			this.submit();
			
		}
}
