package com.Asssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtour_Login_navigateto_FindFlightpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = null;
		String url = "http://www.newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver", ".\\Driverfiles\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(url);
	    
	  WebElement  Expected_username =  driver.findElement(By.name("userName"));
	  Expected_username .sendKeys("tutorial");
	  WebElement Expected_password = driver.findElement(By.name("password"));
	  Expected_password.sendKeys("tutorial");
	  WebElement Signin = driver.findElement(By.name("login"));
	  Signin.click();
	  String actual_WebpageTile = driver.getTitle();
	  System.out.println("actual_Webpage title is :"+ actual_WebpageTile);
	  String Expected_webpageTitle = "Find";
	  
	  if(actual_WebpageTile.contains(Expected_webpageTitle))
	  {
		  System.out.println("Login Successfull-pass");
	  }
	  else
	  {
		  System.out.println("Login failed-Fail");
	  }
	  
	  driver.quit();
	  
	}

}
