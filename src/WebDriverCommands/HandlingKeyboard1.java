package WebDriverCommands;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeyboard1 {
	

	void openwebpage (WebDriver driver)
	{
		String url="https://demoqa.com/text-box";
		driver.navigate().to(url);
		driver.manage().window().maximize();	
	}

	void Keyboard(WebDriver driver) throws Exception
	{
		WebElement txt= driver.findElement(By.id("userName"));
		txt.sendKeys("hi check text data");
		
		Actions actn= new Actions(driver);
		Thread.sleep(2500);
		
		//actn.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		actn.sendKeys(Keys.TAB).perform();
		Thread.sleep(2500);
		
		actn.keyDown(Keys.SHIFT).sendKeys("abcd").perform();
				
		
		Thread.sleep(2100);	
		
		
		driver.close();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		HandlingKeyboard1 obj = new HandlingKeyboard1();
		obj.openwebpage(driver);
		obj.Keyboard(driver);
		

	}

}
