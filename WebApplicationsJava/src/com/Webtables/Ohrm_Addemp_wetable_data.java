package com.Webtables;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ohrm_Addemp_wetable_data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver = null;
		
		String username ="Admin";
		String password ="admin123";
		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
		
		String Expected_loginpagetitle = "OrangeHRM";
		System.out.println("The Expected loginpage title is :"+Expected_loginpagetitle);
		
		String Actual_loginpagetitle = driver.getTitle();
				
		System.out.println("The Actual title of orangehrm:"+Actual_loginpagetitle);
		
		//Validating the title of loginpage 
		if(Actual_loginpagetitle.equals(Expected_loginpagetitle))
				{
			
			System.out.println("The title of loginpage is success-Pass");
			
				}
		
		else
		{
			System.out.println("The title of loginpage is notmatched-Fail");
		}
		
		
	//validating the login page whether we have landed in the same page  or not 
		String Expected_Loginpanelheading= "LOGIN Panel";
		System.out.println("The expectedheading login page is :"+Expected_Loginpanelheading);
		
		//properties of loginpanel is <div id="logInPanelHeading">LOGIN Panel</div>
		WebElement loginpageheading_Element =driver.findElement(By.id("logInPanelHeading"));
		String Actutal_loginpanelheading =  loginpageheading_Element.getText();
		System.out.println("The Actualheading of login page is :"+ Actutal_loginpanelheading);
		
		
		if(Actutal_loginpanelheading.equals(Expected_Loginpanelheading))
		{
			System.out.println("The Successful launch of OrangeHRM loginpage-PASS");
			
		}
		else
		{
			System.out.println("Failed to lauche the orangeHRM loginpage-FAIL");
		}
		
		WebElement Username =driver.findElement(By.id("txtUsername"));
		Username.sendKeys(username);
	
	    WebElement	Password = driver.findElement(By.id("txtPassword"));
	    Password.sendKeys( password);
	    
	    WebElement Loginbutton = driver.findElement(By.id("btnLogin" ));
	    Loginbutton.click();
	    
	    String ExPected_Homepagetext = "Welcome";
	    
	    System.out.println("The ExpectedhomepageText is:"+ExPected_Homepagetext);
	    
	      WebElement homepagetext_Element =driver.findElement(By.id("welcome"));
	     String Actual_Homepagetext=  homepagetext_Element.getText();

	     System.out.println("The Actualhomepagetext is :"+Actual_Homepagetext);
	     
	     if(Actual_Homepagetext.contains(ExPected_Homepagetext))
	     {
	    	 System.out.println("The login Success-PASS");
	     }
	     
	     else
	     {
	    	 System.out.println("The login Failed-FAIL");
	     }
	     //Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: element not interactable
	     WebElement PIM_element= driver.findElement(By.id("menu_pim_viewPimModule"));
		   WebElement PIM_Employeelist_Element   =driver.findElement(By.id("menu_pim_viewEmployeeList"));
		   
		   Actions act = new Actions(driver);
		   act.moveToElement(PIM_element).perform();
		   PIM_Employeelist_Element.click();
		   
		 
		   
		   WebElement Webtable = 	driver.findElement(By.xpath("//*[@id=\"resultTable\"]"));
			
			List<WebElement> Rows = Webtable.findElements(By.tagName("tr"));// going to the web table and identifying the number of rows  using tr tag
			
			for (int i =1;i<Rows.size();i++)
			{
				List<WebElement> cols =Rows.get(i).findElements(By.tagName("td"));//of every row-identify the number of columns
			
				for (int j =1;j<cols.size();j++)//go to every row of all the columns
				{
					String data = cols.get(j).getText();//getting the text of respective row of all columns
					
					System.out.print(data + "  ");
					
				}
				System.out.println("  ");
			}
			
	}

}
