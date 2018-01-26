package SeleniumBasics.SeleniumBasics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class deleteAllMailFromInbox {

	/*
	 * Manually write the xpath
	 * find out the tag that contains all data
	 * then find out the checkbox locator from that
	 * apply logic changing tr & td
	 */
	
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
	int size=wd.findElements(By.xpath("//form[@class='email_list_form']/table/tbody/tr/td[1]/input")).size();
	
	for(int i=1;i<=size;i++){
		
		
		String first_part="//form[@class='email_list_form']/table/tbody/tr[";
		String second_part="]/td[1]/input";
		
		System.out.println(first_part+i+second_part);
		
		wd.findElement(By.xpath(first_part+i+second_part)).click();
		}
	
	Thread.sleep(1000);
	wd.findElement(By.xpath("//input[@id='del_button']")).click();
}
}	
	
	
	
	
	
	
	

