package Webbrowserautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Bowserautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
WebDriver c = new ChromeDriver();
c.get("http://demo.guru99.com");
c.navigate().to("http://youtube.com");
		
System.setProperty("webdriver.gecko.driver",".\\DriverFiles\\geckodriver.exe");
FirefoxDriver f =  new FirefoxDriver();
f.get("http://gmail.com");

		
/*System.setProperty("webdriver.ie.driver",".\\DriverFiles\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://facebook.com");*/
	}

}
