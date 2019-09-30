package com.Webtables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturing_firstColumndata {
	public static void main(String[] args)
	{
		
		WebDriver driver = null;
		String  url = "https://www.timeanddate.com/worldclock/";
		
		System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		//html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
		//html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
      //html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		//String cityname = driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]")).getText();
		String Part1 =("html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[");
		
		
		String part2 = ("]/td[");
		String part3 =("]");
		
		//System.out.println("The city name is :"+cityname);
		for (int i =1;i<=36;i++)
		{
			
			
		for (int j =1 ;j<8;j++)
		{
				String citynames =driver.findElement(By.xpath(Part1+i+part2+j+part3)).getText();
			  System.out.print(citynames);
			
		}
		
		System.out.println();
	}

	}
}
