import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchwebsitewix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "I:\\\\BHUSHAN\\\\SELENIUM\\\\chromedriver_win32_102\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://users.wix.com/signin?loginCompName=Get%20Started%20F1&view=sign-up&sendEmail=true&referralInfo=Get%20Started%20F1&postLogin=https:%2F%2Fwww.wix.com%2Fmy-account%2Fsites&forceRender=true");
		
		
		
		
		

	}

}
