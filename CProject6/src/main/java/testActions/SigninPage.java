package testActions;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import testBase.TestBase;

public class SigninPage extends TestBase {

	public By emailField = By.id("email_create");
	public By createAccountButton=By.id("SubmitCreate");
	public By invalidemailerrormsg=By.id("create_account_error");

	public static Logger log = Logger.getLogger(SigninPage.class.getName());

	public SigninPage(WebDriver wd) {

		this.wd = wd;

	}

	public void enterEmailAddress(String email) {

		log.info("entering email address in signinpage");
		wd.findElement(emailField).sendKeys(email);

	}
	
	public void clickCreateAccount(){
		
		log.info("clicking on signin button");
		
		wd.findElement(createAccountButton).click();
		
	}
	
	public void verifyErrormsgInvalidemail(){
		
		
		
	String errormsg=	wd.findElement(invalidemailerrormsg).getText();
		
		
		if(errormsg.contains("Invalid email address.")){
			
			Assert.assertTrue(true, "The error msg is displayed on entering invalid email address");
		}else{
			
			Assert.assertTrue(false, "The error msg is not displayed on entering invalid email address");	
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
