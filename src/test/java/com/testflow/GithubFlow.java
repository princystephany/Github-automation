 package com.testflow;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.githubbase.Common;
import com.githubpages.CreateRepo;
import com.githubpages.HomePage;
import com.githubpages.LoginPage;
import com.githubpages.RepoCode;
import com.githubpages.SettingsPage;
import com.githubpages.WelcomePage;

public class GithubFlow extends Common{

	HomePage home;
	LoginPage login;
	WelcomePage welcome;
	RepoCode repo;
	CreateRepo createRepo;
	SettingsPage settings;

	String repoName = "Repo10";
	String userName;

	@BeforeClass
	void setObject() {
		userName = prop.getProperty("username");
		home = new HomePage(driver);
		login = new LoginPage(driver);
		welcome = new WelcomePage(driver);
		repo = new RepoCode(driver);
		createRepo = new CreateRepo(driver);
		settings = new SettingsPage(driver);
	}

	@Test(priority = 1)
	void login() {
		home.clickSignIn();
		login.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority = 2, enabled = false)
	void createRepo(){
		welcome.clickNewRepository();
		createRepo.enterRepoDetails(repoName, "Automated by Selenium test");
		boolean selectedRepoType = createRepo.getSelectedRepoType();
		if(selectedRepoType)
			createRepo.clickCreateRepository();
		Assert.assertTrue(repo.isRepoCreated(repoName));
	}
	@Test(priority = 3)
	void deleteRepor(){
		repoName  = "Repo9";
		welcome.clickNewRepository();
		createRepo.enterRepoDetails(repoName, "Automated by Selenium test");
		boolean selectedRepoType = createRepo.getSelectedRepoType();
		if(selectedRepoType)
			createRepo.clickCreateRepository();
		Assert.assertTrue(repo.isRepoCreated(repoName));
		repo.clickSetting();
		settings.clickDeleteRepo(repoName, userName);
		String deleteMessage = welcome.getDeleteDone();
		System.out.println(deleteMessage);
		Assert.assertTrue(deleteMessage.contains("deleted."));
	}


}
