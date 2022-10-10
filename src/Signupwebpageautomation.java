import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signupwebpageautomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email_create")).sendKeys("bhushanchopade92@gmail.com");
		
		driver.findElement(By.id("SubmitCreate")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//h1[text()='Create an account']")).isDisplayed();
		
		driver.findElement(By.id("id_gender1")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.id("customer_firstname")).sendKeys("harish");
		
		Thread.sleep(6000);
		
		driver.findElement(By.id("customer_lastname")).sendKeys("rav");
		
		
		
		Thread.sleep(6000);
		
		driver.findElement(By.name("passwd")).sendKeys("i6ZZ21PLi4eKyogJevN1UFa6@px3");
		Thread.sleep(6000);
		driver.findElement(By.id("days")).sendKeys("15");
		
		driver.findElement(By.name("months")).sendKeys("june");
		
		driver.findElement(By.name("years")).sendKeys("1984");
		
		
		
		Thread.sleep(6000);
		
		driver.findElement(By.id("address1")).sendKeys("sr no 87/2, vishal society,tilak road,florida");
		
		driver.findElement(By.name("city")).sendKeys("florida");
		Thread.sleep(6000);
		
		driver.findElement(By.id("id_state")).sendKeys("florida");
		Thread.sleep(6000);
		
		driver.findElement(By.id("postcode")).sendKeys("32118");
		driver.findElement(By.id("id_country")).sendKeys("United states");
		
		driver.findElement(By.name("phone")).sendKeys("4073729175");
		Thread.sleep(6000);
		
		driver.findElement(By.name("phone_mobile")).sendKeys("9996662250");
		
		driver.findElement(By.id("alias")).sendKeys("newyork");
		
		driver.findElement(By.id("submitAccount")).click();
		
		driver.findElement(By.className("sf-with-ul")).click();
		
		

	}

}
