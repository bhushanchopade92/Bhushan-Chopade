package Automationprac;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class LamdaTestUploadFile {

	private RemoteWebDriver driver;

	//Upload Files In Selenium WebDriver Over Local Infrastructure
	//Below is a Selenium Java testing script which demonstrates how to upload files in Selenium WebDriver over your local machine.
	    @SuppressWarnings("deprecation")
		@BeforeClass
	
	    public void setUp() throws Exception {
	
	
	        System.setProperty("webdriver.chrome.driver", "I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_104\\chromedriver.exe");

	
	        driver = new ChromeDriver();
	
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	    }
	
	
	    @Test
	
	    public void lamdaTest() throws Exception {
	
	        driver.get("https://blueimp.github.io/jQuery-File-Upload/");
	
	      Thread.sleep(2000);
	
	        WebElement addFile = driver.findElement(By.xpath(".//input[@type='file']"));
	
	        addFile.sendKeys("C:\\Users\\Admin\\Pictures\\Saved Pictures\\YournewTVC.png");
	
	        
	
	        driver.findElement(By.xpath(".//span[text()='Start upload']")).click();
	
	
	       Thread.sleep(2000);
	
	        if(driver.findElement(By.xpath(".//a[text()='YournewTVC.png']")).isDisplayed()) {
	
	            assertTrue(true, "Image Uploaded");
	
	        }else {
	
	            assertTrue(false, "Image not Uploaded");
	
	        }
	
	    }
	
	    
	
	
	    @AfterClass
	
	    public void tearDown() throws Exception {
	
	        driver.quit();
	
	    }
	
	}
	
	
	
	
	
	
	
	
	

