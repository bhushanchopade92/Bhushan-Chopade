import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebsitetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=A6F222B5F3564FFBF35CE57E9650D991");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("customer.firstName")).sendKeys("vishal");
		
		driver.findElement(By.name("customer.lastName")).sendKeys("rav");
		
		driver.findElement(By.name("customer.address.street")).sendKeys("sr no 56/3,patil estate,tilak road");
		Thread.sleep(1000);
		driver.findElement(By.name("customer.address.city")).sendKeys("seoul");
		
		driver.findElement(By.name("customer.address.state")).sendKeys("mahim");
		driver.findElement(By.name("customer.address.zipCode")).sendKeys("411041");
		driver.findElement(By.name("customer.phoneNumber")).sendKeys("03042153210");
		
		driver.findElement(By.name("customer.username")).sendKeys("dark9876");
		
		driver.findElement(By.name("customer.password")).sendKeys("kJnArgUXSjCuImAEKy");
		Thread.sleep(1000);
		
		driver.findElement(By.name("repeatedPassword")).sendKeys("kJnArgUXSjCuImAEKy");
		
		driver.findElement(By.className("button")).click();
		
		
		
		
		
		
	}

}
