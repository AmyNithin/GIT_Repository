package testActions;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import testBase.TestBase;

public class HomePage extends TestBase{
	

public By siginButton=By.className("login");	
public By homepageLogo=By.id("header_logo");
public By linkcount=By.xpath("//a");
	
	

public static Logger log=Logger.getLogger(HomePage.class.getName());



public HomePage(WebDriver wd){
	
	this.wd=wd;
	
	}


public void verifyHomePageLabel(){
	
	
if(wd.findElement(homepageLogo).isDisplayed()){
	
	
	Assert.assertTrue(true);
	
}else{
	
	
	Assert.assertTrue(false);
}
	
}

public void linkCountHomePage(){
	
	
List<WebElement> links=wd.findElements(linkcount);

int totallinks=links.size();

System.out.println(totallinks);
	
if(totallinks==149){
	
Assert.assertTrue("Total links in the page remain same", true);	
	
}else{
	
	
	
	Assert.assertTrue("Total links in the page is different", false);		
	
	
}
}







public void clickSignin(){
	
	
	log.info("clicking on Signin");
	
	wd.findElement(siginButton).click();
		
}
	
	
	
	
	

}
