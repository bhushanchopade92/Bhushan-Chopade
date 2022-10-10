package Guru99selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99selectdropdown {

	
	void openwebpage(WebDriver driver)
	{
		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
	}
	void dropdown(WebDriver driver)
	{
		
		WebElement dropdown= driver.findElement(By.name("country"));
	
		Select selobj= new Select(dropdown);
		
		//selobj.selectByIndex(33);
	//	selobj.selectByValue("ARMENIA");
		selobj.selectByVisibleText("CAPE VERDE");
		selobj.deselectByVisibleText("CAPE VERDE");
			
	}
	  public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_103\\chromedriver.exe");
		
		System.out.println("hi launching  website");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		Guru99selectdropdown obj = new Guru99selectdropdown();
		obj.openwebpage(driver);
		obj.dropdown(driver);	
	}

}
