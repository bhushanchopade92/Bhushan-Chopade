import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlecheckboxtextboxradiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		WebElement frame= driver.findElement(By.id("firstName"));
		
		frame.sendKeys("arav");
		
		Thread.sleep(3000);
		
		WebElement gender= driver.findElement(By.id("gender-radio-1"));
		
		gender.click();
		
		Thread.sleep(3000);
		
		WebElement hobby= driver.findElement(By.xpath("//label[@class='custom-control-label' and @ for='hobbies-checkbox-2']"));
		
		hobby.click();
		
		
	}

}
