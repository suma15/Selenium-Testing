

package selectionelements_monsterapplication;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_Currentlocation_industry {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = null;
String url = "https://my.monsterindia.com/sponsered_popup.html";
System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
driver = new ChromeDriver();
driver.get(url);

//Maximize the window
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(10, SECONDS);

WebElement currentlocation =driver.findElement(By.className("border_grey1"));
 List<WebElement>currentlocationelements= currentlocation.findElements(By.tagName("option"));
 
 int currentlocationsize = currentlocationelements.size();
 
 for (int i = 0 ;i<currentlocationsize;i++)
 {
	 String currentlocationname = currentlocationelements.get(i).getText();
	 System.out.println(i+"-"+currentlocationname);
	
	 
 
 }
 
 Select selection = new Select(currentlocation);
 selection.selectByIndex(1);
// selection.selectByValue("3");
 //selection.selectByVisibleText("Delhi");
 //currentlocation.sendKeys("Chennai");
WebElement industry =driver.findElement(By.id("id_industry"));
Select selection1 =  new Select(industry);
selection1.selectByIndex(1);
selection1.selectByValue("4");
selection1.selectByVisibleText("Banking/Financial Services");

selection1.deselectByVisibleText("Automotive/Ancillaries");
selection1.deselectByIndex(1);
selection1.deselectByValue("4");
selection1.deselectAll();
selection.deselectByIndex(1);

 //driver.quit();
	}

}
