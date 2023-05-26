package com.testflow;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.githubbase.SeleniumBase;

public class Common extends SeleniumBase{

	@BeforeTest
	public void setUp() {
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/");
		
		//wait = new WebDriverWait(driver, 20);
		
		
 	}
	@AfterTest
	public void quit() {
		
	}
	
}
