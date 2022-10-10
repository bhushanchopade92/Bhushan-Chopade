import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingmouseassignmentselectable {

	void openwebpage(WebDriver driver)
	{
		
		String url ="https://jqueryui.com/selectable/";
		
		driver.navigate().to(url);
		
		driver.manage().window().maximize();	
		
	}
	
	void selectelement(WebDriver driver)
	{
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();

	}

}
