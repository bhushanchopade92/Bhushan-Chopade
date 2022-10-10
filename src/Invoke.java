import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoke {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Establish the connection between selenium and java
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver", "I:\\BHUSHAN\\SELENIUM\\chromederver_105\\chromedriver_win32\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver  driver = new ChromeDriver();
		
		System.out.println("hi launch website");
		
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@id='u_0_0_UT']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("suhas");
		driver.findElement(By.name("lastname")).sendKeys("joshi");
		driver.findElement(By.name("reg_email__")).sendKeys("suhasjoshi@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("suhasjoshi@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("CUU#BxD5t9TBLt4Qh6p@pERSZRBYz6Jsvg2th9d");
		driver.findElement(By.name("birthday_day")).sendKeys("20");
		driver.findElement(By.name("birthday_month")).sendKeys("june");
		driver.findElement(By.name("birthday_year")).sendKeys("1987");
		driver.findElement(By.tagName("label")).sendKeys("male");
		
		
		

	}


}
