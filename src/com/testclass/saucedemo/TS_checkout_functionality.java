package com.testclass.saucedemo;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.pomclass.saucedemo.Homepage;
import com.pomclass.saucedemo.Loginpage;
import com.pomclass.saucedemo.Yourcart;

public class TS_checkout_functionality extends BasetestClass
{

    @Test
	public void checkoutfunction() 
	{
		          //now go for select product and click on add to cart:-
				   
				   Homepage hp = new Homepage(driver);
				   hp.filter();
				   System.out.println("clicked on filter");
				   System.out.println("Price low to high");
				   
				   hp.addtocart();
				   System.out.println("red t-shirt added to cart");
				   
				   hp.cartbutton();
				   System.out.println("clicked on cart icon and moved to your cart");
				   
				   //now check checkout function:-
				   
				   Yourcart x = new Yourcart(driver);
				   x.checkout();
				   System.out.println("clicked on checkout");
				   
				   String expUrl= "https://www.saucedemo.com/checkout-step-one.html";
				   String actUrl= driver.getCurrentUrl();
				   
				  if(expUrl.equals(actUrl))
				  {
					  System.out.println("test case passed");
				  }
				  else
				  {
					  System.out.println("test case failed");
				  }
	   
	
		
		
		
	}
}
