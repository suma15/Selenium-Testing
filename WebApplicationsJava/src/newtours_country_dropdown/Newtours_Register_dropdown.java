package newtours_country_dropdown;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_Register_dropdown {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver = null;  	
	 String url = "http://newtours.demoaut.com/";
	 System.setProperty("webdriver.chrome.driver",".\\DriverFiles\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get(url);
	 WebElement Register =driver.findElement(By.linkText("REGISTER"));
	 Register.click();
	 WebElement country =driver.findElement(By.name("country"));
	 List<WebElement>countryelements  = country.findElements(By.tagName("option"));
	 System.out.println("The total number of countries are:"+countryelements.size());
	 int coutrycount = countryelements.size();
	 
	 for(int a =0;a<coutrycount;a++)
	{
		 String countryelementname =countryelements.get(a).getText();
		 System.out.println(a+"-"+countryelementname);
		
	}	
		 
	 
	 
	 driver.close();
	 
	

	}

}

	
