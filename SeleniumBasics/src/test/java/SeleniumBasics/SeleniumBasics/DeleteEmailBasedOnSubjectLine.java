package SeleniumBasics.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DeleteEmailBasedOnSubjectLine {

	@Test
	public void Test() throws InterruptedException{
			
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
	WebDriver wd=new FirefoxDriver();
	
	wd.get("https://www.sharklasers.com");
	
	wd.findElement(By.xpath("//span[@id='inbox-id']")).click();
	Thread.sleep(1000);
	
	wd.findElement(By.xpath(".//*[@id='inbox-id']")).sendKeys("test");
	
	wd.findElement(By.xpath(".//*[@id='inbox-id']/button[1]")).click();
	Thread.sleep(10000);
	
	/*
	 * verify later
	 */
	//wd.findElement(By.xpath("//*contains(text(),'@gmail.com')]/preceding-sibling::td/input")).click();

	wd.findElement(By.xpath(".//*[@id='mr_131601343']/td[1]/input")).click();

	
	wd.findElement(By.xpath("//input[@id='del_button']")).click();
}
}