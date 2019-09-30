package com.BasicJava;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
		WebDriver c = new ChromeDriver();
		c.get("http://demo.guru99.com");
		
/*System.setProperty("webdriver.gecko.driver",".\\DriverFiles\\geckodriver.exe");
FirefoxDriver f =  new FirefoxDriver();
f.get("http://gmail.com");*/

	}

}
