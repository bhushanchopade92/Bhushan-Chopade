import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hndlingmouse {

	      void openwebpage(WebDriver driver)
	      {
	    	  String url=  "https://jqueryui.com/droppable/";
	    	  
	    	  driver.navigate().to(url);
	    	  
	    	  driver.manage().window().maximize();
	    	   }
	      
	      void draganddrop(WebDriver driver) throws InterruptedException
	      
	      {
	    	  
	    	  WebElement myframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	    	  
	    	  driver.switchTo().frame(myframe);
	    	  
	    	  WebElement smallbox = driver.findElement(By.id("draggable"));
	    	  
	    	  WebElement bigbox =  driver.findElement(By.id("droppable"));
	    	  
	    	  Actions actn= new Actions(driver);
	    	  
	    	  
	    	  actn.dragAndDrop(smallbox, bigbox).build().perform();
	    	  
	    	  
	    	  Thread.sleep(3000);
	    	  
	    	driver.close();  
	    	  
	      }

	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		Hndlingmouse obj = new Hndlingmouse();
		obj.openwebpage(driver);
		obj.draganddrop(driver);
		
		
	}

}
