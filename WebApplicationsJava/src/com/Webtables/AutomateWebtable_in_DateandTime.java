package com.Webtables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWebtable_in_DateandTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		
		String url ="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
	WebElement Webtable = 	driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
	
	List<WebElement> Rows = Webtable.findElements(By.tagName("tr"));// going to the web table and identifying the number of rows  using tr tag
	
	for (int i =1;i<Rows.size();i++)
	{
		List<WebElement> cols =Rows.get(i).findElements(By.tagName("td"));//of every row-identify the number of columns
		
		for (int j =0;j<cols.size();j++)//go to every row of all the columns
		{
			String data = cols.get(j).getText();//getting the text of respective row of all columns
			
			System.out.print(data +" ");
		}
		System.out.println();
	}
	
	}

}
