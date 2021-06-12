

	package com.Facebook.BaseTest;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseTest {
		public  WebDriver driver;
		@BeforeTest
		public void setup() {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
		}
		
		@AfterTest
		public void finish() {
			driver.quit();
		}
	}

