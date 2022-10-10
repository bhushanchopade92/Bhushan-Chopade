import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingdropdownboxcountry {
	
	
	void openwebpage(WebDriver driver)
	{
       driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");		
		
       driver.manage().window().maximize();
			
	}
	
	void dropdownmethod(WebDriver driver)
	{
		//WebElement dropdown = driver.findElement(by.)
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		

	}

}
