import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqatest {
	
	public static void main(String[] args) {
		
		
		//Establish the connection between selenium and java
		System.out.println("establish connection between selenium and java");
		
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		System.out.println("launch website");
		
		WebDriver driver=  new ChromeDriver();
		System.out.println("step first in website");
		
		driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("userEmail")).sendKeys("charu@gmail.com");;
        driver.findElement(By.id("gender-radio-1")).click();
        driver.findElement(By.id("hobbiesWrapper")).click();
        driver.findElement(By.id("userNumber")).sendKeys("9999952320");
        
		
		
	}

}
