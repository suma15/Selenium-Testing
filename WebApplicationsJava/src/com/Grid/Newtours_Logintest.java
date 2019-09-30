package com.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Newtours_Logintest {
	
	
	@Parameters("Browser")
	
	@Test
	
	public void logintest(String browser) throws MalformedURLException
	{
		System.out.println("The browser name is :"+browser);
		
		DesiredCapabilities cap = null;
		if(browser.equalsIgnoreCase("chrome"))
		{
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
					
		}
		
		else
		{
			if(browser.equalsIgnoreCase("firefox"))
			{
				
				cap = DesiredCapabilities.firefox();
				cap.setBrowserName("firefox");
				cap.setPlatform(Platform.WINDOWS);
			}
		}
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.105:4444/wd/hub"), cap);
			
		
		
		
	}
}