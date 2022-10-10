package Guru99selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99radiobutton {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_103\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		driver.navigate().to("http://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		
		
		driver.findElement(By.id("no")).click();
		Thread.sleep(2500);
		
		driver.findElement(By.id("buttoncheck")).click();
		System.out.println(" element no is clicked");
		
		driver.close();
		
		
		

	}

}
