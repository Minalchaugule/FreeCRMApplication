package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void Setup()
	{
		initialisation();
	 loginPage=new LoginPage();
	 homePage=loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test
	public void VerifyHomePageTitleTest()
	{
		String HomePgaeTitle=homePage.VerifyHomePageTitle();
		Assert.assertEquals(HomePgaeTitle, "CRMPRO", "Home page title is not matched");	
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
	driver.close();	
	}

}
