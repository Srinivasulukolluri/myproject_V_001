package Automation.demoblazeproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Problem statement-new customer want to purchase a item from demoblaze
 * test scinario-customer logined to accout and purchased the mobile.
 *
 * @author srinivasulu kolluri
 */
public class Purchase {
	
	static Alert alert;

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.driver.chromedriver", "/Users/srinivasulukolluri/Downloads/chromedriver");
		
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
		
		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Srinivas");
		driver.findElement(By.id("country")).sendKeys("usa");
		driver.findElement(By.id("city")).sendKeys("plesanton");
		driver.findElement(By.id("card")).sendKeys("1234098712376543");
		driver.findElement(By.id("month")).sendKeys("march");
		driver.findElement(By.id("year")).sendKeys("2025");
		
		driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='sa-confirm-button-container']//button[normalize-space()='OK']")).click();
		
		System.out.println("order placed successfully");
		
		driver.quit();
	}

}
