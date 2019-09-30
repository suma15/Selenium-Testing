package ohrmApplicationKyewordanddatadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logintestofohrm  extends Basetest{
	
	@Test
	public void LoginOhrm() throws IOException, InterruptedException
	{
	FileInputStream file = new FileInputStream("C:\\Users\\LiveTech\\Desktop\\Testing\\WebApplicationsJava\\propertiesFiles\\OHRM.properties");
	Properties p1 = new Properties();//creating an object for properties class
	p1.load(file);
	
	//Excel file operation to get the test data 
	
	// Validation to check we landed up at LogIn Page or Not
	
	
 FileInputStream file1 = new FileInputStream("C:\\Users\\LiveTech\\Desktop\\Testing\\WebApplicationsJava\\src\\ohrmApplicationKyewordanddatadriven\\OHRM_LogintestData.xlsx");
 @SuppressWarnings("resource")
 XSSFWorkbook workbook = new XSSFWorkbook(file1);
 XSSFSheet sheet = workbook.getSheet("Sheet1");
 Row row = sheet.getRow(1);

 driver.findElement(By.id(p1.getProperty("username"))).sendKeys(row.getCell(0).getStringCellValue());
 driver.findElement(By.id(p1.getProperty("Password"))).sendKeys(row.getCell(1).getStringCellValue());
 driver.findElement(By.id(p1.getProperty("login"))).click();
    
 
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
	}

}

