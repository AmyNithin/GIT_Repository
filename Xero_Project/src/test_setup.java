

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test_setup {
	
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
		
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-type='menu-focus']")));
		String a=((WebElement) wd.findElements(By.tagName("li"))).getText();
		System.out.println("text is"+a);
		//List<WebElement> links=wd.findElements(By.tagName("li"));
		//for(WebElement link:links){
		//	if(link.getText().equals("Bank Accounts"))
		//		link.click();
		//	break;
		
	//	}
		
		
		
		wd.findElement(By.xpath("//span[@class='text']")).click();
		wd.findElement(By.xpath("//input[@id='xui-searchfield-1018-inputEl']")).clear();
		Select dropdown1=new Select(wd.findElement(By.xpath("//a[@id='Accounts']")));
		dropdown1.selectByVisibleText("ANZ (NZ)");
		
		wd.findElement(By.xpath("//input[contains(@id,'accountname')]")).clear();
		wd.findElement(By.xpath("//input[contains(@id,'accountname')]")).sendKeys("amy");
		
		wd.findElement(By.xpath("//input[contains(@id,'accounttype')]")).click();
		Select dropdown2=new Select(wd.findElement(By.xpath("//input[contains(@id,'accounttype')]")));
		dropdown2.selectByIndex(0);
		
		wd.findElement(By.xpath("//input[contains(@id,'accountnumber')]"));
		
		wd.findElement(By.xpath("//input[@id='password']")).clear();
		wd.findElement(By.xpath("//input[@id='password']")).sendKeys("123789043");
		wd.findElement(By.xpath("//input[contains(@id,'currencyCombo-1069-inputEl')]")).click();
		wd.findElement(By.xpath("//span[contains(id,'common-button')]")).click();
		
		
		
		
			
	}}