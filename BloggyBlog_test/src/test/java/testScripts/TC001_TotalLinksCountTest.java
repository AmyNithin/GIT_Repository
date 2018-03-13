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

public class TC001_TotalLinksCountTest extends TestBase {

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

	@Test(priority = 1, enabled = false, description = "Total link Count in Home Page")

	public void HomePagetest2() throws IOException {

		homepage.linkCountHomePage();

	}

	@AfterClass
	public void testShutDown() {

	}

}
