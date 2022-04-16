package com.testclass.saucedemo;

import java.io.IOException;
import java.time.Duration;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pomclass.saucedemo.Homepage;
import com.pomclass.saucedemo.Loginpage;

import junit.framework.Assert;
import utilitypackage.Utilityclass;

public class TS_Login_function extends BasetestClass
{
      
	
   //now inherit base test class and use their common methods directly:-
	
         @Test
         public void loginfunction() throws IOException, InterruptedException
         {
        	 
			   //check test case passsed or not by URL:-
        	 
        	 
			 String actualurl =driver.getCurrentUrl();
			 System.out.println(actualurl);
        	 
			 String expectedurl ="https://www.saucedemo.com/inventory.html";
	  
//			 if(actualurl.equals(expectedurl))
//			 {
//				 System.out.println("test case passed");
//			 }
//			 else
//			 {
//				 System.out.println("test case failed");
//			 }
			 
			 //OR
			 
			 Assert.assertEquals("case failed",actualurl, expectedurl);
			 
         }	 
			 
      
         
  
}
