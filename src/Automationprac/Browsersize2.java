package Automationprac;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsersize2 {

	
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
		
		driver.manage().window().setSize(new Dimension(200,200));
		
		org.openqa.selenium.Dimension size= driver.manage().window().getSize();
		System.out.println("the size of the window"  + size);
		
		int height= driver.manage().window().getSize().getHeight();
		System.out.println("The height of the window by height variable : "+height);
		
		int width= driver.manage().window().getSize().getWidth();
		System.out.println("The height of the window by getWidth() variable : "+width);
		
		int height2= driver.manage().window().getSize().height;
		System.out.println("The height of the window by height variable : "+height2);
		
		driver.close();
	
}
}