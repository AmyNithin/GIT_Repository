package testScripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageActions.LoginPage;
import testBase.TestBase;

public class TC001 extends TestBase{

	LoginPage login;
	
	
	@BeforeClass
	
	public void setup() throws IOException{
		
		init();
		login=new LoginPage(wd);
	}
	
	@Test
	
	public void loginTest() throws InterruptedException{
		
	
	
		
		login.enterEmail(email_value);
		
		login.enterPassword(password_value);
		login.clickLogin();
		
		 
	}
	
	
	
	
	@AfterClass
	
   public void shutDown(){
		
	closeBrowser();
	}
	
}



























