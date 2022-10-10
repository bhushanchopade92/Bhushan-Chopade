package WebDriverCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingcalendaedemoqa {
	
	void openwebpage(WebDriver driver)
	{
		String url="https://demoqa.com/automation-practice-form";
		driver.navigate().to(url);
		driver.manage().window().maximize();	
	}
	void Calender(WebDriver driver) throws InterruptedException
	{
		WebElement cal= driver.findElement(By.id("dateOfBirthInput"));
		cal.click();
		WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
		Select select = new Select(monthDropdown);
		select.selectByVisibleText("May");
		Thread.sleep(2000);
		
		/*if(driver.findElements(By.xpath("//select[@class='react-datepicker__year-select']")).size()>0) {
			driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();;
		}*/
		Thread.sleep(2000);
		WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
		Select selectYear = new Select(yearDropdown);
		selectYear.selectByValue("1992");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='20']")).click();
		Thread.sleep(2000);
		
		
		//WebElement nxtBtn= driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/button[2]"));
		
		//WebElement month= driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		
		//String mon= month.getText();
		//System.out.println(mon);
		
		/*while(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")).getText().equalsIgnoreCase("May 2023"))
		{
			
			WebElement nxtBtn= driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/button[2]")); 
			Thread.sleep(2000);
		}
		
		 WebElement day= driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[4]"));
		 
		 for(WebElement i: day)
		 {
			 
			 if(i.getText().equalsIgnoreCase("20"));
			 {
				 i.click();
				 
			 }
		 }*/
		 
		 
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.out.println("hi launch website");
		System.setProperty("webdriver.chrome.driver","I:\\BHUSHAN\\SELENIUM\\chromedriver_win32_102\\chromedriver.exe");
		
		System.out.println("hi launch website");
		
		WebDriver driver = new ChromeDriver();
		
		
		Handlingcalendaedemoqa obj= new Handlingcalendaedemoqa();
		obj.openwebpage(driver);
		obj.Calender(driver);
		
		Thread.sleep(2000);
		driver.close();
	}

}
