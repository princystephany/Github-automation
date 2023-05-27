package com.githubpages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.githubbase.SeleniumBase;

public class LoginPage extends SeleniumBase{

	
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String userName, String password) {
		type(driver.findElement(By.xpath(properties.getProperty("LoginPage.username.xpath"))), userName);
		type(driver.findElement(By.xpath(properties.getProperty("LoginPage.password.xpath"))), password);
		click(driver.findElement(By.xpath(properties.getProperty("LoginPage.password.xpath"))));
	}
}
