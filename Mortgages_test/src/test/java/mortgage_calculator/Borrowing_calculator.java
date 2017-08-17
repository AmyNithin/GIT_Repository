package mortgage_calculator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Borrowing_calculator {
	
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
				
				if(link.getText().equals("Borrowing calculator")){
					
					link.click();
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='level3Heading']")));
					List<WebElement> select = wd.findElements(By.tagName("label"));

					for (WebElement radio : select){
					if (radio.getAttribute("id").contains("simpleIndividualType")){
					radio.click();
					break;
					}
					if (radio.getAttribute("id").contains("simpleJointType")){
						radio.click();		
					break;
					}
					wd.findElement(By.xpath("//input[@id='Income_AnnualHousehold']")).clear();
					wd.findElement(By.xpath("//input[@id='Income_AnnualHousehold']")).sendKeys("100000");
					wd.findElement(By.xpath("//input[@id='LoanDetails_Dependants']")).clear();
					wd.findElement(By.xpath("//input[@id='LoanDetails_Dependants']")).sendKeys("5");
					wd.findElement(By.xpath("//input[@id='LoanDetails_Vehicles']")).clear();
					wd.findElement(By.xpath("//input[@id='LoanDetails_Vehicles']")).sendKeys("2");
					wd.findElement(By.xpath("//input[@id='baseSubmit']")).click();
				}}}}}
			
			
			

