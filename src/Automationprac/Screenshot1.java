package Automationprac;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.apache.commons.io.FileUtils.*;

public class Screenshot1 {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"I:\\\\BHUSHAN\\\\SELENIUM\\\\chromederver_105\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		
		  this.takeSnapShot(driver, "c://test.png") ;   
	}

	
		
	
	
	public static void takeSnapShot (WebDriver webdriver,String fileWithPath) throws Exception {

   //FilesManegement filesManegement = new FilesManegement();
   //filesManegement.takeSnapShot(driver,"./Screenshots/googleA.jpg");
      //Call getScreenshotAs method to create image file
   TakesScreenshot scrShot1 =((TakesScreenshot)webdriver);

           File scrFile=scrShot1.getScreenshotAs(OutputType.FILE);

       //Move image file to new destination

           File DestFile=new File("./Screenshots/google1.jpg");
        System.out.println("destfile");
           //Copy file at destination

           Files.copy(scrFile, DestFile);
           
        
	}
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		
		//  this.takeSnapShot(driver, "c://test.png") ;   
		  TakesScreenshot scrShot1 =((TakesScreenshot)driver);

          File scrFile=scrShot1.getScreenshotAs(OutputType.FILE);

      //Move image file to new destination

          File DestFile=new File("./Screenshots/google1.jpg");
       System.out.println("destfile");
          //Copy file at destination

          Files.copy(scrFile, DestFile);
	//	Screenshot1
		
		
	}
}
