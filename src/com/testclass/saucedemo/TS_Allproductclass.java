package com.testclass.saucedemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pomclass.saucedemo.Homepage;
import com.pomclass.saucedemo.Loginpage;

public class TS_Allproductclass extends BasetestClass
{
  @Test
  public void allproductfunction() throws InterruptedException
  {
  
	        //add all 6 products:-
			   
			   Homepage all = new Homepage(driver);
			   all.allproduct();
			   System.out.println("all products added to cart");
			   
			   String acttext = all.carttext();
			   String exptext= "6";
			   
			   if(acttext.equals(exptext))
			   {
				   System.out.println("test case passed");
			   }
			   else
			   {
				   System.out.println("test case failed");
			   }
	  
  }
}
