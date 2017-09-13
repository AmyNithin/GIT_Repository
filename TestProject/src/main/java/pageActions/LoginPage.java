package pageActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testBase.TestBase;

public class LoginPage extends TestBase {
	
	WebDriver wd;
	static Logger log=Logger.getLogger(LoginPage.class.getName());
	
	
   
   public By Email=By.id("email");
   public By Password=By.id("pass");
   public By loginButton=By.xpath(".//*[@id='u_0_2']");
   
   
   
   
  
   public LoginPage(WebDriver wd) {
		this.wd=wd;
	}
   
   
/*
 * This method will enter email field in Login page
 */



public void enterEmail(String email_value) throws InterruptedException{

	log.info("Entering data in email field");
	
	wd.findElement(Email).clear();
	
	wd.findElement(Email).sendKeys(email_value);
	
}

/*
 * This method will enter password in LoginPage
 * 
 */
public void enterPassword(String password_value){

	log.info("Entering data in password field");
	
	wd.findElement(Password).clear();
	wd.findElement(Password).sendKeys(password_value);;
	
}
public void clickLogin(){

	log.info("clicking  loginButton");
	
	wd.findElement(loginButton).click();
	
}




}