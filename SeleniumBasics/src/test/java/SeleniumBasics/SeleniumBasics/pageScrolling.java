package SeleniumBasics.SeleniumBasics;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class pageScrolling {

	
	@Test
	public void Test() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
		WebDriver wd=new FirefoxDriver();
		
		wd.get("http://automationpractice.com/index.php");		
	    
		JavascriptExecutor jse = (JavascriptExecutor)wd;
		
		/*
		 * it will go till end vertically
		 */
		 jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 Thread.sleep(3000);
		 
		/*
		 * it will go down till end vertically
		 */
		 jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		 Thread.sleep(3000);
		 
		 /*
		  * it will go till the pixel specified
		  */
		 jse.executeScript("window.scrollBy(0,-500)");
		 Thread.sleep(3000);
		 /*
		  * it will come back till the pixel specified
		  */
		 jse.executeScript("window.scrollBy(0,500)");	
		 Thread.sleep(3000);
		 /*
		  * it will go till the object specified
		  */
		 jse.executeScript("arguments[0].scrollIntoView(true);",wd.findElement(By.xpath(".//*[@id='homefeatured']/li[5]/div/div[1]/div/a[1]/img")));
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
}