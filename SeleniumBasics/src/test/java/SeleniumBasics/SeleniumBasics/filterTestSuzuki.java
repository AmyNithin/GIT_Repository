package SeleniumBasics.SeleniumBasics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class filterTestSuzuki {
	
	
@Test
	
	public void filterTest() throws InterruptedException{
	
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
	WebDriver wd=new FirefoxDriver();
	
	wd.get("https://www.olx.in/vehicles/q-swift/?search%5Bdescription%5D=1");
	
	Thread.sleep(2000);
	List<WebElement> allsuzuki=wd.findElements(By.xpath(".//*[@id='offers_table']/tbody/tr/td/table/tbody/tr[1]/td[2]/h3/a/span"));
	
	Iterator<WebElement> itr=allsuzuki.iterator();
	
	while(itr.hasNext()){
	
		String data=itr.next().getText();
		
		System.out.println(data);
		
		if(data.toLowerCase().contains("swift")){
			
		}else{
			
			Assert.assertTrue(false, data);
			
		}
		
	}
	
    allsuzuki=wd.findElements(By.xpath(".//*[@id='promotedAd']/tbody/tr/td/table/tbody/tr[1]/td[2]/h3/a/span"));
	
	while(itr.hasNext()){
	
		String data=itr.next().getText();
		
		System.out.println(data);
		
		if(data.toLowerCase().contains("swift")){
			
		}else{
			
			Assert.assertTrue(false,data);
			
			
		}
		
	}
	

}
}