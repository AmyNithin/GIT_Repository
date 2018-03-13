package testScripts;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testActions.CommentsPage;
import testActions.HomePage;
import testActions.LoginPage;
import testActions.NewpostPage;
import testBase.TestBase;

public class TC003_NavigationTest extends TestBase {

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

	@Test(priority = 1, enabled = false, description = "Navigate using Create New post link")

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
}
