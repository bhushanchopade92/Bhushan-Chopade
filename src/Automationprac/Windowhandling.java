package Automationprac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {


	public static void main(String[] args) throws Exception
	{
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_104\\chromedriver.exe");
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
	WebElement element =	driver.findElement(By.name("q"));
	element.sendKeys("pizza");
	
	driver.findElement(By.name("btnK")).click();
	
	WebElement pizzanearme=driver.findElement(By.xpath("//b[text()='near me home delivery']/parent::div/parent::a"));
	
	JavascriptExecutor je = (JavascriptExecutor) driver;
    //
	
	je.executeScript("arguments[0].scrollIntoview();", pizzanearme);
	
	Thread.sleep(2000);
	
	driver.close();
		
}
}