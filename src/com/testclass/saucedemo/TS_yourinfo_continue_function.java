package com.testclass.saucedemo;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pomclass.saucedemo.Homepage;
import com.pomclass.saucedemo.Loginpage;
import com.pomclass.saucedemo.Yourcart;
import com.pomclass.saucedemo.Yourinfopage;

public class TS_yourinfo_continue_function extends BasetestClass
{
	@Test
    public void continuefunctionality() 
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
	 
			   String acturl= driver.getCurrentUrl();
			   String expurl= "https://www.saucedemo.com/checkout-step-two.html";
			   
			   if(acturl.equals(expurl))
			   {
				   System.out.println("case passed");
			   }
			   else
			   {
				   System.out.println("case failed");
			   }
			   
			   
    }
}
