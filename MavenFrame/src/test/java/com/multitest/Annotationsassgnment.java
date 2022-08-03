package com.multitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Annotationsassgnment extends SetUp {
	
	
	
	@Test(priority=1)
	public void SelectDropDown() throws InterruptedException
	{
		
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\emmai\\OneDrive\\Desktop\\SeleniumJars\\chromedriver.exe");
//		
//		 driver = new ChromeDriver();
//		
//		driver.get("https://amazon.co.uk");
//
//		
//		driver.manage().window().maximize(); //maximize the window
		
		
		
	WebElement dropdown = 	driver.findElement(By.id("searchDropdownBox"));
	
	Select sel = new Select(dropdown);
	
	sel.selectByIndex(4);
	
	sel.selectByValue("search-alias=beauty");
	
	sel.selectByVisibleText("DIY & Tools");
	
	Thread.sleep(4000);
	
	
	}
	
		
		@Test(priority=2)
		public void AdvanceDropDown() throws InterruptedException
		{
			

		driver.findElement(By.xpath("//input[@id='sp-cc-accept']")).click();
		
		Thread.sleep(6000);
		
	WebElement dropdown = 	driver.findElement(By.id("searchDropdownBox"));
	
	Select sel = new Select(dropdown);
	
	List<WebElement> li  = sel.getOptions();
	
	System.out.println(li.size());
	
	for(int i = 0 ; i<li.size() ; i++){

		li.get(i).click();     // This will click all the dropdowns
		System.out.println(li.get(i).getText());
		
	
	}
	
		}
	//@AfterClass

	}

//@BeforeClass- Opens the browser and runs the first method and then open the 2nd method 
//@BeforeMethod- runs before each test method
//@AfterClass- closes the browser after all the methods have run
//@AfterMethod- runs after each test method