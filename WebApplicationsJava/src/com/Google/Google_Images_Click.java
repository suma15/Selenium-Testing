package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Images_Click {

	public static void main(String[] args) {
		String url = "http://Google.com";
         WebDriver driver =  null;
	        System.setProperty("webdriver.chrome.driver",".\\DriverFiles\\chromedriver.exe");
	     driver = new ChromeDriver();
	     
	     driver.get(url);
	     
	     
	     //WebElement images = driver.findElement(By.className("gb_e"));
	     //images.click();
	     
	     
	     //WebElement images1 = driver.findElement(By.linkText("Images"));
	     WebElement Gmail = driver.findElement(By.partialLinkText("Gma"));
	     
	     
	   //images1.click();
	   Gmail.click();
	   System.out.println("The Title of Google images Webpage is:" +driver.getTitle());
	   
	  // driver.quit();
	   
	   
	  
	}

}
