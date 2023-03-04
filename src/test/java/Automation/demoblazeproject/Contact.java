package Automation.demoblazeproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact {

	public static void main(String[] args) throws Exception {
		
		 System.setProperty("webdriver.driver.chromedriver",
	        		"/Users/srinivasulukolluri/Downloads/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.demoblaze.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("login2")).click();
			driver.findElement(By.xpath("//div[@class='form-group']//input[@id='loginusername']")).sendKeys("srinivas123");
			driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("mynameissrinivas");
			driver.findElement(By.xpath("//button[normalize-space()='Log in'][1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='navbar-collapse']//a[contains(text(),'Contact')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='recipient-email']")).sendKeys("srinivask@gmail.com");
			driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='recipient-name']")).sendKeys("srinivask");
			driver.findElement(By.xpath("//div[@class='modal-body']//textarea[@id='message-text']")).sendKeys("my order received thank you");
			driver.findElement(By.xpath("//div[@class='modal-footer']//button[normalize-space()='Send message']")).click();
			
			driver.switchTo().alert().accept();
			
			System.out.println("thanks for the message");
	}

}
