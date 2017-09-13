package sample;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class sample {
	
	public static void main(String args[])throws Exception{
		
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ammu\\Downloads\\geckodriver.exe");
    DesiredCapabilities capabilities=DesiredCapabilities.firefox();
    capabilities.setCapability("marionette", true);
    
	WebDriver wd=new FirefoxDriver();
	wd.get("http://www.whitemart.in/Home.aspx");
	
	List<WebElement> links=wd.findElements(By.tagName("a"));
	for(WebElement link:links){
		if(link.getText().equals("Feedback")){
			link.click();
			break;
		}}	
	
	wd.findElement(By.id("txtname1")).clear();
	wd.findElement(By.id("txtname1")).sendKeys("Amy");
	wd.findElement(By.id("txtmail")).clear();
	wd.findElement(By.id("txtmail")).sendKeys("amruthapb2@gmail.com");
	wd.findElement(By.id("txtcomments")).clear();
	wd.findElement(By.id("txtcomments")).sendKeys("Good Service");
	wd.findElement(By.id("lnkreset")).click();
	Assert.assertTrue(wd.findElement(By.className("feedbacks")).getText().contains("Feedback"));	
}
}