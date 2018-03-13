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

public class TC002_ImageComparison extends TestBase {
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
			 
		@Test(priority = 1, enabled = true, description = "Image Comparison in Home Page")

		public void HomePagetest1() throws IOException {
					ImageComparison();

		}
		@AfterClass
		public void testShutDown() {

		}

}}
