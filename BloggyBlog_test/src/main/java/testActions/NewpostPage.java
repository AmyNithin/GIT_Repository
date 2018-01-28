package testActions;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testBase.TestBase;

public class NewpostPage extends TestBase {
	
	
	
	public static Logger log = Logger.getLogger(LoginPage.class.getName());
	
	public By Titlefield=By.xpath(".//*[@id='post_title']");
	public By Descriptionfield=By.xpath(".//*[@id='post_body']");
	public By postButton=By.xpath(".//*[@id='new_post']/p[3]/input");

	public NewpostPage(WebDriver wd) {

		this.wd = wd;

	}

	public void EnterdataOnTitleField(String title) {

		log.info("Entering data on title field");
	    wd.findElement(Titlefield).sendKeys(title);

	}
	
	public void EnterdataInDescriptionbox(String desc) {

		log.info("Entering data in description box");
	    wd.findElement(Descriptionfield).sendKeys(desc);

	}
	
	public void clickPost(){
		
		log.info("clicking on post button");
		wd.findElement(postButton).click();
	}
	
	
	
	
	
	
	
	
}
