package com.alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_Checkavailabilty_Click_handlingalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	WebDriver  driver = null;
	String url = "https://www.tsrtconline.in/oprs-web/guest/home.do?h=1";
	
	System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	WebElement checkavailabilitysearchbutton = driver.findElement(By.id("searchBtn"));
	checkavailabilitysearchbutton.click();
	
	
	
	Alert alt = driver.switchTo().alert();
	
	String alertmessage = alt.getText();
	System.out.println("The alert window Text is:"+alertmessage);
	
	Thread.sleep(2000);
	alt.accept();
    driver.quit();
	
	}
	
	

}
