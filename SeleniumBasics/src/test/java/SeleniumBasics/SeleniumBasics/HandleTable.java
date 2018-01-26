package SeleniumBasics.SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleTable {
	
	
	@Test
	public void handleTableTest(){
		
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
	WebDriver wd=new FirefoxDriver();
	
	wd.get("https://www.w3schools.com/html/html_tables.asp");
	wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	int size=wd.findElements(By.xpath(".//*[@id='customers']/tbody/tr")).size();
	
	System.out.println(size);
	
	for(int i=2;i<=size;i++){
	String firstpart="//*[@id='customers']/tbody/tr[";
	String secondpart="]/td[2]";
	
	System.out.println(firstpart+i+secondpart);
	
	String text=wd.findElement(By.xpath(firstpart+i+secondpart)).getText();
	System.out.println(text);
	
	}
	
	
	
	}
}
