package Automationprac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {
	
	
	public static void main(String[] args) throws Exception
	{
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\\\BHUSHAN\\\\SELENIUM\\\\chromederver_105\\\\chromedriver_win32\\\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://chercher.tech");
		
		driver.manage().window().maximize();
		
		System.out.println("Page title is "+   driver.getTitle());
		
		System.out.println("Page source is "  + driver.getPageSource());
		
		System.out.println( " The url of the current page is " +  driver.getCurrentUrl());
	
	
	    WebElement element = driver.findElement(By.xpath("//a[text()='Videos']"));
	    
	    element.click();
	    
	    Thread.sleep(2000);
	    
	   
	    Thread.sleep(2000);
	    
	    WebElement element2= driver.findElement(By.xpath("//div[@class='vid-details']//h1[text()='Rajinikanth Super Scene | Tamil Super Scene | Thalapathi Scenes | Bhanupriya | Mani Ratnam']"));
	    Thread.sleep(2000);
	  //  System.out.println( " The url of the current page is " +  driver.getCurrentUrl());
	    
	  //  driver.switchTo().alert().dismiss();
	    element2.click();
	    Thread.sleep(10000);
	    System.out.println( " The url of the current page is " +  driver.getCurrentUrl());
	    
	    driver.close();
	
	
	
	
	
	
	

}
}