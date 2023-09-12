package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class CreditCardPaymentTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	public CreditCardPaymentTest()
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
}
