package com.githubpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.githubbase.SeleniumBase;

public class SettingsPage extends SeleniumBase {
	
	public SettingsPage(RemoteWebDriver driver){
		this.driver= driver;
		
	}
	
	 public void clickDeleteRepo(String repoName,String username) {
		click(driver.findElement(By.xpath("Settings.delete.xpath")));
		click(driver.findElement(By.xpath("Settings.deleteProceed.xpath")));
		click(driver.findElement(By.xpath("Settings.deleteProceed2.xpath")));
		String repository="princystephany/git-testing";
		type(driver.findElement(By.xpath("Settings.deleteInput.xpath" )), repository);
		WebElement deleteBtn=driver.findElement(By.xpath("Settings.deleteProceed3.xpath"));
 		
	 }
}
