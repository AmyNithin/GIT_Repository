package SeleniumBasics.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyCollapsedAndExpandedObjects {
	
	@Test
	
	public void verifyExpandedObjectsTest(){
		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
		WebDriver wd=new FirefoxDriver();
		
		wd.get("https://www.countryroad.co.nz/shop/woman");	
		
		String style=wd.findElement(By.xpath(".//*[@id='main_page']/div/nav/section/ul[1]/li[1]")).getCssValue("display");
		System.out.println("Before expanding  "+style);
		
		if(style.contains("list-item")){
			
			Assert.assertTrue(true,style);
			}
		else{
		Assert.assertFalse(false,style);
	}
	
	wd.findElement(By.xpath(".//*[@id='main_page']/div/nav/section/ul[1]/li[1]/a")).click();
	
	style=wd.findElement( By.xpath(".//*[@id='main_page']/div/nav/section/ul[1]/li[1]/a")).getCssValue("display");
	
	System.out.println("After expanding  "+style);
	
	if(style.contains("block")){
		
		Assert.assertTrue(true,style);
		}
	else{
	Assert.assertFalse(false,style);
	}}
	
}