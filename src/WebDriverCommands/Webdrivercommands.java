package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivercommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");  //open the url
		
	    System.out.println(driver.getTitle());	    // return title of page
	    
	    System.out.println( driver.getCurrentUrl());
	  String text=  driver.findElement(By.xpath("//*[@id=\"main\"]/form/label/span[2]/input")).getText();
	  
	     System.out.println(text);
	     
	    // driver.close();
	     driver.quit();
		

	}

}
