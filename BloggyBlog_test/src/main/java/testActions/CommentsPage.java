package testActions;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testBase.TestBase;

public class CommentsPage extends TestBase {

	public static Logger log = Logger.getLogger(HomePage.class.getName());

	public By nameField = By.xpath(".//*[@id='comment_name']");
	public By commentField = By.xpath(".//*[@id='comment_body']");
	public By submitButton = By.xpath(".//*[@id='new_comment']/table/tbody/tr[3]/td[2]/input");

	public CommentsPage(WebDriver wd) {

		this.wd = wd;

	}

	public void enterName(String name) {

		log.info("Entering name");
		wd.findElement(nameField).sendKeys(name);
	}

	public void enterComment(String comment) {

		log.info("Entering name");
		wd.findElement(nameField).sendKeys(comment);
	}
	public void clickSubmit() {

		log.info("Entering name");
		wd.findElement(submitButton).click();
	}

	
	

}
