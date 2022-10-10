package Guru99selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99handlealert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		
		String alertmesssage="";
		
		driver.navigate().to("http://jsbin.com/usidix/1");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/input[1]")).click();
		
		Thread.sleep(3000);
		alertmesssage	=driver.switchTo().alert().getText();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		System.out.println(alertmesssage);
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}

}
