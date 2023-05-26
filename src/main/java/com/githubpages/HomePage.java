package com.githubpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.githubbase.SeleniumBase;

public class HomePage extends SeleniumBase{

	public HomePage(RemoteWebDriver driver){

		this.driver=driver;


	}

	public void clickSignIn() {
		
		String signInLocator=properties.get("HomePage.signIn.text").toString();
		WebElement signIn= driver.findElement(By.xpath(signInLocator));
		click(signIn);

	}

}
