package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	
	
	public static String email_value="";
	public static String password_value="";
	
	
	
	
	
	
	public static WebDriver wd;
	public Properties prop1=new Properties();
	public Properties prop2=new Properties();
	
	public static File file1;
	public static FileInputStream fis1;
	public static File file2;
	public static FileInputStream fis2;
	
	public  void init() throws IOException{
	
	loadORProperties1();
	loadAPPProperties();
	selectBrowser(prop1.getProperty("browser"));
	wd.get(prop1.getProperty("url"));
		
		
	}

	public static WebDriver selectBrowser(String browser) {
		
		if(browser.equals("firefox")|| browser.equals("FIREFOX")){
			
			wd=new FirefoxDriver();
			wd.manage().window().maximize();
		
			return wd;
			}
	if(browser.equals("chrome")|| browser.equals("CHROME")){
		
		
		System.setProperty("webdriver.chrome.driver" ,System.getProperty("user.dir")+"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		wd=new ChromeDriver();
		wd.manage().window().maximize();
	
		return wd;
		}
   if(browser.equals("ie")|| browser.equals("IE")){
		
		wd=new InternetExplorerDriver();
		wd.manage().window().maximize();
	
		return wd;
		}
return null;
	}
		
public  void loadORProperties1() throws IOException {
		
		
	file1=new File(System.getProperty("user.dir")+"\\src\\main\\java\\config\\OR.properties");
	fis1=new FileInputStream(file1);
	prop1.load(fis1);
		
		
	}
	
	
	public void loadAPPProperties() throws IOException {
	
		file2=new File(System.getProperty("user.dir")+"\\src\\main\\java\\config\\OR.properties");
		fis2=new FileInputStream(file2);
		prop2.load(fis2);
			
		email_value=prop2.getProperty("email").toString();
		password_value=prop2.getProperty("password").toString();
		
		
	}

	
	public static void closeBrowser(){
		
		wd.close();
	}
	
	
	
	

}
