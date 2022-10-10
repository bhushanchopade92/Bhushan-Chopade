import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slidermethod {

	void openwebpage(WebDriver driver)
	{
		String url="https://jqueryui.com/slider/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
	}
	  void slider(WebDriver driver)
	  {
		  driver.switchTo().frame(0);
		  WebElement slider= driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		  
		  Actions act = new Actions(driver);
		  
		  act.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();
				  
		  
	  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\\\BHUSHAN\\\\SELENIUM\\\\chromederver_105\\\\chromedriver_win32\\\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		Slidermethod obj = new Slidermethod();
		obj.openwebpage(driver);
		obj.slider(driver);

	}

}
