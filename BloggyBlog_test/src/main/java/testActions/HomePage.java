package testActions;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import testBase.TestBase;

public class HomePage extends TestBase{
	

	
public By linkcount=By.xpath("//a");
public By createnewpostlink=By.xpath("html/body/p[5]/a");
public By powershoplink=By.xpath("html/body/ul/li[1]/a");
public By powershopAUlink=By.xpath("html/body/ul/li[2]/a");
public By powershopCulturelink=By.xpath("html/body/ul/li[3]/a");
public By wikipedialink=By.xpath("html/body/ul/li[4]/a");


	
	

public static Logger log=Logger.getLogger(HomePage.class.getName());



public HomePage(WebDriver wd){
	
	this.wd=wd;
	
	}




public void linkCountHomePage(){
	
	
List<WebElement> links=wd.findElements(linkcount);

int totallinks=links.size();

System.out.println(totallinks);
	
if(totallinks==6){
	
Assert.assertTrue("Total links in the page remain same", true);	
	
}else{
	
	
	
	Assert.assertTrue("Total links in the page is different", false);		
	
	
}
}


public void clickOnCreateNewPostLink(){
	
	log.info("clicking on createnewpostlink");
	wd.findElement(createnewpostlink).click();
}

public void ClickOnPowershopLink(){
	
	log.info("clicking on Powershoplink");
	wd.findElement(powershoplink).click();
}
public void ClickOnPowershopAULink(){
	
	log.info("clicking on PowershopAUlink");
	wd.findElement(powershopAUlink).click();
}
public void ClickOnPowershopCultureLink(){
	
	log.info("clicking on Powershop Culture link");
	wd.findElement(powershopCulturelink).click();
}

public void ClickOnWikipediaLink(){
	
	log.info("clicking on Wikipedia link");
	wd.findElement(wikipedialink).click();
}

}