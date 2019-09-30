package com.Asssignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteoperationConsoledata_ofnewtourscountry_dropdown_ToExcel {

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
	 FileInputStream file = new FileInputStream("C:\\Users\\LiveTech\\Desktop\\Testing\\WebApplicationsJava\\src\\com\\Asssignments\\writedata_newtourscounty.xlsx");
	 XSSFWorkbook workbook =new XSSFWorkbook(file);
     XSSFSheet sheet = workbook.getSheet("Sheet1");

	 for(int a=0;a<coutrycount;a++)
	{
		 String countryelementname =countryelements.get(a).getText();
		 System.out.println(a+"-"+countryelementname);
		 Row row=sheet.createRow(a);
		 row.createCell(2).setCellValue(countryelementname);
	     a++;
FileOutputStream File1 = new FileOutputStream("C:\\Users\\LiveTech\\Desktop\\Testing\\WebApplicationsJava\\src\\com\\Asssignments\\writedata_newtourscounty.xlsx");
workbook.write(File1);
	}

	
	}
	}

	





