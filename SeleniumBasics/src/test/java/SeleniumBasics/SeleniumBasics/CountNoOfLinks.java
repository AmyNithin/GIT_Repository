package SeleniumBasics.SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class CountNoOfLinks {

	@Test
		public void countLinksTest(){
			
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
		WebDriver wd=new FirefoxDriver();
		
			wd.get("http://automationpractice.com/index.php");	
			
			List<WebElement> links=wd.findElements(By.xpath("//a"));
			
			int linkCount=links.size();
			System.out.println("linkCount="+linkCount);
			
			Assert.assertEquals(links.size(),149);
	
         
			
	
	
}
}