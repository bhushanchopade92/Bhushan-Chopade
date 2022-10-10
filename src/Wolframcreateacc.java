import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wolframcreateacc {

	public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				
				//Establish the connection between selenium and java
				System.out.println("hi launch website");
				System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
				
				System.out.println("hi launch website");
				
				WebDriver  driver = new ChromeDriver();
				
				System.out.println("hi launch website");
				
				driver.get("https://account.wolfram.com/login/create");
				
				
				driver.findElement(By.name("email")).sendKeys("suhasjoshi@gmail.com");
				driver.findElement(By.name("firstName")).sendKeys("vishal");
				driver.findElement(By.name("lastName")).sendKeys("joshi");
				driver.findElement(By.name("password")).sendKeys("SIh5X39L6svDVxqdD3vkvtR2gIujq9kdh2E0ecP");
				driver.findElement(By.name("passwordConfirm")).sendKeys("SIh5X39L6svDVxqdD3vkvtR2gIujq9kdh2E0ecP");
				driver.findElement(By.name("accountAgreement")).click();
				driver.findElement(By.id("create-id-btn")).click();
				
		
	}

}
