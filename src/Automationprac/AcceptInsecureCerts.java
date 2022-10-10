package Automationprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AcceptInsecureCerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hi launch website");
		ChromeOptions co= new ChromeOptions();
		co.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver","I:\\\\BHUSHAN\\\\SELENIUM\\\\chromedriver_win32_104\\\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.navigate().to("https://www.cacert.org/");
		Thread.sleep(2000);
		
		

}
}