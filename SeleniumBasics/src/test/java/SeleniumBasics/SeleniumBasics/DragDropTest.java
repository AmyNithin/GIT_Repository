package SeleniumBasics.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDropTest {

	WebDriver wd;
	
@Test
	
	public void dropDownTest(){
	
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
	WebDriver wd=new FirefoxDriver();
	
	wd.get("http://jqueryui.com/droppable/");
	
	wd.switchTo().frame(wd.findElement(By.className("demo-frame")));
	
	WebElement source=wd.findElement(By.xpath(".//*[@id='draggable']"));
	WebElement dest=wd.findElement(By.xpath(".//*[@id='droppable']"));
	
	Actions actions=new Actions(wd);
	
	actions.dragAndDrop(source, dest);
	
	actions.build().perform();
	
	
	
	
}	
	
	
	
}
