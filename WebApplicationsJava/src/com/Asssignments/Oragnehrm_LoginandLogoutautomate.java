package com.Asssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oragnehrm_LoginandLogoutautomate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String url = "https://opensource-demo.orangehrmlive.com/";
		System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		WebElement Login = driver.findElement(By.className("button"));
		Login.click();
		
		String Expected_Homepagetitle = "OrangeHRM";
		System.out.println("The Expected Title  after successful Login:"+Expected_Homepagetitle);
		
		String Actual_HomepageTitle = driver.getTitle();
		System.out.println("The Actual Title is :"+Actual_HomepageTitle);
		
		if(Actual_HomepageTitle.equals(Expected_Homepagetitle))
		
		{
			System.out.println("LoginSuccessfull -pass");
		}
		else
		{
			
			System.out.println("Login Failed-Fail");
		}
		
		WebElement Welcome = driver.findElement(By.id("welcome"));
		Welcome.click();
		Thread.sleep(5000);
		WebElement logout = driver.findElement(By.linkText("Logout"));
		logout.click();
		driver.quit();
		
		
	}

	

}
