package Automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartwebsite {

	void openwebpage(WebDriver driver)
	{
	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	
}
	void websitelogin(WebDriver driver)
	{
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\\\BHUSHAN\\\\SELENIUM\\\\chromederver_105\\\\chromedriver_win32\\\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
	}
	
}