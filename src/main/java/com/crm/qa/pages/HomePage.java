package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//span[text()='minal chaugule']")
	WebElement userNameLabel;
	
	@FindBy(xpath="//div[@id='main-nav']")
	WebElement MainNavigation;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement ContactLink;
	
	@FindBy(xpath="//span[contains(text(),'Calendar')]")
	WebElement CalendarLink;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement DealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement TasksLink;
	
	
	public HomePage()//constructor
	{
		PageFactory.initElements(driver,this); //intialising page factory object
	}
	
	public String VerifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public void clickonMenu()
	{
		Actions act=new Actions(driver);		
		act.moveToElement(MainNavigation).build().perform();	
	}
	
	public ContactsPage ClickonContactsLink()
	{
		ContactLink.click();
		return new ContactsPage();
	}
	
	public DealsPage ClickonDealsLink()
	{
		DealsLink.click();
		return new DealsPage();
	}
	
	
	public CalendarPage ClickonCalendarLink()
	{
		CalendarLink.click();
		return new CalendarPage();
	}
	
	public TasksPage ClickonTasksLink()
	{
		TasksLink.click();
		return new TasksPage();
	}
}
