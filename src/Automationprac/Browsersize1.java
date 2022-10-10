package Automationprac;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsersize1 {

	
	
	
		public static void main(String[] args) throws Exception
		{
			System.out.println("hi launch website");
			System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_104\\chromedriver.exe");
			
			System.out.println("hi launch website");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://chercher.tech/java/maximize-browser-size-window-selenium-webdriver");
			// below line maximizes the browser window
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			org.openqa.selenium.Dimension size= driver.manage().window().getSize();
			System.out.println("the size of the window"  + size);
			driver.close();
	
	
	
	
}
}