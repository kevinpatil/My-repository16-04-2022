package com.testclass.saucedemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pomclass.saucedemo.Homepage;
import com.pomclass.saucedemo.Loginpage;
import com.pomclass.saucedemo.Yourcart;

public class TS_continue_shopping extends BasetestClass
{
	 @Test
     public void continue_shopping() 
     {
	         
			   //now go for select product and click on add to cart:-
			   
			   Homepage hp = new Homepage(driver);
			   hp.filter();
			   System.out.println("clicked on filter");
			   System.out.println("Price low to high");
			   
			   hp.addtocart();
			   System.out.println("red t-shirt added to cart");
			   
			   hp.cartbutton();
			   System.out.println("clicked on cart icon");
			   System.out.println("moved to your cart page");
	 
			   Yourcart x = new Yourcart(driver);
	           x.cotinueshopping();
	           System.out.println("clicked on continue shopping");
	
	           String expurl="https://www.saucedemo.com/inventory.html";
	           String acturl= driver.getCurrentUrl();
	           
	           if(expurl.equals(acturl))
	           {
	        	   System.out.println("test case passed");
	           }
	           else
	           {
	        	   System.out.println("test case failed");
	           }
	           
	          
 }
}
