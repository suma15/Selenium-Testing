package com.newtourstest;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;
import com.NewToursWebpages.Loginpages;

public class	LoginpageTest extends  BaseTest{
	   Loginpages loginpage = null;
	
		@Test(priority = 1)
	public void signontest()
	{
		
	    loginpage = PageFactory.initElements(driver, Loginpages.class);//initElements(driver, loginpage.class);
		loginpage.signon();
		
	}
	
		
		@Test(priority =2)
	public void yourdestination() {
		
			loginpage = PageFactory.initElements(driver, Loginpages.class);
		
			loginpage.yourdestion();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		
	}
@Test(priority = 3)


public void LoinTest() throws IOException
{
	loginpage = PageFactory.initElements(driver, Loginpages.class);
	//loginpage.login("tutorial","tutorial");
	
	
	FileInputStream File = new FileInputStream("./POM/POM_newtours_testdata.xlsx");
	@SuppressWarnings("resource")
	XSSFWorkbook  workbook= new  XSSFWorkbook(File);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	int rowcount = sheet.getLastRowNum();
	
	for (int i=1;i<=rowcount;i++)
	{
		
		Row row = sheet.getRow(i);
		
	loginpage.login(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
	
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
	File newtours_screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(newtours_screenshot, new File("./screenshots/NewTours/" +i+".png"));
	}
	
	FileOutputStream file1 = new FileOutputStream("./POM/POM_newtoursResult.xlsx");
	workbook.write(file1);
	driver.navigate().back();
	}
	}
	
	
}

