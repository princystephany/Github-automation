package com.testflow;

import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.githubpages.CreateRepo;
import com.githubpages.HomePage;
import com.githubpages.LoginPage;
import com.githubpages.RepoCode;
import com.githubpages.SettingsPage;
import com.githubpages.WelcomePage;

public class GithubFlow extends Common{
	
//Creating constructors
	Properties prop;

	HomePage home;
	LoginPage login;
	WelcomePage page;
	RepoCode repo;
	CreateRepo createRepo;
	SettingsPage settings;

	@BeforeClass
	void setObject() {
	home=new HomePage(driver);
	login=new LoginPage(driver);
	page= new WelcomePage(driver);
	repo = new RepoCode(driver);
	createRepo= new CreateRepo(driver);
	settings=new SettingsPage(driver);
	
	}
	
	
	@Test
	public void login() {
		login.login(prop.getProperty("username","password"));

	}
//
//	@Test
//	public void createRepo(){
//
//	}
//	@Test
//	public void deleteRepo(){
//
//	}
}
