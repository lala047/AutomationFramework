package com.multitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultiTest extends SetUp {

	WebDriver driver;

	
	@Test(priority = 1)
	public void SelectDropDown() throws InterruptedException {

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

		Select sel = new Select(dropdown);

		sel.selectByIndex(4);

		sel.selectByValue("search-alias=beauty");

		sel.selectByVisibleText("DIY & Tools");

		Thread.sleep(4000);
		driver.close();
	}

	@Test(priority = 2)
	public void AdvanceDropDown() throws InterruptedException {

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

		Select sel = new Select(dropdown);

		List<WebElement> li = sel.getOptions();

		System.out.println(li.size());

		for (int i = 0; i < li.size(); i++) {

			li.get(i).click(); // This will click all the dropdowns
			System.out.println(li.get(i).getText());

		}

	}

	

}
