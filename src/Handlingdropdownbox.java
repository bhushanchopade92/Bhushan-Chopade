import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingdropdownbox {
	
	
	void openwebpage(WebDriver driver)
	{
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		
	}
    
	void dropdownmethod(WebDriver driver)
	{
		
		WebElement dropdown=  driver.findElement(By.xpath("//select[contains(@id,'dropdown-class-example')]"));
		
		Select selobj= new Select(dropdown);
		
	 //   selobj.selectByIndex(2);
		
	//	  selobj.selectByValue("option3");
		  
		  selobj.selectByVisibleText("Option1");
	}
	
	void closewebpage(WebDriver driver) throws Exception 
	{
		
		Thread.sleep(3000);
		
	     driver.close();
		
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		

		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		Handlingdropdownbox obj = new Handlingdropdownbox();
		obj.openwebpage(driver);
		obj.dropdownmethod(driver);
		obj.closewebpage(driver);
		
		
		
		
		
		
		
		
	}

}
