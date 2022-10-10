import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlecheckboxtextbutton {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		//to view in full screen use below feature
		
		driver.manage().window().maximize();
		
		WebElement firstname =driver.findElement(By.xpath("//*[contains(@id,'firstName')]"));
		
		firstname.sendKeys("jay");
		
		WebElement gender= driver.findElement(By.id("gender-radio-1"));
		
		gender.click();
		
		WebElement hobby = driver.findElement(By.id("hobbies-checkbox-1"));
		
		hobby.click();
		
		
	}

}
