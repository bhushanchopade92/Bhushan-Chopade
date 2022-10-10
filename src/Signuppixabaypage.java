import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signuppixabaypage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://pixabay.com/accounts/register/?source=main_nav&next=%2F");
		
		driver.manage().window().maximize();

		driver.findElement(By.name("f-gc6194b776a65c40f45a8f70e9147d3bebe83f8a164e22faa40dd0ec191d8f1fd-username")).sendKeys("dark786");
		driver.findElement(By.name("f-gc6194b776a65c40f45a8f70e9147d3bebe83f8a164e22faa40dd0ec191d8f1fd-email")).sendKeys("santa554@protonmail.com");
		driver.findElement(By.id("register_password_field")).sendKeys("pW1pw99pJlVbUCnX#Pgp");
		driver.findElement(By.className("sign_up_button g-recaptcha pure-button button-green")).click();
	}

}
