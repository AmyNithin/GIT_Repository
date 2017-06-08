import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test_setup extends Random_check {
	
	public static void main(String[] args)throws Exception{
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ammu\\Downloads\\geckodriver.exe");
	
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.xero.com/nz/");

	
		wd.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']")).click();
		
		wd.findElement(By.xpath("//input[@id='email']")).clear();
		
		//Random_check R_e=new Random_check();
	    
	    
	    wd.findElement(By.xpath("//input[@id='email']")).sendKeys(Random_check.email());
			
		wd.findElement(By.xpath("//input[@id='password']")).clear();
		Random_check R_pwd=new Random_check();
		//wd.findElement(By.xpath("//input[@id='password']")).sendKeys(R_pwd);
		R_pwd.password();
		
		
		wd.findElement(By.xpath("//button[@id='submitButton]']")).click();
		
		wd.findElement(By.xpath("//a[@id='Accounts']")).click();
		Select dropdown=new Select(wd.findElement(By.xpath("//a[@id='Accounts']")));
		dropdown.selectByVisibleText("Bank Accounts");
		
		wd.findElement(By.xpath("//span[@class='text']")).click();
		wd.findElement(By.xpath("//input[@id='xui-searchfield-1018-inputEl']")).clear();
		Select dropdown1=new Select(wd.findElement(By.xpath("//a[@id='Accounts']")));
		dropdown1.selectByVisibleText("ANZ (NZ)");
		
		wd.findElement(By.xpath("//input[contains(@id,'accountname')]")).clear();
		
		Random_check R_name=new Random_check();
		R_name.accountname();
		
		wd.findElement(By.xpath("//input[contains(@id,'accounttype')]")).click();
		Select dropdown2=new Select(wd.findElement(By.xpath("//input[contains(@id,'accounttype')]")));
		dropdown2.selectByIndex(0);
		
		wd.findElement(By.xpath("//input[contains(@id,'accountnumber')]"));
		
		wd.findElement(By.xpath("//input[@id='password']")).clear();
		Random_check acc_no=new Random_check();
		acc_no.accountno();
		wd.findElement(By.xpath("//input[contains(@id,'currencyCombo-1069-inputEl')]")).click();
		wd.findElement(By.xpath("//span[contains(id,'common-button')]")).click();
		
		
		
		
			}}