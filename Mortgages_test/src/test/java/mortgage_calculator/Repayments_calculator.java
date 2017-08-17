package mortgage_calculator;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;	

public class Repayments_calculator {
	
	public static void main(String[] args)throws Exception{
			
			
		    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ammu\\Downloads\\geckodriver.exe");
            DesiredCapabilities capabilities=DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", true);
            WebDriver wd = new FirefoxDriver(capabilities);	
            WebDriverWait wait=new WebDriverWait(wd,60);
            
			wd.get("https://www.anz.co.nz/personal/home-loans-mortgages/mortgage-calculators/");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ir']")));
		    List<WebElement> links=wd.findElements(By.tagName("a"));
			for(WebElement link:links){
				
				if(link.getText().equals("Repayments calculator")){
				   link.click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='level3Heading']")));
			    wd.findElement(By.xpath("//input[@id='LoanAmount']")).clear();
			    WebElement wb = wd.findElement(By.xpath("//input[@id='LoanAmount']"));
			    JavascriptExecutor jse = (JavascriptExecutor)wd;
			    jse.executeScript("arguments[0].value='6000';", wb);
			    wd.findElement(By.xpath("//input[@id='InterestRate']")).clear();
			    WebElement wb1 = wd.findElement(By.xpath("//input[@id='InterestRate']"));
			    JavascriptExecutor jse1 = (JavascriptExecutor)wd;
			    jse.executeScript("arguments[0].value='2.5';", wb1);  
			    WebElement element = wd.findElement(By.xpath("//input[@class='btn btnPrimary large spinning']"));
			    JavascriptExecutor executor = (JavascriptExecutor)wd;
			    executor.executeScript("arguments[0].click();", element);
			    
			    
				
				}}}}
