package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlescrollbarmanual {

	
	void openwebpage (WebDriver driver)
	{
		String url="https://www.redbus.in/";
		driver.navigate().to(url);
		driver.manage().window().maximize();	
	}
	
	void clickonlink(WebDriver driver) throws Exception
	{
		WebElement vrl= driver.findElement(By.xpath("//a[contains(text(),'VRL Travels')]"));
		vrl.click();
		
		Thread.sleep(3100);
		
		
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		Handlescrollbarmanual obj = new Handlescrollbarmanual();
		obj.openwebpage(driver);
		obj.clickonlink(driver);
	}

}
