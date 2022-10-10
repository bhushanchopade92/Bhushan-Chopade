import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectableassignment {

	
	void dragdown(WebDriver driver) throws Exception
	{
		String url= "https://jqueryui.com/selectable/";
		driver.get(url);
		
		WebElement item= driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		driver.switchTo().frame(item);
		
		WebElement item1=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		
		WebElement item6=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]"));
		
		Actions action= new Actions(driver);
		
		action.dragAndDrop(item1, item6).build().perform();
		
		Thread.sleep(3500);
		
		
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3500);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		Selectableassignment obj = new Selectableassignment();
		obj.dragdown(driver);
		
		
	}

}
