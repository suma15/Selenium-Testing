package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public WebDriver driver = null;
	public String url = "http://newtours.demoaut.com/";
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(url);
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	@AfterMethod
	public void Teardown()
	{
		driver.quit();
	}
	
}
