import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waitprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		// impicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//explicit wait
		
		//WebDriverInfo  wait = new WebDriverInfo(driver,);
		

	}

}
