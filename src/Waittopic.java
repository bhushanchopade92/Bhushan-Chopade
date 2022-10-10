import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waittopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		//implicit wait      applied to whole class once initilased 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		WebElement checkbox= driver.findElement(By.xpath(""));
		
		//explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		wait.until(ExpectedConditions.elementToBeClickable(checkbox));
		
		
		
		

	}

}
