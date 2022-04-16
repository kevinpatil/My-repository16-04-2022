package com.testclass.saucedemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pomclass.saucedemo.Homepage;
import com.pomclass.saucedemo.Loginpage;

public class TS_logout_function extends BasetestClass
{
        @Test
		public void logout()
		{
        	
		String logouturl= driver.getCurrentUrl();
		String explogouturl = "https://www.saucedemo.com/";
		
		if(logouturl.equals(explogouturl))
		{
			System.out.println("test case passed");	
		}
		else
		{
			 System.out.println("test case failed");
		}
		}
		
		
}
