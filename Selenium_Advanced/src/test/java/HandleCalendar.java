import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class HandleCalendar {

	
	@Test
	public void handleCalendarTest() throws InterruptedException{
		
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
	WebDriver wd=new FirefoxDriver();
	
	wd.get("http://www.goibibo.com/");		
	
    String selectdata="11/24/2017";
	Date d=new Date(selectdata);
	SimpleDateFormat dt=new SimpleDateFormat("MMMM/dd/yyyy");
	String date=dt.format(d);
	System.out.println(date);
	
	String[] split=date.split("/");          //creating an array of strings and splitting at /
	System.out.println(split[0]+" "+split[1]+" "+split[2]);
	String month=split[0]+" "+split[2];      //storing 1st and 3rd array as a string in month
	
	System.out.println("month----"+month);
	
	
	
	wd.findElement(By.xpath(".//*[@id='gi_oneway_label']")).click();
	wd.findElement(By.xpath(".//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[1]/div/input")).click();
	
	Thread.sleep(2000);
	
	while(true){
		
		try {
			
			wd.findElement(By.xpath("//*[contains(text(),'"+month+"')]")).isDisplayed();
			
			//*[@id='fare_20171124']
			
		String firstpart=".//*[@id='fare_2017"	;
		String secondpart="']";
		String[] splitdate=selectdata.split("/");
		String finalpart=firstpart+splitdate[0]+splitdate[1]+secondpart;
			
		wd.findElement(By.xpath(finalpart)).click();
		break;
		
		} catch (Exception e) {
		
			wd.findElement(By.xpath(".//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[1]/div/div/div/div[1]/span")).click();
		}
	}	
	
}}
