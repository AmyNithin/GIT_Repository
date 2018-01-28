package testActions;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import testBase.TestBase;

public class LoginPage extends TestBase {

	public By Enter=By.xpath("html/body/form/input[3]");
	public By PasswordField=By.xpath(".//*[@id='secret']");

	public static Logger log = Logger.getLogger(LoginPage.class.getName());

	public LoginPage(WebDriver wd) {

		this.wd = wd;

	}

	public void enterPassword(String pwd) {

		log.info("entering password");
		wd.findElement(PasswordField).sendKeys(pwd);

	}
	
	public void clickEnter(){
		
		log.info("clicking on signin button");
		
		wd.findElement(Enter).click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
