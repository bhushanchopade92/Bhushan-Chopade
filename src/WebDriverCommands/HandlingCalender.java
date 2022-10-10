package WebDriverCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender {
	
	void openwebpage(WebDriver driver)
	{
		String url="https://www.redbus.in/";
		driver.navigate().to(url);
		driver.manage().window().maximize();

	}
	
	void Calender(WebDriver driver) throws Exception
	{
		
		WebElement cal= driver.findElement(By.id("onward_cal"));
		cal.click();
	//	WebElement nextBtn= driver.findElement(By.xpath("//*[@class='next']"));
	//	WebElement month= driver.findElement(By.xpath("//*[@class='monthTitle']"));
		
	//	String mon = month.getText();
	//	System.out.println(month);
		
		while(! driver.findElement(By.xpath("//*[@class='monthTitle']")).getText().equalsIgnoreCase("Dec 2022"))
		{
			
			WebElement nextbtn=driver.findElement(By.xpath("//*[@class='next']"));
			nextbtn.click();
			
			Thread.sleep(2000);
			
		}
		
		List<WebElement> day= driver.findElements(By.xpath("//*[contains(@class,'day')]"));
		
		for(WebElement i :day)
		{    
			if(i.getText().equalsIgnoreCase("4"))
			{
				i.click();
			}
			
		}
		Thread.sleep(2000);
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		HandlingCalender obj = new HandlingCalender();
		obj.openwebpage(driver);
		obj.Calender(driver);
		
		driver.quit();

	}

}
