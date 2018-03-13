package testScripts;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testActions.CommentsPage;
import testActions.HomePage;
import testActions.LoginPage;
import testActions.NewpostPage;
import testBase.TestBase;

public class TC005_LoginWithInvalidCredentials extends TestBase {

	HomePage homepage;
	LoginPage signinpage;
	NewpostPage newpostpage;
	CommentsPage commentspage;

	@BeforeMethod

	public void testSetUp() throws IOException {

		init();
		homepage = new HomePage(wd);
		signinpage = new LoginPage(wd);
		newpostpage = new NewpostPage(wd);
		commentspage = new CommentsPage(wd);

	}

	@Test(priority = 1, enabled = false, description = "InValidLogin with valid password: valid password+random characters")

	public void InValidLoginTest1() throws IOException {

		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(Password + randomCharacters());
		signinpage.clickEnter();

	}

	@Test(priority = 2, enabled = false, description = "Login with invalid password:random integers")

	public void InValidLoginTest2() throws IOException, InterruptedException {

		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(randomIntegers());
		signinpage.clickEnter();
		waitFor(2);
		takeScreenshot();

	}

	@Test(priority = 3, enabled = false, description = "Login with invalid password-random special characters")

	public void InValidSigninPagetest3() throws IOException {

		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(randomSpslCharacters());
		signinpage.clickEnter();

		takeScreenshot();

	}

	@Test(priority = 4, enabled = false, description = "Login with invalid password-random negative numbers")

	public void InValidSigninPagetest4() throws IOException {

		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(randomnegnos());
		signinpage.clickEnter();

		takeScreenshot();

	}

	@Test(priority = 5, enabled = false, description = "Login with invalid password-blank")

	public void InValidSigninPagetest5() throws IOException {

		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword("");
		signinpage.clickEnter();

		takeScreenshot();
	}
}
