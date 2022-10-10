import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlenewtab {

	
	void openwebpage(WebDriver driver)
	{
		
		String url="https://rahulshettyacademy.com/AutomationPractice/";
		driver.navigate().to(url);
		driver.manage().window().maximize();	
	}
	
	    void tabhandle(WebDriver driver) throws InterruptedException
	    {
	    	String firsttab= driver.getWindowHandle();
	    	
	    	WebElement Tab= driver.findElement(By.id("opentab"));
	    	Tab.click();
	    	
	    	Set<String> opentabs=driver.getWindowHandles();
	    	
	    	Iterator itr= opentabs.iterator();
	    	
	    	while(itr.hasNext())
	    	{
	    		String newtab=(String)itr.next();
	    		if(!firsttab.equalsIgnoreCase(newtab))
	    		{
	    			driver.switchTo().window(newtab);
	    			Thread.sleep(1500);
	    			WebElement login=driver.findElement(By.xpath("//a[contains(@href,'https://courses.rahulshettyacademy.com')]"));
	    			login.click();
	    			
	    		}
	    	}
	    	
	    	
	    }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
         
		Handlenewtab obj = new Handlenewtab();
		obj.openwebpage(driver);
		obj.tabhandle(driver);
		
	
	}

}
