package title;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaputringTitle_ValidatingTitle_Identifyingurl_validatingurl_FacebookHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url = "http://facebook.com";
		driver.get(url);
		String Expected_FacebookHomePageTitle = "Facebook – log in or sign up";
		System.out.println("The Expected Facebook Homepage Title is:" +Expected_FacebookHomePageTitle);
		String Actual_FacebookHomePageTitle= driver.getTitle();
		System.out.println("The Title of Facebook Home Page is:" +Actual_FacebookHomePageTitle);
		//Validating the title of Facebook homePage
		
		if(Actual_FacebookHomePageTitle.equals(Expected_FacebookHomePageTitle))
				{
		WebElement email =	driver.findElementById("email");
		WebElement pass =	driver.findElementById("pass");
		WebElement login = driver.findElementById("loginbutton");
		email.sendKeys("sumalatha15");
		pass.sendKeys("namish");
		login.click();
			
			System.out.println("TiTle matched-Pass");
		}
		else
		{
			System.out.println("Title Not matched-Fail ");
		}
		
		//Capturing the url of the facebook /homepage
		
		String  Actual_FacebookHomePageurl = driver.getCurrentUrl();
        System.out.println("The Actual url of facebookhomepage is:"+Actual_FacebookHomePageurl);
        String Expected_FacebookHomePageUrl = "facebook.com";
        if(Actual_FacebookHomePageurl.contains(Expected_FacebookHomePageUrl))
        {
        	System.out.println("url matched-Pass");
        }
   
        else
        {
        	System.out.println("url matche-Fail");
        }
		// driver.quit();
	}

	
}
