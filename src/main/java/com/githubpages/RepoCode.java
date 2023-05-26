package com.githubpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.githubbase.SeleniumBase;

public class RepoCode extends SeleniumBase {
	
	public RepoCode(RemoteWebDriver driver){
		this.driver= driver;
		
	}
	
	public boolean isRepoCreated(String repoName) {
		return driver.findElement(By.linkText(repoName)).isDisplayed();
	}
	
	public void clickSettings(){
		
		WebElement settings = driver.findElement(By.cssSelector(""));
		click(settings);
	}

}
