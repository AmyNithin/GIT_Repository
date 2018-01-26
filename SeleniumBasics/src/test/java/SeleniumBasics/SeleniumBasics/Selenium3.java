package SeleniumBasics.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium3 {
	
	@Test
	
public void test(){
	
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
    
	    WebDriver wd=new FirefoxDriver();
	    wd.get("https://www.facebook.com/");
	
}
}