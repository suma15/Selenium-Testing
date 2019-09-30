package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OHRM_Logintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   WebDriver driver = null;

     
     String url = "https://namish-trials653.orangehrmlive.com/auth/login";

     System.setProperty("webdriver.chrome.driver",".\\DriverFiles\\chromedriver.exe");
     driver = new ChromeDriver();
  
     
   //  System.setProperty("webdriver.gecko.driver",".\\DriverFiles\\geckodriver.exe");
    // FirefoxDriver driver= new FirefoxDriver();
     driver.get(url);
    //.findElement(By.id("txtUsername")).sendKeys("Admin");
     driver.findElement(By.name("txtUsername")).sendKeys("Admin");
     WebElement password = driver.findElement(By.id("txtPassword"));
     password.sendKeys("puppy123");
     WebElement login = driver.findElement(By.className("button"));
     login.click();
     
     String Expected_homepagetitle ="OrangeHRM";
     System.out.println("The Expected Title after successfull Login is" + Expected_homepagetitle );
     
     String Actual_WebpageTitle =driver.getTitle();
     System.out.println("The Actual Title webpage title is"+ Actual_WebpageTitle);
     
     if(Actual_WebpageTitle.equals(Expected_homepagetitle))
     {
    	 System.out.println("Login is Successfull-Pass");
     }
     
     else
     {
    	 System.out.println("Login Failed-fail");
     }
	}
}