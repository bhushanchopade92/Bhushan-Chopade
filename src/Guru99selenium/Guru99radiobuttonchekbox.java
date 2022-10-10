package Guru99selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99radiobuttonchekbox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_103\\chromedriver.exe");
		
		System.out.println("hi launching  website");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		driver.navigate().to("http://demo.guru99.com/test/radio.html");
		
		WebElement radiobtn1= driver.findElement(By.id("vfb-7-1"));
		WebElement radiobtn2= driver.findElement(By.id("vfb-7-2"));
		WebElement radiobtn3= driver.findElement(By.id("vfb-7-3"));
		
		radiobtn1.click();
		System.out.println("radio buttin 1 is selected");
		
		radiobtn2.click();
		System.out.println("radio button 2 is selected");
		
		radiobtn3.click();
		System.out.println("radio button 3 is selected");
		
		//selecting checkbox
		
		WebElement checkbox1= driver.findElement(By.id("vfb-6-0"));
		WebElement checkbox2=driver.findElement(By.id("vfb-6-1"));
		WebElement checkbox3= driver.findElement(By.id("vfb-6-2"));
		
		checkbox1.click();
		if(checkbox1.isSelected())
		{
			System.out.println("value is true");
		}
		else
		{
			System.out.println("value is false");
		}
		
		
		
		
		
		
		
		
	}

}
