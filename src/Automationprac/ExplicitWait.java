package Automationprac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExplicitWait {

	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_104\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://gmail.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MILLISECONDS);	
	}
	
	@Test
	public void test()
	{
		WebElement username = driver.findElement(By.id("Email"));
		 
        // entering username
        username.sendKeys("shruti.shrivastava.in");

        // entering password
        driver.findElement(By.id("Passwd")).sendKeys("password");

        // clicking signin button
        driver.findElement(By.id("signIn")).click();

        // explicit wait - to wait for the compose 
		
		
		
	}
	
	
	
	
	
	
	
	
	
}




