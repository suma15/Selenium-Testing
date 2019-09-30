package com.keyboardoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardoperations_facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = null;
      String url = "https://www.facebook.com/";
      
      System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(url);
      
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      
      driver.findElement(By.id("email")).sendKeys("Sumalatha15@gmail.com");;
      
      Actions act = new Actions(driver);
      
      act.sendKeys(Keys.TAB).perform();
      act.sendKeys("hello").perform();
      act.sendKeys(Keys.ENTER).perform();
      driver.quit();
	}

}
