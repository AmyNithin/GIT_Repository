package testScripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageLibrary.LoginPage;
import testBase.TestBase;

public class TC001 extends TestBase{
	
	LoginPage loginpage;
	
	
	@BeforeClass
	
	public void testSetUp() throws IOException{
	
		init();
		
		loginpage=new LoginPage(wd);
		loginpage.enterEmail(email_value);
		loginpage.enterPassword(password_value);
		
	}
	
	@AfterClass
	
	public void testShutDown(){
		
		closeBrowser();
		
	}
	
	
	
	
	
	
	
	

}
