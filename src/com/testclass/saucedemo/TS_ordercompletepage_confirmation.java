package com.testclass.saucedemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pomclass.saucedemo.Homepage;
import com.pomclass.saucedemo.Loginpage;
import com.pomclass.saucedemo.Ordercompletepage;
import com.pomclass.saucedemo.Overviewpage;
import com.pomclass.saucedemo.Yourcart;
import com.pomclass.saucedemo.Yourinfopage;

public class TS_ordercompletepage_confirmation extends BasetestClass
{
   @Test
   public void ordercomplete_scenario()
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
  			   System.out.println("moved to your cart");
  			   //now check checkout function:-
  			   
  			   Yourcart x = new Yourcart(driver);
  			   x.checkout();
  			   System.out.println("clicked on checkout");
  			   System.out.println("move to your info page");
  	 
  	 
  			   Yourinfopage x1 = new Yourinfopage(driver);
  			   
  			   x1.firstname();
  			   System.out.println("Fn entered");
  			   
  			   x1.lastname();
  			   System.out.println("Ln entered");
  			   
  			   x1.zipcode();
  	           System.out.println("zip code entered");
  			   
  			   x1.continuebutton();
  			   System.out.println("clicked on continue button");
  			   System.out.println("moved to Overview page");
		 
		 
  			 Overviewpage page = new Overviewpage(driver);
  			 page.finish();
 			 System.out.println("order placed");
 			 
 			 //scenario to verify
 			 
 			Ordercompletepage text= new Ordercompletepage(driver);
 			
 			String acttext= text.verifytext();
 			String exptext="THANK YOU FOR YOUR ORDER";
 			
 			System.out.println(acttext);
 			 
 			if(acttext.equals(exptext))
 			{
 				System.out.println("case passed");
 			}
 			else
 			{
 				System.out.println("case failed");
 			}
	   
	   
	   
   }
	
	
	
}
