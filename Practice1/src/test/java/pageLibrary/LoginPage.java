package pageLibrary;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import testBase.TestBase;

public class LoginPage extends TestBase {

	WebDriver wd;
	
	static Logger log=Logger.getLogger(LoginPage.class.getName());
	
	By Email=By.id("email");
	By Password=By.id("pass");
	
	
	
	
	
	
	
	
	
	
	/*
	 * constructor to create an instance of WebDriver
	 */
	public LoginPage(WebDriver wd){
		
		this.wd=wd;
	}
	
	/*
	 * This method will enter email to email field in LoginPage
	 */
	public void enterEmail(String email_value){
		
	log.info("clearing email field");	
	wd.findElement(Email).clear();	
	
	log.info("enetring email");
	wd.findElement(Email).sendKeys(email_value);
	
	
	}
	
	/*
	 * This method will enter password to password field in LoginPage
	 */
	
	public void enterPassword(String password_value){
		
		log.info("clearing password field");
		wd.findElement(Password).clear();
		
		log.info("entering password");
		wd.findElement(Password).sendKeys(password_value);
		
	}
	
	
	
	
	
	
	
	
	
}
