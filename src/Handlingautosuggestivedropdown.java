import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingautosuggestivedropdown {

	

	   void openwebpage ( WebDriver driver)
	   {
		   String url =("https://www.zomato.com/");
		   driver.navigate().to(url);
		   driver.manage().window().maximize();
	
	
	
	   }
	   
	   void selecthotel(WebDriver driver)
	   {
		   WebElement searchbox= driver.findElement(By.xpath("//*[contains(text(),'Search for restaurant, cuisine or a dish')]"));
		   searchbox.click();
		   searchbox.sendKeys("biry");
		   
		   
	   }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub


			   
		   
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		Handlingautosuggestivedropdown obj = new Handlingautosuggestivedropdown();
		obj.openwebpage(driver);
		obj.selecthotel(driver);
		
	}

}
