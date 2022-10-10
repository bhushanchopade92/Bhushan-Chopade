package Guru99selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99formsubmit {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_103\\chromedriver.exe");
		
		System.out.println("hi launching  website");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		driver.navigate().to("http://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		
		WebElement email= driver.findElement(By.id("email"));
		
		WebElement password= driver.findElement(By.id("passwd"));
		
		WebElement loginbtn= driver.findElement(By.id("SubmitLogin"));
				
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		
		
		loginbtn.click();
		
		Thread.sleep(2500);
		
		System.out.println("login done with click");
		
		//using submit button to submit the form

		driver.navigate().to("http://demo.guru99.com/test/login.html");
		
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		
		driver.findElement(By.id("passwd")).sendKeys("abcdefghlkjl");
		
		driver.findElement(By.id("SubmitLogin")).submit();
		
		//selecting checkbox and isselected method 
		
		driver.navigate().to("http://demo.guru99.com/test/facebook.html");
		
		WebElement checkfbpersist=  driver.findElement(By.id("persist_box"));
		
		for(int i=0; i<2; i++)
		{
			checkfbpersist.click();
			
			System.out.println("facebook persist status is "+ checkfbpersist.isSelected());
			
			Thread.sleep(2000);
			
		}
		driver.close();
		
		
	}

}
