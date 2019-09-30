package com.Asssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_headerlinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		String url = "https://www.tsrtc.telangana.gov.in/";
		System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		WebElement industries = driver.findElement(By.className("rtcNavigation"));
		List<WebElement> links = industries.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++)
		{
			if(links.get(i).isDisplayed())
			{
		    System.out.println(links.get(i).getText());
		}
		}
	
	
	}
}
