package com.NewToursWebpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpages {
	
	
	//<a href="mercurysignon.php">SIGN-ON</a>
	
@FindBy(linkText = "SIGN-ON")
WebElement signon;
public void signon()
{
	signon.click();
}

//operations and webelements are performed in this class 
//<a href="mercuryunderconst.php">Destinations</a>
//<a href="mercuryunderconst.php">your destination</a>
@FindBy(linkText ="your destination")
WebElement yourdestination;

public void yourdestion()
{
	yourdestination.click();
}

@FindBy (name ="userName")
WebElement username;
//<input type="password" name="password" size="10">
@FindBy(name = "password")
WebElement  password;
//<input type="image" name="login" value="Login" src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">
@FindBy(name="login" )
WebElement login;
public void login(String uname,String pass)
{	username.clear();
	username.sendKeys(uname);
	password.clear();
	password.sendKeys(pass);
	
	login.click();
}
}
