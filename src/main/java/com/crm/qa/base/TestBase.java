package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.UtilTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {

	
		// TODO Auto-generated method stub
		public static WebDriver driver;
		public static Properties prop;
		
		public TestBase()
		{
			try
			{
			prop=new Properties();	
			FileInputStream ip=new FileInputStream(System.getProperty("C://Users//sandy//eclipse-workspace//FreeCRMApplicationTest//src//main//java//com//crm//qa//config//config.properties"));
					prop.load(ip);
			}catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
			public static void initialisation()
			{
				String browserName =prop.getProperty("browser");
				if(browserName.equals("chrome"))
				{
					WebDriverManager.chromedriver().setup();
				      driver=new ChromeDriver();
				}
				else if(browserName.equals("Firefox"))
				{
					WebDriverManager.firefoxdriver().setup();
				      driver=new FirefoxDriver();
					
				}
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(UtilTest.IMPLICIT_WAIT));
				driver.get(prop.getProperty("url"));
			}
		

	

	}


