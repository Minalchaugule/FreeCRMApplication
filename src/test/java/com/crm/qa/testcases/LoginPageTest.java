package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void Setup()
	{
		initialisation();
	 loginPage=new LoginPage();
	}
	
	@Test
	public void ValidateLoginPageTitle()
	{
		String title=loginPage.ValidateLoginPageTitle();
		Assert.assertEquals(title,"Free CRM software for any business with sales, support and customer relationship management");
	}
	
	@Test
	public void crmlogoTest()
	{
		boolean flag=loginPage.VerifyCRMImage();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void LoginTest()
	{
		homePage=loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown()
	{
	driver.close();	
	}

}