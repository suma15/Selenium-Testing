package com.facebookbasedonXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatlogin_Functionality_facebook_Xpath {

	public static void main(String[] args) 
	{
		

		 WebDriver driver = null;
		
		//<input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">
		String url = "https://www.facebook.com/";
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		   
		System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
   driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("suma@gmail.com");
 //*[@id="pass"]
  // <input type="password" class="inputtext login_form_input_box" name="pass" id="pass" data-testid="royal_pass">
	
   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("suma");
   
 
	}
	}

