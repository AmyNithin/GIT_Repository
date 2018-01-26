package SeleniumBasics.SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectWindow {

	
	@Test
	
public void windowHandleTest(){
		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
		WebDriver wd=new FirefoxDriver();
		
		wd.get("https://www.facebook.com/");
		
		wd.findElement(By.xpath(".//*[@id='cookie-use-link']")).click();
		
		Set<String> windows=wd.getWindowHandles();
		
		Iterator<String> itr=windows.iterator();
		
		String parentwindow=itr.next();
		String childwindow=itr.next();
		
		wd.switchTo().window(childwindow);
		wd.close();
		
		wd.switchTo().window(parentwindow);
		
		//wd.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[1]")).isDisplayed();
		
	
	
}
}