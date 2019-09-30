package com.GetAttributeexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_validate_urladdofregisterelement_innewtoursloginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = null;
		String url = "http://newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement	register_Elem=	driver.findElement(By.linkText("REGISTER"));
        String RegisterElement_Text =register_Elem.getText();
		
        System.out.println("The Register Element text is :"+RegisterElement_Text);
        
        
        //Getting the url address given by the developer for href using get atttribute 
        
        String Expected_url = register_Elem.getAttribute("href");
		System.out.println("The expected url address is :"+Expected_url);	
		register_Elem.click();
		
		
		String actual_webpageurl = driver.getCurrentUrl();
		System.out.println("The webpage url address is:"+actual_webpageurl);
		
		if(actual_webpageurl.equals(Expected_url))
		{
			System.out.println("Successfully navigated to register Webpage -PASS");
		}
		else
		{
			
			System.out.println("its is not successful navigation to register webpage-FAIL");
		}
		
	}
	
	

}
