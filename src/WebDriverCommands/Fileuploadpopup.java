package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\Admin\\Desktop\\AAY6dnV.jpg");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
