import org.openqa.selenium.WebDriver;

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