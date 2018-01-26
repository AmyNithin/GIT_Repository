import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageComparison {

	
	@Test
	public void ImageComparison() throws InterruptedException, IOException{
		
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\java\\drivers\\geckodriver.exe");   
	WebDriver wd=new FirefoxDriver();
	
	wd.get("https://www.facebook.com/");
	
	
	File screenshot=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE); //casting driver with TakeScreenshot interface
	
	FileUtils.copyFile(screenshot, new File("FacebookOutput.jpg")); //add poi dependency to access FileUtils
	
	File fileInput=new File("FacebookInput.jpg"); //first run->refresh project->Rename the screenshotimage(FacebookOutput) as FacebookInput->run again
	File fileOutput=new File("FacebookOutput.jpg");
	
	BufferedImage bufferfileInput=ImageIO.read(fileInput); //imageIO is an interface that reads input file & give buffered image
	DataBuffer bufferfileInput1=bufferfileInput.getData().getDataBuffer();  //get the data from buffered memory
	int sizefileInput=bufferfileInput1.getSize(); //get the size of buffered input data
	System.out.println(sizefileInput);
	
	BufferedImage bufferfileOutput=ImageIO.read(fileOutput);
	DataBuffer bufferfileOutput1=bufferfileOutput.getData().getDataBuffer();
	int sizefileOutput=bufferfileOutput1.getSize();
	System.out.println(sizefileOutput);
	
	Boolean matchflag=true;
	
	if(sizefileInput==sizefileOutput){
		
	Assert.assertTrue(matchflag,"Images are same");	
	}else{
		
		matchflag=false;
		Assert.assertTrue(matchflag,"Images are not same");
		
	}}}
