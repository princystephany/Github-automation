package com.githubpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.githubbase.SeleniumBase;

public class WelcomePage extends SeleniumBase {

public WelcomePage(RemoteWebDriver driver) {
 this.driver =driver; 

}

 public void clickNewRepository(){
	
	 WebElement newRepo=driver.findElement(By.linkText(properties.getProperty("WelcomePage.newRepo.text")));
	 
	 click(newRepo);
}
 
 public void getDeleteDone() {
	 String password="00100Ben!";
		type(driver.findElement(By.xpath("WelcomePage.password.xpath")), password);
		click(driver.findElement(By.xpath("WelcomePage.confirm.xpath")));
 }
}
