package com.testclass.saucedemo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pomclass.saucedemo.Homepage;
import com.pomclass.saucedemo.Loginpage;

public class BasetestClass 
{
    WebDriver driver;
    @Parameters("browserName")
    
	@BeforeClass
	public void Url(String browserName)
	{
    	if(browserName.equals("chrome"))
    	{
		    System.setProperty("webdriver.chrome.driver", 
	       "C:\\Users\\Kevin\\Desktop\\Selenium files\\Browser\\chromedriver.exe");
				   
		   driver = new ChromeDriver();
	 	   System.out.println("Browser opened");
    	}
    	else if(browserName.equals("firefox"))
    	{ 
	 	  System.setProperty("webdriver.gecko.driver",
	 	  "C:\\Users\\Kevin\\Desktop\\Selenium files\\Browser\\geckodriver.exe");
	 		        
	 	  driver= new FirefoxDriver();
	      System.out.println("Browser opened");
    	}
    	else
    	{
    		System.out.println("show error");
    	}
				   
	 	   driver.get("https://www.saucedemo.com/");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   System.out.println("URL opened");
	}
	
	@BeforeMethod
	public void loginmethod() throws IOException, InterruptedException
	{
		   Loginpage lp = new Loginpage(driver);
		  
		   lp.username();
		   lp.password();
		   lp.login();
		   
		   System.out.println("credential passed");
		   System.out.println("user successfully loged in");
		   Thread.sleep(3000);
		   
	}
	
	@AfterMethod(timeOut=5000)
	public void logoutmethod()
	{
		 Homepage logoutfunction = new Homepage(driver);
		 logoutfunction.dropdown();
		 logoutfunction.logout();
		 
		 System.out.println("user loged out successfully");
	}
	
	@AfterClass(timeOut=5000)
	public void closebrowser()
	{
		driver.quit();
		System.out.println("browser closed");
	}
	
}
