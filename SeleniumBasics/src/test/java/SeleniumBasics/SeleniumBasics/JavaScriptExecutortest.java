package SeleniumBasics.SeleniumBasics;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutortest {
	

	@org.junit.Test
	
	public void Test(){
	
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
		WebDriver wd=new FirefoxDriver();
	
		wd.get("https://tools.anz.co.nz/home-loans/repayments-calculator");
	    wd.findElement(By.xpath(".//*[@id='LoanAmount']")).clear();
	    
	    JavascriptExecutor jse = (JavascriptExecutor)wd;
	    
	    jse.executeScript("arguments[0].value=\"6000\"", wd.findElement(By.xpath("//input[@id='LoanAmount']")));
	    jse.executeScript("arguments[0].click()",wd.findElement(By.xpath("//input[@class='btn btnPrimary large spinning']")));
	   
}
}