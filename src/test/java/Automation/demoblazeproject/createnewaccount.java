package Automation.demoblazeproject;
/**
 * Problem statement-verification ..creating new account
 * 
 * Test Scenario-new account created successfully
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createnewaccount {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.driver.chromedriver",
	        		"/Users/srinivasulukolluri/Downloads/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.demoblaze.com/");
	
			driver.findElement(By.xpath("//li[@class='nav-item']//a[normalize-space()='Sign up']")).click();
			driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='sign-username']")).sendKeys("edureka");
			driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='sign-password']")).sendKeys("edureka123");
			driver.findElement(By.xpath("//div[@class='modal-footer']//button[normalize-space()='Sign up']")).click();
			
			driver.switchTo().alert().accept();
			
             System.out.println("new accout created");
	}
	
	
}
