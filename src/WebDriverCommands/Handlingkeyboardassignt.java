package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingkeyboardassignt {

	void openwebpage(WebDriver driver)
	{
       driver.navigate().to("https://demoqa.com/text-box");		
		
       driver.manage().window().maximize();
			
	}
	
	void keyBoard(WebDriver driver) throws Exception
	{
		WebElement currebtaddress= driver.findElement(By.id("currentAddress"));
		currebtaddress.sendKeys("30 Tilak Road Sai Aprtment Pune ");
		
		Actions actn= new Actions(driver);  //creare object of action class
		Thread.sleep(2100);
		// Select the Current Address using CTRL + A
		/*actn.keyDown(Keys.CONTROL).perform();
		actn.sendKeys("c").perform();
		actn.keyUp(Keys.CONTROL).perform();
		
		actn.sendKeys(Keys.TAB).perform();
		
		Thread.sleep(2100);
		
		actn.keyDown(Keys.CONTROL).perform();
		actn.sendKeys("v").perform();
		actn.keyUp(Keys.CONTROL).perform();
		Thread.sleep(2100);*/

		
		// Select the Current Address using CTRL + A
      /*  actn.keyDown(Keys.CONTROL);
        actn.sendKeys("a");
        actn.keyUp(Keys.CONTROL);
        actn.build().perform();
        
        // Copy the Current Address using CTRL + C
        actn.keyDown(Keys.CONTROL);
        actn.sendKeys("c");
        actn.keyUp(Keys.CONTROL);
        actn.build().perform();
        
        //Press the TAB Key to Switch Focus to Permanent Address
        actn.sendKeys(Keys.TAB);
        actn.build().perform();
        
        //Paste the Address in the Permanent Address field using CTRL + V
        actn.keyDown(Keys.CONTROL);
        actn.sendKeys("v");
        actn.keyUp(Keys.CONTROL);
        actn.build().perform();*/
		
		  // Select the Current Address
		actn.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        
        // Copy the Current Address
		actn.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        
        //Press the TAB Key to Switch Focus to Permanent Address
		actn.sendKeys(Keys.TAB).build().perform();
        
        //Paste the Address in the Permanent Address field
		actn.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		Handlingkeyboardassignt obj = new Handlingkeyboardassignt();
		obj.openwebpage(driver);
		obj.keyBoard(driver);
		
	}

}
