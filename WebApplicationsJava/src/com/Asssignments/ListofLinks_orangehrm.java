package com.Asssignments;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListofLinks_orangehrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = null;
//String url = "http://www.newtours.demoaut.com/";
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

String Expected_Welocmepage ="Welcome Admin";
System.out.println("The Expected text :"+Expected_Welocmepage);

WebElement Welcomepage_Element = driver.findElement(By.id("welcome"));
String Actual_Welcomepage_Element = Welcomepage_Element.getText();
System.out.println("The Actual Text:"+Actual_Welcomepage_Element);

if(Actual_Welcomepage_Element.equals(Expected_Welocmepage))
{
	System.out.println("Successfull Weclome Admin page -Pass");
	
}

else
{
	
	System.out.println("Failed page-Fail");
}


List<WebElement>homepage_links = driver.findElements(By.tagName("a"));
int homepage_linkscount = homepage_links.size();
System.out.println("The total number of links on the newtours login page are:"+homepage_linkscount);
for (int i=0;i<homepage_linkscount;i++)
{
	
	if(homepage_links.get(i).isDisplayed())
	{
String homepage_linkname = homepage_links.get(i).getText();
System.out.println(i + " "+ homepage_linkname);

	}
	}
driver.quit();
}




}

