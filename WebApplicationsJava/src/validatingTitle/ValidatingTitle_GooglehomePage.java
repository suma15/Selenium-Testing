package validatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle_GooglehomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".\\DriverFiles\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("http://google.com");
		String expected_googlehomepagetitle ="Google";
		
		System.out.println("The expected Title of GoogleHomePage:" +expected_googlehomepagetitle);
		String Actual_Googlehomepagetitle = c.getTitle();
	
		if(Actual_Googlehomepagetitle.equals(expected_googlehomepagetitle))
{
	System.out.println("Title is matched-PASS");
}
else {
	
	System.out.println("Title is matched-Fail");
	
}
	c.close();
	
	
	}

}