package com.OhrmApplicationLoginTest_cucumberapproach;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	
	

WebDriver driver = null;
String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";


@Given("^Open chrome browser and naviagte to orangehrm Application$")
public void Open_chrome_browser_and_naviagte_to_orangehrm_Application() throws Throwable {
    // Express the Regexp above with the code you wish you had
  
	System.setProperty("webdriver.chrome.driver", ".\\DriverFiles\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and click on login button$")
public void user_enters_and_and_click_on_login_button(String username, String password) throws Throwable {

  
	//<input name="txtUsername" id="txtUsername" type="text">
	WebElement Username = driver.findElement(By.id("txtUsername"));
	
//	<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	
  WebElement Password  =	driver.findElement(By.id("txtPassword"));
 // <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	WebElement login=driver.findElement(By.name("Submit"));
	
	login.submit();
}

@Then("^user should be able to successfully close the application$")
public void user_should_be_able_to_successfully_close_the_application() throws Throwable {
    // Express the Regexp above with the code you wish you had
  
}



}
