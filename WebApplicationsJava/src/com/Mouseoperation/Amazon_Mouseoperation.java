package com.Mouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Mouseoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		WebDriver driver = null;
		
	
		String url = "https://www.amazon.in/";
		System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
WebElement hellosignin = driver.findElement(By.id("nav-link-accountList"));
Actions act = new Actions(driver);
act.moveToElement(hellosignin).perform();



WebElement yourwishlist = driver.findElement(By.linkText("Your Wish List"));
yourwishlist.click();
		
		
	}

}
