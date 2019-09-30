package automatenewtourslinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.HomeBaseWarning;
import org.seleniumhq.jetty9.servlet.jmx.HolderMBean;

public class Newtours_linkvalidation_inhomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		
		String url = "http://www.newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver", ".\\Driverfiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		WebElement username =driver.findElement(By.name("userName"));
		username.sendKeys("tutorial");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("tutorial");
		
		 WebElement Signin = driver.findElement(By.name("login"));
		  Signin.click();
		  
		  

        List<WebElement>homepage_links = driver.findElements(By.tagName("a"));
		  int linkcount = homepage_links.size();
		  System.out.println("The Total number of links on the newtours loginpage are:"+linkcount);
		  for (int i =0;i<linkcount;i++)
		  {
			  String linkname = homepage_links.get(i).getText();
			  System.out.println(i + " "+linkname);
			  homepage_links.get(i).click();
			  System.out.println(driver.getTitle());
			  System.out.println(driver.getCurrentUrl());
			  System.out.println();
			  driver.navigate().back();
			  homepage_links = driver.findElements(By.tagName("a"));
		  
		 
		  
		
	
	}
	}
}
