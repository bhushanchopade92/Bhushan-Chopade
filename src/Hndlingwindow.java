import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hndlingwindow {
	
	
	void openwebpage(WebDriver driver)
	{
		String url="https://rahulshettyacademy.com/AutomationPractice/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
			
	}

	  void handlewindow(WebDriver driver)
	  {
		  String mainwinhandle= driver.getWindowHandle();
		  
		  String mainwintitle= driver.getTitle();
		  System.out.println(mainwintitle);
		  
		  WebElement newwinbtn= driver.findElement(By.id("openwindow"));
		  newwinbtn.click();
		  
		  Set<String> openWindows = driver.getWindowHandles();
		  
	     Iterator itr= openWindows.iterator();
	     
	     while(itr.hasNext())
	     {
	    	 String newOpeenWindow = (String) itr.next(); //child window	
	    	 
	    	 if( !mainwinhandle.equalsIgnoreCase(newOpeenWindow))
	    	 {
	    		driver.switchTo().window(newOpeenWindow);
	    		String newWintitle=driver.getTitle();
	    		System.out.println(newWintitle);
	    		
	    		
	    		 
	    	 } 
	     }
	  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
		
		Hndlingwindow obj = new Hndlingwindow();
		obj.openwebpage(driver);
		obj.handlewindow(driver);
	}

}
