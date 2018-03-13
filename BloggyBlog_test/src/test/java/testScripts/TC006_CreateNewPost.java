package testScripts;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testActions.CommentsPage;
import testActions.HomePage;
import testActions.LoginPage;
import testActions.NewpostPage;
import testBase.TestBase;

public class TC006_CreateNewPost extends TestBase {

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

	@Test(priority = 1, enabled = false, description = "Creating a new post- random Characters")

	public void createNewPostTest1() throws IOException {

		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(Password);
		signinpage.clickEnter();
		newpostpage.EnterdataOnTitleField(randomCharacters());
		newpostpage.EnterdataInDescriptionbox(randomCharacters());
		newpostpage.clickPost();

		takeScreenshot();

	}

	@Test(priority = 2, enabled = false, description = "Creating a new post-random Integers")

	public void createNewPostTest2() throws IOException {

		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(Password);
		signinpage.clickEnter();
		newpostpage.EnterdataOnTitleField(randomIntegers());
		newpostpage.EnterdataInDescriptionbox(randomIntegers());
		newpostpage.clickPost();

		takeScreenshot();

	}

	@Test(priority = 3, enabled = false, description = "Creating a new post-random Special Characters")

	public void createNewPostTest3() throws IOException {

		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(Password);
		signinpage.clickEnter();
		newpostpage.EnterdataOnTitleField(randomSpslCharacters());
		newpostpage.EnterdataInDescriptionbox(randomSpslCharacters());
		newpostpage.clickPost();

		takeScreenshot();

	}

	@Test(priority = 4, enabled = false, description = "Creating a new post-random Negative numbers")

	public void createNewPostTest4() throws IOException {

		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(Password);
		signinpage.clickEnter();
		newpostpage.EnterdataOnTitleField(randomnegnos());
		newpostpage.EnterdataInDescriptionbox(randomnegnos());
		newpostpage.clickPost();

		takeScreenshot();

	}

	@Test(priority = 5, enabled = false, description = "Creating a new post-blank")

	public void createNewPostTest5() throws IOException {

		homepage.clickOnCreateNewPostLink();
		signinpage.enterPassword(Password);
		signinpage.clickEnter();
		newpostpage.EnterdataOnTitleField("");
		newpostpage.EnterdataInDescriptionbox("");
		newpostpage.clickPost();

		takeScreenshot();

	}

	@Test(priority = 1, enabled = false, description = "Submitting comments-random Characters")

	public void SubmitCommentTest1() throws IOException {

		createNewPostTest1();

		commentspage.enterName(randomCharacters());
		commentspage.enterComment(randomCharacters());
		commentspage.clickSubmit();

		takeScreenshot();
	}

	@Test(priority = 2, enabled = false, description = "Submitting comments-random Integers")

	public void SubmitCommentTest2() throws IOException {

		createNewPostTest1();

		commentspage.enterName(randomIntegers());
		commentspage.enterComment(randomIntegers());
		commentspage.clickSubmit();

		takeScreenshot();
	}

	@Test(priority = 3, enabled = false, description = "Submitting comments-random Spsl Charcters")

	public void SubmitCommentTest3() throws IOException {

		createNewPostTest1();

		commentspage.enterName(randomSpslCharacters());
		commentspage.enterComment(randomSpslCharacters());
		commentspage.clickSubmit();

		takeScreenshot();
	}

	@Test(priority = 4, enabled = false, description = "Submitting comments-Negative numbers")

	public void SubmitCommentTest4() throws IOException {

		createNewPostTest1();

		commentspage.enterName(randomnegnos());
		commentspage.enterComment(randomnegnos());
		commentspage.clickSubmit();

		takeScreenshot();
	}

	@Test(priority = 5, enabled = false, description = "Submitting comments-Blank")

	public void SubmitCommentTest5() throws IOException {

		createNewPostTest1();

		commentspage.enterName("");
		commentspage.enterComment("");
		commentspage.clickSubmit();

		takeScreenshot();
	}

}
