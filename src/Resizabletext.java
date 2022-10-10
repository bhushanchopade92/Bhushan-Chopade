import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizabletext {


	void openwebpage(WebDriver driver)
	{
		String url="https://jqueryui.com/resizable/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	
	void resizable(WebDriver driver) throws Exception
	{
		WebElement myframe= driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(myframe);
		
		System.out.println("after frame");
		
		WebElement box= driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(box).dragAndDropBy(box, 100, 100).build().perform();
		Thread.sleep(4000);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		Resizabletext obj = new Resizabletext();
		obj.openwebpage(driver);
		obj.resizable(driver);

		driver.quit();
	}

}
