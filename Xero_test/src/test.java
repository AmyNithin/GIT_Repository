import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {
		
		public static void main(String[] args)throws Exception{
			
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ammu\\Downloads\\geckodriver.exe");
			
			WebDriver wd=new FirefoxDriver();
			WebDriverWait wait=new WebDriverWait(wd,60);
			wd.get("https://www.xero.com/nz/");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']")));

			
		
			wd.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));

			wd.findElement(By.xpath("//input[@id='email']")).click(); 
		    wd.findElement(By.xpath("//input[@id='email']")).sendKeys("amruthapb2@gmail.com");	
			wd.findElement(By.xpath("//input[@id='password']")).clear();
		    wd.findElement(By.xpath("//input[@id='password']")).sendKeys("wellington1");
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='submitButton']")));
			wd.findElement(By.xpath("//button[@id='submitButton']")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='Accounts']")));
			wd.findElement(By.xpath("//a[@id='Accounts']")).click();
			
			List<WebElement> links=wd.findElements(By.xpath("//a[@data-type='menu-focus']"));
			for(WebElement link:links){
				if(link.getText().equals("Bank Accounts")){
					link.click();
					break;
				}
			}
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='title']")));
			wd.findElement(By.xpath("//span[@class='text']")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='ba-page-title']")));
			
			wd.findElement(By.xpath("//input[@id='xui-searchfield-1018-inputEl']")).click();
			
			wd.findElement(By.xpath("//input[@id='xui-searchfield-1018-inputEl']")).sendKeys("ANZ (NZ)");
			
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='ba-banklist--item xui-contentblock--item']")));
			
			wd.findElement(By.xpath("//li[@class='ba-banklist--item xui-contentblock--item']")).click();
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='ba-page-title']")));
		    wd.findElement(By.xpath("//input[@id='accountname-1037-inputEl']")).click();
		    wd.findElement(By.xpath("//input[@id='accountname-1037-inputEl']")).sendKeys("Business Account");
			wd.findElement(By.xpath("//input[@id='accounttype-1039-inputEl']")).click();

	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='ba-page-title']")));
			//wd.findElement(By.xpath("//input[@id='accounttype-1100-inputEl']")).click();

	
		Select dropdown=new Select(wd.findElement(By.xpath("//input[@id='accounttype-1039-inputEl']")));
	     dropdown.selectByIndex(0);
	    
	     wd.findElement(By.xpath("//input[@id='accountnumber-1068-inputEl']")).click();
	     wd.findElement(By.xpath("//input[@id='accountnumber-1068-inputEl']")).sendKeys("1234569987");
	     
	     wd.findElement(By.xpath("//a[@id='common-button-submit-1015']")).click();

	     wd.close();
	     
	
			
			
				
		}}

