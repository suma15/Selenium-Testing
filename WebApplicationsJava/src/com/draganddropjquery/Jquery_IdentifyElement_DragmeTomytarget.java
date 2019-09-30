package com.draganddropjquery;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Jquery_IdentifyElement_DragmeTomytarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		
		String url = "https://jqueryui.com/droppable/";
		System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement dragelement=driver.findElement(By.id("draggable"));
		
		String dragElementText = dragelement.getText();
		
		System.out.print("The Text of an element in the frame is: "+ dragElementText);
		
		WebElement dropElement = driver.findElement(By.id("droppable")); 
	
		String dropelementText = dropElement.getText();
		System.out.println();
		System.out.println("The Text of an  element in the frame is:"+ dropelementText);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(dragelement, dropElement).perform();
		
		
		driver.switchTo().defaultContent();
		WebElement resize = driver.findElement(By.linkText("Resizable"));
		
		resize.click();
		
		
	}

}
