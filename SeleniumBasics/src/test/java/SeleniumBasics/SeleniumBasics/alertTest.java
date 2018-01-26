package SeleniumBasics.SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alertTest {

	
	@Test(enabled=false)
		
	    /*
		 * alert has just one option
		 */
		public void alertTest1(){
		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
		WebDriver wd=new FirefoxDriver();
		
		wd.get("");
		Alert alert=wd.switchTo().alert();
		//alert().accept();
		//alert().dismiss();
			
}

	public void alertTest2(){
	
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
	WebDriver wd=new FirefoxDriver();
		wd=new FirefoxDriver();
	
	Alert alert=wd.switchTo().alert();
	
	String msg=alert.getText();
	System.out.println(msg);
	Assert.assertEquals(msg, "press a button");
	
	alert.dismiss();
	
	
	
	
	
	
	}
	
}
