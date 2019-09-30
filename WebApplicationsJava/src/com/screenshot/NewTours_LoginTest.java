package com.screenshot;

import java.io.File;
import java.io.FileInputStream;
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

public class NewTours_LoginTest {
	
	WebDriver driver = null;
	String url ="http://newtours.demoaut.com/";
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void logIn() throws IOException
	{
		
	FileInputStream file = new FileInputStream("C:\\Users\\LiveTech\\Desktop\\Testing\\WebApplicationsJava\\src\\com\\screenshot\\mutiplescreeshot.xlsx");
	@SuppressWarnings("resource")
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	XSSFSheet sheet = workBook.getSheet("Sheet1");
	int rowCount=sheet.getLastRowNum(); // identifying the number of active Rows 
	for(int i=1;i<=rowCount;i++)
	{

	Row row=sheet.getRow(i);

	WebElement userName=driver.findElement(By.name("userName"));
	userName.sendKeys(row.getCell(0).getStringCellValue());

	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys(row.getCell(1).getStringCellValue());

	WebElement signIn=driver.findElement(By.name("login"));
	signIn.click();


	String expected_Title="Find";
	System.out.println(" The Expected title of the NewTours HomePage is : "+expected_Title);

	String actual_WebPageTitle=driver.getTitle();
	System.out.println(" The Actual title of the Webpage is : "+actual_WebPageTitle);

	if(actual_WebPageTitle.contains(expected_Title))
	{
	System.out.println(" LogIn Successfull - PASS");
	row.createCell(2).setCellValue("LogIn Successfull - PASS");
	}
	else
	{
	System.out.println(" LogIn failed - FAIL");
	row.createCell(2).setCellValue(" LogIn failed - FAIL");

	FileOutputStream file1 = new FileOutputStream("C:\\Users\\LiveTech\\Desktop\\Testing\\WebApplicationsJava\\src\\com\\screenshot\\mutiplescreeshot.xlsx");
	workBook.write(file1);
	File bing_screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(bing_screenshot, new File("./screenshots/" +i+".png"));

	driver.navigate().back();
	
	}
	}
	}
	

	@AfterTest
	public void tearDown()
	{
	//driver.quit();
	}
	
}	
	

