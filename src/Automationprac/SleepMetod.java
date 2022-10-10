package Automationprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepMetod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\\\BHUSHAN\\\\SELENIUM\\\\chromedriver_win32_104\\\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://youtu.be/5z_SPHwspo8");
		WebElement element = driver.findElement(By.xpath("//button[contains(@class,'ytp-play-button')]"));
		
		element.click();
		
		Thread.sleep(20000);
		
		driver.close();
		
		
	}

}
