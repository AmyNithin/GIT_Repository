package SeleniumBasics.SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class iframe {

	
	
	
	
	@Test
	
	/*
	 * To locate an element with in a frame we should locate the frame first of all.
	 * test is the name
	 * 3 is the index of frame.frame index starts from 0
	 */
	public void switchToFrameTest(){
		
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
	WebDriver wd=new FirefoxDriver();
	
	wd.get("path of html file ghaving iframe");	
	wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	wd.switchTo().frame("test");
	//wd.switchTo().frame(3);
	wd.switchTo().frame("xpath of the frame where element belongs to");
	wd.findElement(By.xpath("")).click();
		
	}	
}
