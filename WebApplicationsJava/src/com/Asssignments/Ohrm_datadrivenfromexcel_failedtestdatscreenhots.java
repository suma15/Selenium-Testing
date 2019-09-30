package com.Asssignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ohrmApplicationKyewordanddatadriven.Basetest;

public class Ohrm_datadrivenfromexcel_failedtestdatscreenhots{
	
	   WebDriver driver = null;
	    String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	   @BeforeTest
	   public void setup()
	   {
		   
		  System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		 
	   }

	@Test
	public void Test() throws IOException, InterruptedException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\LiveTech\\Desktop\\Testing\\WebApplicationsJava\\src\\com\\Asssignments\\OHRM_LogintestData.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook(file);

		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum();
		
	
		// Validation to check we landed up at LogIn Page or Not

		String expected_LogInText="LOGIN Panel";
		System.out.println(" The expected text after navigated to LogIn Page is : "+expected_LogInText);
		// Identifying the Properties of "LOGIN Panel" Element 
		// <div id="logInPanelHeading">LOGIN Panel</div>

		WebElement logInPage_Element=driver.findElement(By.id("logInPanelHeading"));
		String actual_logInPageElementText=logInPage_Element.getText();

		System.out.println(" The Text of an Element of the LogIn Webpage is : "+
		actual_logInPageElementText);

		if(actual_logInPageElementText.equals(expected_LogInText))
		{
		System.out.println(" Successfully launched OrangeHRM LogIn page - PASS");
		}
		else
		{
		System.out.println(" Failed to Navigate to OrangeHRM LogIn Page - FAIL");
		}
		for(int i=1;i<=rowCount;i++)
		{
		Row row=sheet.getRow(i);
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys(row.getCell(0).getStringCellValue());

		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(row.getCell(1).getStringCellValue());

		WebElement logInButton=driver.findElement(By.id("btnLogin"));
		logInButton.click();
		}
		/*String expected_HomePageText="Welcome";
		System.out.println(" The expected HomePage Text is : "+expected_HomePageText);

		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		WebElement homePage_WelcomeElement=driver.findElement(By.id("welcome"));
		String actual_HomePageElementText=homePage_WelcomeElement.getText();

		System.out.println(" THe actual HomePage text is : "+actual_HomePageElementText);

		if(actual_HomePageElementText.contains(expected_HomePageText))
		{
		System.out.println(" LogIn Successfull - PASS");
		}
		else
		{
		System.out.println(" LogIN Failed - FAIL ");
		}

		homePage_WelcomeElement.click();

		// Synchronization 
		Thread.sleep(10000); // Explicit Wait

		// automating LogOut Element
		// <a href="/orangehrm-4.0/symfony/web/index.php/auth/logout">Logout</a>

		WebElement logOut=driver.findElement(By.linkText("Logout"));
		logOut.click();
		   
		}
	  @AfterTest

	public void Teardown()
	   {
		 // driver.quit();
	   }*/
}
}
