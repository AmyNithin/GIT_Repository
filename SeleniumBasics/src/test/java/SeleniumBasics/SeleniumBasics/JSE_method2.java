package SeleniumBasics.SeleniumBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class JSE_method2 {
	@Test
	public void JSETest(){
		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
		WebDriver wd=new FirefoxDriver();
		
		wd.get("https://tools.anz.co.nz/home-loans/repayments-calculator");	
			

	    JavascriptExecutor jse = (JavascriptExecutor)wd;
		
		 jse.executeScript("document.getElementById(\"LoanAmount\").value=\"6000\"");
		 jse.executeScript("document.getElementById(\"InterestRate\").value=\"6.6\"");
		 
		// jse.executeScript("document.getElementById(\"LoanLength\")[0].value=50 years");
	
		 jse.executeScript("document.getElementsByClassName(\"btn btnPrimary large spinning\")[0].click();");
		    

	
	
	
}
}