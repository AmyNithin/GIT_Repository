package SeleniumBasics.SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver {
	
	
	@Test
	public void mouseOverTest(){
		
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
	WebDriver wd=new FirefoxDriver();
	
	wd.get("http://automationpractice.com/index.php");
	wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement ele=wd.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a"));
	
	Actions actions=new Actions(wd);
	actions.moveToElement(ele);
	actions.build().perform();
	
		
		
	}

}
