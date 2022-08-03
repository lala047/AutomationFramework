package com.multitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class SetUp {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Initalization() throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://amazon.co.uk");

		
		driver.manage().window().maximize(); //maximize the window
	
	Thread.sleep(6000);
	}
	
	@AfterMethod
	public void Cleanup()
	{
		driver.close();
	}

}
