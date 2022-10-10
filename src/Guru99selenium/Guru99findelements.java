package Guru99selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99findelements {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_104\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		driver.navigate().to("http://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		
		List<WebElement>  elements= driver.findElements(By.name("name"));
		
		System.out.println("Number of elements" + elements.size());
		
		for(int i=0; i <elements.size() ;i++) {
			
			System.out.println(  "radio button text"  + elements.get(i).getAttribute("value"));
			
			Thread.sleep(2500);
			driver.close();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
