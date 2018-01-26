package SeleniumBasics.SeleniumBasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PriceFilter {

	/*
	 * scenario:To check whether the price is sorted in ascending order when filtered
	 */
	
	@Test
	public void Test() throws InterruptedException{
			
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
	WebDriver wd=new FirefoxDriver();
    WebDriverWait wait=new WebDriverWait(wd,60);
	
	wd.get("http://automationpractice.com/index.php");
	wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	wd.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a")).click();
	
	wait.until(ExpectedConditions.visibilityOf(wd.findElement(By.xpath("//*[contains(text(),'Women')]"))));
	
	Select dropdwon=new Select(wd.findElement(By.xpath(".//*[@id='selectProductSort']")));
	dropdwon.selectByVisibleText("Price: Lowest first");
	Thread.sleep(6000);
	
	
    List<WebElement> allprice=wd.findElements(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[1]/span[1]"));
    
    ArrayList<Integer> array=new ArrayList<Integer>();
	
	Iterator<WebElement> itr=allprice.iterator();
	
	/*
	 * getting the price as String and converting to integer
	 */
	while(itr.hasNext()){
		
		String p=itr.next().getText();
	
		System.out.println(p);
		
		if(p.contains("$")){
			
		String actualData=p.substring(1);   //Start from index 1 since we want to eliminate $
		double p1=Double.parseDouble(actualData);
		
		int productPrice=(int)(p1);
		array.add(productPrice);
			}}
	/*
	 * To compare prices with one below
	 */
	
	
	for(int i=0;i<array.size()-1;i++){ //-1 is used since we don't have any item below last item to compare
		
		if(array.get(i)<array.get(i+1)){
			
			System.out.println("obj.get(i):"+array.get(i));
			System.out.println("obj.get(i+1):"+array.get(i+1));	
			
		}else
		{
			Assert.assertTrue(false);
		}}
	    }}	
	

