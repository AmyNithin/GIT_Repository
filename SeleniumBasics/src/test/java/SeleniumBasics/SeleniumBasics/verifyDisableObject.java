package SeleniumBasics.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyDisableObject {

	@Test
	public void Test() {

		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\java\\drivers\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();

		wd.get("https://www.olx.in/cars/");
		/*
		 * look for disabled keyword in HTML.Copy the corresponding xpath
		 */
		String class_name = wd.findElement(By.xpath(".//*[@id='param_model']")).getAttribute("class");

		Assert.assertEquals(class_name, "param paramSelect disabled");

		wd.findElement(By.xpath("//span[@class='icon down abs']")).click();
		wd.findElement(
				By.xpath("//a[@class='tdnone block c27 brbott-4 category-choose category_choose1535 search-choose']"))
				.click();

		class_name = wd.findElement(By.xpath(".//*[@id='param_model']")).getAttribute("class");
		// Assert.assertEquals(class_name,"param paramSelect ");
		Assert.assertNotEquals(class_name, "param paramSelect disabled");
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
