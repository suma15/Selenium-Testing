package com.GetAttributeexample;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

public class Bing_screenshot {

	//Automate all the links  and capture all screenshots  in newtours website 


	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
		
	    String url = "http://newtours.demoaut.com/";
	    System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linkscount = links.size();
		System.out.println("The toal number of links in newtours appilication are:"+linkscount);
		for (int i = 0; i < linkscount; i++)
		{
			String Linknames = links.get(i).getText();
			System.out.println(i+" "+Linknames);
			links.get(i).click();
			Thread.sleep(5000);
			File bing_screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(bing_screenshot, new File("./screenshots/NewTours/" +Linknames+".png"));
			System.out.println(driver.getTitle());
		//	System.out.println(driver.getCurrentUrl());
			System.out.println();
			driver.navigate().back();
		  links = driver.findElements(By.tagName("a"));
			
	}

	
	}
}
