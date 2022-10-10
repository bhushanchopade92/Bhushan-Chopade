import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddroptest {
	
	
	
	
	void openwebpage(WebDriver driver)
	
	{
	   String url="http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html";
	   driver.navigate().to(url);
	   driver.manage().window().maximize();	
	}
	
	void draganddrop(WebDriver driver)
	{
		WebElement smallbox1= driver.findElement(By.id("box1"));
		WebElement smallbox2= driver.findElement(By.id("box2"));
		WebElement smallbox3= driver.findElement(By.id("box3"));
		WebElement smallbox4= driver.findElement(By.id("box4"));
		
		WebElement bigbox1= driver.findElement(By.id("dropBox"));
		WebElement bigbox2= driver.findElement(By.id("dropBox2"));
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(smallbox1, bigbox1).build().perform();
		act.dragAndDrop(smallbox2, bigbox1).build().perform();
		act.dragAndDrop(smallbox3, bigbox1).build().perform();
		act.dragAndDrop(smallbox4, bigbox1).build().perform();
		act.dragAndDrop(smallbox4, bigbox2).build().perform();
		
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\\\\\\\BHUSHAN\\\\\\\\SELENIUM\\\\\\\\chromederver_105\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		
		Draganddroptest obj = new Draganddroptest();
		obj.openwebpage(driver);
		obj.draganddrop(driver);
		
            Thread.sleep(2000);
            driver.close();
	}

}
