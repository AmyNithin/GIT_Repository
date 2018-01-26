package SeleniumBasics.SeleniumBasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class VerifyCommonText {
	
	@Test
	
	public void verifyCommonTextTest(){
		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
		WebDriver wd=new FirefoxDriver();
		
		
		ArrayList<String> ExpectedArray=new ArrayList<String>();
		ExpectedArray.add("Credit Card");
		ExpectedArray.add("Personal Loan");
		ExpectedArray.add("Two Wheeler Loan");
		ExpectedArray.add("Car Loan");
		ExpectedArray.add("Home Loan");
		ExpectedArray.add("Credit Card Loan EMI Calculator");
		ExpectedArray.add("Personal Loan EMI Calculator");
		ExpectedArray.add("Car Loan EMI Calculator");
		ExpectedArray.add("Two Wheeler Loan EMI Calculator");

		
		
		wd.get("https://www.hdfcbank.com/");
		
		List<WebElement> totaltext=wd.findElements(By.xpath("//div[@class='homequicklinkslist']/ul/li"));
		Iterator<WebElement> itr=totaltext.iterator();
		
		ArrayList<String> ActualArray=new ArrayList<String>();
		
		while(itr.hasNext()){
			
			ActualArray.add(itr.next().getText());
		}
		//	System.out.println("ExpectedArray="+ExpectedArray);
		//	System.out.println("ActualArray=  "+ActualArray);
			
			Assert.assertEquals(ExpectedArray, ActualArray);
		}
		
		
		
}