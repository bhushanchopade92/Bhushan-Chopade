package Automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	

	public static void main(String[] args) throws Exception
	{
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_104\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://chercher.tech/java/navigation-selenium-webdriver");
		
		driver.navigate().to("https://gmail.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.close();
	
	
	
	
	
}
}