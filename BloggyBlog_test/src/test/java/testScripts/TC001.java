package testScripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testActions.CommentsPage;
import testActions.HomePage;
import testActions.LoginPage;
import testActions.NewpostPage;
import testBase.TestBase;

public class TC001 extends TestBase {

	HomePage homepage;
	LoginPage signinpage;
	NewpostPage newpostpage;
	CommentsPage commentspage;

	@BeforeMethod

	public void testSetUp() throws IOException {

		init();
		homepage = new HomePage(wd);
		signinpage = new LoginPage(wd);
		newpostpage=new NewpostPage(wd);
		commentspage=new CommentsPage(wd);

	}
	/*
	 * Change enabled=false to enabled =true to run independent tests
	 * In or.properties file change browser to run on different browsers(Compatibility Testing) 
	 * 
	 */

	@Test(priority = 1, enabled = true, description = "Image Comparison in Home Page")

	public void HomePagetest1() throws IOException {
		/*
		 * First run this test changing enabled= true. Refresh project. Rename
		 * inputimage.jpg to outputimage.jpg every time you run this test to
		 * compare the home pages
		 * 
		 */
		ImageComparison();

	}

	@Test(priority = 1, enabled = false, description = "Total link Count in Home Page")

	public void HomePagetest2() throws IOException {

		homepage.linkCountHomePage();

	}

	@Test(priority = 2, enabled = false, description = "Navigate using Create New post link")

	public void LinkNavigationTest1() throws IOException {

		homepage.clickOnCreateNewPostLink();

		takeScreenshot();

	}

	@Test(priority = 3, enabled = false, description = "Navigate using Powershop link")

	public void LinkNavigationTest2() throws IOException {

		homepage.ClickOnPowershopLink();

		takeScreenshot();
	}

	@Test(priority = 4, enabled = false, description = "Navigate using Powershop AU link")

	public void LinkNavigationTest3() throws IOException {

		homepage.ClickOnPowershopAULink();

		takeScreenshot();
	}

	@Test(priority = 4, enabled = false, description = "Navigate using Powershop Culture link")

	public void LinkNavigationTest4() throws IOException {

		homepage.ClickOnPowershopCultureLink();

		takeScreenshot();
	}

	@Test(priority = 4, enabled = false, description = "Navigate using Wikipedia link")

	public void LinkNavigationTest5() throws IOException {

		homepage.ClickOnWikipediaLink();

		takeScreenshot();
	}
	
	@Test(priority = 1, enabled = false, description = "Login with valid password")

	public void ValidLoginTest() throws IOException {
        
		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(Password);
		signinpage.clickEnter();

	}

	@Test(priority = 2, enabled = false, description = "InValidLogin with valid password: valid password+random characters")

	public void InValidLoginTest1() throws IOException {

		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(Password + randomCharacters());
		signinpage.clickEnter();

	}

	@Test(priority = 4, enabled = false, description = "Login with invalid password:random integers")

	public void InValidLoginTest2() throws IOException, InterruptedException {
		
		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(randomIntegers());
		signinpage.clickEnter();
		waitFor(2);
		takeScreenshot();

	}

	@Test(priority = 5, enabled = false, description = "Login with invalid password-random special characters")

	public void InValidSigninPagetest3() throws IOException {
		
		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(randomSpslCharacters());
		signinpage.clickEnter();
		
		takeScreenshot();

	}

	@Test(priority = 6, enabled = false, description = "Login with invalid password-random negative numbers")

	public void InValidSigninPagetest4() throws IOException {

		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(randomnegnos());
		signinpage.clickEnter();
		
		takeScreenshot();

	}

	@Test(priority = 7, enabled = false, description = "Login with invalid password-blank")

	public void InValidSigninPagetest5() throws IOException {
		
		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword("");
		signinpage.clickEnter();
		
		takeScreenshot();

	}
	
	@Test(priority = 7, enabled = false, description = "Creating a new post- random Characters")

	public void createNewPostTest1() throws IOException {
		
		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(Password);
		signinpage.clickEnter();
		newpostpage.EnterdataOnTitleField(randomCharacters());
		newpostpage.EnterdataInDescriptionbox(randomCharacters());
		newpostpage.clickPost();
		
		takeScreenshot();

	}
	@Test(priority = 7, enabled = false, description = "Creating a new post-random Integers")

	public void createNewPostTest2() throws IOException {
		
		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(Password);
		signinpage.clickEnter();
		newpostpage.EnterdataOnTitleField(randomIntegers());
		newpostpage.EnterdataInDescriptionbox(randomIntegers());
		newpostpage.clickPost();
		
		takeScreenshot();

	}
	
	@Test(priority = 7, enabled = false, description = "Creating a new post-random Special Characters")

	public void createNewPostTest3() throws IOException {
		
		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(Password);
		signinpage.clickEnter();
		newpostpage.EnterdataOnTitleField(randomSpslCharacters());
		newpostpage.EnterdataInDescriptionbox(randomSpslCharacters());
		newpostpage.clickPost();
		
		takeScreenshot();

	}
	
	@Test(priority = 7, enabled = false, description = "Creating a new post-random Negative numbers")

	public void createNewPostTest4() throws IOException {
		
		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(Password);
		signinpage.clickEnter();
		newpostpage.EnterdataOnTitleField(randomnegnos());
		newpostpage.EnterdataInDescriptionbox(randomnegnos());
		newpostpage.clickPost();
		
		takeScreenshot();

	}
	
	@Test(priority = 7, enabled = false, description = "Creating a new post-blank")

	public void createNewPostTest5() throws IOException {
		
		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(Password);
		signinpage.clickEnter();
		newpostpage.EnterdataOnTitleField("");
		newpostpage.EnterdataInDescriptionbox("");
		newpostpage.clickPost();
		
		takeScreenshot();

	}
	

	@Test(priority = 7, enabled = false, description = "Submitting comments-random Characters")

	public void SubmitCommentTest1() throws IOException {
		
		createNewPostTest1();
		
		commentspage.enterName(randomCharacters());
		commentspage.enterComment(randomCharacters());
		commentspage.clickSubmit();
   
		takeScreenshot();
	}
	
	@Test(priority = 7, enabled = false, description = "Submitting comments-random Integers")

	public void SubmitCommentTest2() throws IOException {
		
		createNewPostTest1();
		
		commentspage.enterName(randomIntegers());
		commentspage.enterComment(randomIntegers());
		commentspage.clickSubmit();
   
		takeScreenshot();
	}

	@Test(priority = 7, enabled = false, description = "Submitting comments-random Spsl Charcters")

	public void SubmitCommentTest3() throws IOException {
		
		createNewPostTest1();
		
		commentspage.enterName(randomSpslCharacters());
		commentspage.enterComment(randomSpslCharacters());
		commentspage.clickSubmit();
   
		takeScreenshot();
	}
	
	@Test(priority = 7, enabled = false, description = "Submitting comments-Negative numbers")

	public void SubmitCommentTest4() throws IOException {
		
		createNewPostTest1();
		
		commentspage.enterName(randomnegnos());
		commentspage.enterComment(randomnegnos());
		commentspage.clickSubmit();
   
		takeScreenshot();
	}
	
	@Test(priority = 7, enabled = false, description = "Submitting comments-Blank")

	public void SubmitCommentTest5() throws IOException {
		
		createNewPostTest1();
		
		commentspage.enterName("");
		commentspage.enterComment("");
		commentspage.clickSubmit();
   
		takeScreenshot();
	}
	@AfterClass
	public void testShutDown() {

	}

}
