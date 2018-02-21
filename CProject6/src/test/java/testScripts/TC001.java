package testScripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testActions.HomePage;
import testActions.SigninPage;
import testBase.TestBase;

public class TC001 extends TestBase {

	
	HomePage homepage;
	SigninPage signinpage;
	
	
	@BeforeMethod
	
	public void testSetUp() throws IOException{
		
	init();	
		
	homepage=new HomePage(wd);
	signinpage=new SigninPage(wd);
		
		
		
		
	}
	
	
	@Test(priority=1,enabled=false,description="tests in homepage")
	
	public void HomePagetest() throws IOException{
	
		
	waitForElement(homepage.siginButton,30);
	homepage.verifyHomePageLabel();
	ImageComparison();
	homepage.linkCountHomePage();
	homepage.clickSignin();	
		}

	@Test(priority=2,enabled=true,description="tests in signinpage")
	
	public void ValidSigninPagetest1() throws IOException{
	
		HomePagetest();
		Zoom();
		signinpage.enterEmailAddress(EmailAddress);
		signinpage.clickCreateAccount();
		
	
		}
	
@Test(priority=2,enabled=false,description="Login with valid email-random characters")
	
	public void ValidSigninPagetest2() throws IOException{
	
		HomePagetest();
		signinpage.enterEmailAddress(randomCharacters()+"@gmail.com");
		signinpage.clickCreateAccount();
		
	
		}
	
@Test(priority=2,enabled=false,description="Login with invalid email-random characters")

public void InValidSigninPagetest1() throws IOException, InterruptedException{

	HomePagetest();
	signinpage.enterEmailAddress(randomCharacters());
	signinpage.clickCreateAccount();
	waitFor(2);
	signinpage.verifyErrormsgInvalidemail();
	//ScrollToPixelUp();
	ScrollToElement(signinpage.invalidemailerrormsg);
	takeScreenshot();
	

	}

@Test(priority=2,enabled=false,description="Login with invalid email-random integers")

public void InValidSigninPagetest2() throws IOException{

	HomePagetest();
	signinpage.enterEmailAddress(randomIntegers());
	signinpage.clickCreateAccount();
	

	}	
	
@Test(priority=2,enabled=false,description="Login with invalid email-special caharcters")

public void InValidSigninPagetest3() throws IOException{

	HomePagetest();
	signinpage.enterEmailAddress(randomSpslCharacters());
	signinpage.clickCreateAccount();
	

	}	
	
	
	@AfterClass
	public void testShutDown(){
		
	}	
	
}
