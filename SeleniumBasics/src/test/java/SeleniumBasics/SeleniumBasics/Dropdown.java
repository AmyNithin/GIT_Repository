package SeleniumBasics.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {

@Test
	
	public void dropDownTest(){
	
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
	WebDriver wd=new FirefoxDriver();
	
	wd.get("https://www.facebook.com/");
	
	Select day=new Select(wd.findElement(By.xpath(".//*[@id='day']")));
	day.selectByValue("1");
	
	Select month=new Select(wd.findElement(By.xpath(".//*[@id='month']")));
	month.selectByVisibleText("Feb");
	
	Select year=new Select(wd.findElement(By.xpath(".//*[@id='year']")));
	year.selectByIndex(1);
	
	
	
	
	
	
}
	
	
	
	
	
	
}
