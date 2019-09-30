package ohrmApplicationKyewordanddatadriven;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Basetest {
	
	String Username = "admin";
    String Password ="Admin123";
    
    WebDriver driver = null;
    String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
   @BeforeTest
   public void setup() throws FileNotFoundException, IOException, InterruptedException
   {
	   
	  System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

	 
   }
   
	  @AfterTest
	   public void Teardown()
	   {
		  //driver.quit();
	   }
   
}
