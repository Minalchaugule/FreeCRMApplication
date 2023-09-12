package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory /Object Repository
		@FindBy(name="email")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//Linktext='Login'")
		WebElement LoginBtn;
		
		@FindBy(xpath="//img[contains(@class)='img-responsive']")
		WebElement crmlogo;
		
		
		
		public LoginPage()//constructor
		{
			PageFactory.initElements(driver,this); //intialising page factory object
		}
		
		//Actions
	    public String ValidateLoginPageTitle()//method
	    {
	    	 return driver.getTitle();
	    }
	    
	    public  boolean VerifyCRMImage()
	    {
	    	 return crmlogo.isDisplayed();
	    }
	    
	    public HomePage Login(String un,String pwd)
	    {
	    	username.sendKeys(un);
	    	password.sendKeys(pwd);
	    	//loginbtn.click();
	  return new HomePage();
	    }

}
