package com.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ohrm_Loginpage_Loginpanel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = null;
String url = "https://namish-trials653.orangehrmlive.com/auth/login";
System.setProperty("webdriver.chrome.driver",".\\DriverFiles\\chromedriver.exe");
driver = new ChromeDriver();
driver.get(url);
WebElement Loginpage_element = driver.findElement(By.id("logInPanelHeading"));
String LogInPage_ElementText = Loginpage_element.getText();

System.out.println("The text of an element of the Login webpage is :" + LogInPage_ElementText );
//driver.quit();

driver.findElement(By.name("txtUsername")).sendKeys("Admin");
WebElement password = driver.findElement(By.id("txtPassword"));
password.sendKeys("puppy123");
WebElement login = driver.findElement(By.className("button"));
login.click();

//driver.navigate().to("https://namish-trials653.orangehrmlive.com/client/#/dashboard");;
WebElement  user = driver.findElement(By.id("user-dropdown"));
System.out.println("The Account name is " + user );
user.click();

Thread.sleep(10000);
driver.findElement(By.linkText("Logout")).click();
driver.quit();

	}

}
