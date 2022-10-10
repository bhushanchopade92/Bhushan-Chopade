import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testfacebbokcreateacc {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
        driver.findElement(By.name("username")).sendKeys("dark435");
        driver.findElement(By.name("firstname")).sendKeys("viru");	
        driver.findElement(By.name("lastname")).sendKeys("patil");
        driver.findElement(By.id("input-email")).sendKeys("viru657@gmail.com");
        driver.findElement(By.id("input-country")).sendKeys("nepal");
        driver.findElement(By.name("password")).sendKeys("@72v66Zn1DqYsLXes88RZsdI7JDFW4lFT3Ah2Hy");
        driver.findElement(By.className("bg-info")).click();
        driver.findElement(By.className("btn btn-primary btn-lg hidden-xs")).click();
		
	}

}
