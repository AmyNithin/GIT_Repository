package testScripts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBase.Abstract;

public class TC002 extends Abstract{
	
	
	
	@BeforeMethod
	
	public void setup(){
		
		init();
	}
	
	@Test(enabled=false)
	
	public void dragdroptest(){
		
		wd.get("http://jqueryui.com/droppable/");
		
		wd.switchTo().frame(wd.findElement(By.className("demo-frame")));
		WebElement source=wd.findElement(By.id("draggable"));
		WebElement target=wd.findElement(By.id("droppable"));
		
		
		Actions actions=new Actions(wd);
		actions.dragAndDrop(source, target);
		actions.build().perform();
		
	}
	@Test(enabled=false)
	
	public void dropDownTest(){
		
		
		wd.get("https://www.facebook.com/");
		
		Select day=new Select(wd.findElement(By.id("day")));
		day.selectByIndex(2);
		
		Select month=new Select(wd.findElement(By.id("month")));
		month.selectByIndex(3);
		
		Select year=new Select(wd.findElement(By.id("year")));
		year.selectByIndex(4);
		
		}
	
@Test(enabled=false)
	
	public void JSETest(){
		
	
	wd.get("https://tools.anz.co.nz/home-loans/repayments-calculator");
	
	JavascriptExecutor jse=(JavascriptExecutor)wd;
	
	jse.executeScript("arguments[0].value=\"6000\"", wd.findElement(By.id("LoanAmount")));
	
	jse.executeScript("arguments[0].click()", wd.findElement(By.xpath("//input[@class='btn btnPrimary large spinning']")));
	
}
	
@Test(enabled=false)

public void enabledTest(){
	
	
	wd.get("https://www.olx.in/cars/");
	
	Assert.assertTrue(wd.findElement(By.id("param_model")).getAttribute("class").contains("param paramSelect disabled"));
	
	wd.get("https://www.olx.in/tata/");
	
	Assert.assertTrue(wd.findElement(By.id("param_model")).getAttribute("class").contains("param paramSelect "));
	
	
}
	
@Test(enabled=false)

public void collapsedTest(){
	
	
wd.get("https://www.countryroad.co.nz/shop/woman");	

wd.findElement(By.className("ui-accordion-li-fix")).click();
	
String style=wd.findElement(By.className("ui-accordion-li-fix")).getCssValue("display");

if(style.contains("block"));

Assert.assertTrue(true);
	
	
	
}
	
@Test(enabled=false)	


public void SelectWindow(){
	
	
	wd.get("https://www.facebook.com/");
	
	String parentwindow=wd.getWindowHandle();
	
	wd.findElement(By.xpath(".//*[@id='cookie-use-link']")).click();	
	
	for(String currentwindow:wd.getWindowHandles()){
		
		
	wd.switchTo().window(currentwindow);
	
	
		
		
	}}
		
	
	
	@Test(enabled=true)
	
	public void HandleTable(){
		
		
		
	wd.get("https://www.w3schools.com/html/html_tables.asp");	
		
		
	int size=	wd.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
	
	for(int i=2;i<=size;i++){
		
	String firstpart="//table[@id='customers']/tbody/tr[";
	String secondpart="]/td[2]";
	
	String text=wd.findElement(By.xpath(firstpart+i+secondpart)).getText();
		
	System.out.println(text);	
	
		}}
	
	
	
	
	
	
	
}
	
	
	
	


