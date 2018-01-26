import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DownloadFile {

	WebDriver wd;
	
	@BeforeClass
	public void startBrowser(){
	
	//System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
   // wd=new FirefoxDriver();
		
			
	FirefoxProfile fprofile=new FirefoxProfile();
	
	/*
	 * browser.download.folderList can be set to 0, 1 or 2
	 * 0:firefox will save all the files downloaded via browser on user's desktop
	 * 1:downloads are stored in download location
	 * 2:location specified for the most recent download is utilized again
	 */
	
	//set the location to store files after downloading
	fprofile.setPreference("browser.download.dir","C:\\Users\\Ammu\\Downloads");
	fprofile.setPreference("browser.download.folderList",2);
	
	fprofile.setPreference("browser.helperApps.neverAsk.saveToDisk",
			"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;"       //MIME type for Excel
			+"application/pdf;" //MIME type for pdf
			+"application/octet-stream;" //MIME type for binary file
			+"application/vnd.openxmlformats-officedocument.wordprocessingml.document;" //MIME type for ms office file
			+"text/plain;"          //MIME type for text file
			+"text/csv;"
			+"application/zip;"      
			+"application/x-gzip;"); //MIME type for Tar file
	
	/*
	 * A boolean value that indicates whether or not to show the downloads window when a download begins/default value is true
	 */
	
	
	fprofile.setPreference("browser.download.manager.showWhenStarting",false);
	
	/*
	 * To disable pdf viewer & use adobe reader instead
	 */
	
	
	fprofile.setPreference("pdfjs.disabled", true);
	
	wd=new FirefoxDriver(fprofile); //passing fprofile parameter to use preferences to download file
	
	}
	
		@Test
		
		public void downloadTest1() throws InterruptedException{
		
		
		File f=new File("C:\\Users\\Ammu\\Downloads\\eclipse-inst-win64.exe");
		if(f.exists()){
			f.delete();
			System.out.println("File deleted");
		}
		
		wd.get("http://www.eclipse.org/downloads/");
		wd.findElement(By.xpath(".//*[@id='runtime-platforms']/div/div/div[1]/div/p[2]/a")).click();
		Thread.sleep(3000);
		
		wd.findElement(By.xpath(".//*[@id='novaContent']/div[1]/div[1]/div/div/a")).click();
		Thread.sleep(5000);
		
	    File file=new File("C:\\Users\\Ammu\\Downloads\\eclipse-inst-win64.exe");
		int count=0;
		
		System.out.println(file.exists());
		/*
		 * Checking whether file has been downloaded
		 */
		while(!file.exists()){
			
			System.out.println("Waiting for download to complete"+count++);
			Thread.sleep(2000);
			}
	    
	    File f1=new File("C:\\Users\\Ammu\\Downloads\\eclipse-inst-win64.exe");
	   /*
	    * checking whether file has proper size
	    */
	    long file1;
	    
	do{
		
	file1=f1.length(); //check the file size
	System.out.println(file1); //get the size of file to make sure that file is down loaded
	Thread.sleep(8000);
	}
	while(file1==0);
	
	f=new File("C:\\Users\\Ammu\\Downloads\\eclipse-inst-win64.exe");
	
	if(f.exists() && file1>0){
		System.out.println("DownloadTest successful");
	}else{
		System.out.println("DownloadTest failed");
	}}}


