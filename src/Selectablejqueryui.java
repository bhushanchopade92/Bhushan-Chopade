import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectablejqueryui {
	void openwebpage(WebDriver driver)
	{
		String url="https://jqueryui.com/selectable/";
		driver.navigate().to(url);
		
		driver.manage().window().maximize();
	}
	void selectelement(WebDriver driver) throws Exception
	{
		
		WebElement myframe= driver.findElement(By.id("selectable"));
		
		driver.switchTo().frame(myframe);
		
		WebElement item1 =driver.findElement(By.xpath("//li[contains(text(),'Item1']']"));
		Thread.sleep(3000);
		WebElement item2 =driver.findElement(By.xpath("//li[contains(text(),'Item2']']"));
		Thread.sleep(3000);
		WebElement item3 =driver.findElement(By.xpath("//li[contains(text(),'Item3']']"));
		Thread.sleep(3000);
		WebElement item4 =driver.findElement(By.xpath("//li[contains(text(),'Item4']']"));
		Thread.sleep(3000);
		WebElement item5 =driver.findElement(By.xpath("//li[contains(text(),'Item5']']"));
		Thread.sleep(3000);
		WebElement item6 =driver.findElement(By.xpath("//li[contains(text(),'Item6']']"));
		Thread.sleep(3000);
		WebElement item7 =driver.findElement(By.xpath("//li[contains(text(),'Item7']']"));

		
	}
	
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		

		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		Selectablejqueryui obj = new Selectablejqueryui();
		obj.openwebpage(driver);
		obj.selectelement(driver);
		
	}

}
