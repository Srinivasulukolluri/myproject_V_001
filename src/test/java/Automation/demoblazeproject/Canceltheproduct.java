package Automation.demoblazeproject;

import java.util.concurrent.TimeUnit;
/**
 * Problem statement-customer want to delete product from cart
 * Test Scenario-customer is logined to the demoblaze product added to the cart and deleted,loged out to the website succesfully 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canceltheproduct {

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
		
		driver.findElement(By.xpath("//div[@id='contcont']//a[4]")).click();
		

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='card-block']//a[normalize-space()='Apple monitor 24']")).click();

		Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='row']//a[normalize-space()='Add to cart']")).click();
        Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//li//a[@id='cartur']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody[@id='tbodyid']//a[normalize-space()='Delete']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
		
		System.out.println("item deleted an loged out successfully");
		
		driver.quit();

	}

}
