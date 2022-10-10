package Guru99selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99demo {

	void openwebpage(WebDriver  driver)
	{
		driver.navigate().to("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
	}
	
	void handlewebpage(WebDriver  driver)
	{
		
		String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        
        actualTitle = driver.getTitle();

        
        
        if( actualTitle.contentEquals(expectedTitle))
        {
        	System.out.println("test passed");
        }
        else
        {
        	System.out.println("test failed!");
        }
		
		
		
	}
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_104\\chromedriver.exe");
		System.out.println("launch website");
		
		WebDriver driver=  new ChromeDriver();
		System.out.println("step first in website");
		
		Guru99demo obj= new Guru99demo();
		obj.openwebpage(driver);
		obj.handlewebpage(driver);
	}
	
	
	
}
