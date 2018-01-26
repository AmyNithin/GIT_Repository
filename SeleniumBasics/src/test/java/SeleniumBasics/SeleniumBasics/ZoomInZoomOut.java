package SeleniumBasics.SeleniumBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ZoomInZoomOut {

	@Test
	public void Test() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\java\\drivers\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();

		wd.get("http://automationpractice.com/index.php");
		// wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		// JavascriptExecutor jse=(JavascriptExecutor)wd;

		((JavascriptExecutor) wd).executeScript("document.body.style.zoom='40%'");
		// jse.executeScript("document.body.style.zoom='40%'");

		Thread.sleep(3000);
		((JavascriptExecutor) wd).executeScript("document.body.style.zoom='100%'");

		// jse.executeScript("document.body.style.zoom='100%'");

	}
}
