package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlescrollassignmnt {


	void openwebpage(WebDriver driver)
	{
       driver.navigate().to("https://www.google.com/");		
		
       driver.manage().window().maximize();
			
	}
	
	void clickonlink(WebDriver driver) throws Exception
	{
		WebElement serach= driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		serach.sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		WebElement next=driver.findElement(By.id("pnnext"));
		Thread.sleep(2000);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", next);
		Thread.sleep(2000);
        next.click();
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		Handlescrollassignmnt obj = new Handlescrollassignmnt();
		obj.openwebpage(driver);
		obj.clickonlink(driver);
	}

}
