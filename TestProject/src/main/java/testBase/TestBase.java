package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	
   
	public String email_value="";
	public String password_value="";

	public static WebDriver wd;
	public static Properties prop1=new Properties();
	public static Properties prop2=new Properties();
	
	public File file1;
	public FileInputStream fis1;
	public File file2;
	public FileInputStream fis2;

	
	/*
	 * This method will load properties files and browser
	 */
	public void init() throws IOException{
		
		loadORPropertiesFile();
		loadAPPPropertiesFile();
		selectBrowser(prop1.getProperty("browser"));
		wd.get(prop1.getProperty("url"));
	    }


	/*
	 * This method will load browser
	 */
	public WebDriver selectBrowser(String browser) {
		
		
		if(browser.equals("firefox") || browser.equals("FIREFOX")){
			
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\java\\drivers\\geckodriver.exe");
			wd=new FirefoxDriver();
			wd.manage().window().maximize();
			return wd;
		}
		else if(browser.equals("chrome") || browser.equals("CHROME")){
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			
			wd=new ChromeDriver();
			wd.manage().window().maximize();
			return wd;
		}
		else if(browser.equals("firefox") || browser.equals("FIREFOX")){
			
			wd=new InternetExplorerDriver();
			wd.manage().window().maximize();
			return wd;
		}
		 return null;
			
		}
		
		
	
/*
 * This method will load OR properties file
 */

	public void loadORPropertiesFile() throws IOException {
		 file1=new File(System.getProperty("user.dir")+"//src//main//java//Config//OR.properties");
		 fis1=new FileInputStream(file1);
		 prop1.load(fis1);
		}
	
	/*
	 * This method will load APP properties file
	 */
	public void loadAPPPropertiesFile() throws IOException {
		 file2=new File(System.getProperty("user.dir")+"//src//main//java//Config//APP.properties");
		 fis2=new FileInputStream(file2);
		 prop2.load(fis2);
		 
        
		 email_value=prop2.getProperty("email").toString();
		 password_value=prop2.getProperty("password").toString();
	}
	
		
/*
 * This method will close the browser
 */
	
	public void closeBrowser(){
		wd.quit();
	}
	
	}
