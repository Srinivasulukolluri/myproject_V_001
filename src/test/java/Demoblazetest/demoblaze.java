package Demoblazetest;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import genericlib.webdrivercommonlib;

public class demoblaze {
	
	webdrivercommonlib webLib = new webdrivercommonlib();
	
	 WebDriver driver;
	 
  @Test(priority = 1, enabled = true)
  public void firsttest() throws Exception{
  
	  WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("demoblaze");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']")).click();
		
		Thread.sleep(3000);
		
        java.util.List<WebElement> allSuggestions = driver.findElements(By.xpath("//a"));

        for (WebElement suggestion : allSuggestions) {

         System.out.println(suggestion.getText());

     
      
}
	  	 	  
  }
 
      
@Test(priority = 2,enabled = true)
public void purchasetest() throws Exception {
	
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

@Test(priority = 3,enabled = true)
public void cancelltheproducttest() throws Exception {

	
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

@Test(priority = 4,enabled = true)

public void contacttest() throws Exception {
		
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
		driver.quit();
}


@Test(priority = 5, enabled = true)
public void createnewaccouttest() {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		webdrivercommonlib.capturescreenshot(driver, "sceenshot");

		driver.findElement(By.xpath("//li[@class='nav-item']//a[normalize-space()='Sign up']")).click();
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='sign-username']")).sendKeys("edureka");
		driver.findElement(By.xpath("//div[@class='modal-body']//input[@id='sign-password']")).sendKeys("edureka123");
		driver.findElement(By.xpath("//div[@class='modal-footer']//button[normalize-space()='Sign up']")).click();
		
		driver.switchTo().alert().accept();
		
         System.out.println("This user already exist");
         
         driver.switchTo().alert().accept();
     
         driver.quit();

}
@After
public void aftermethod(ITestResult result)

{
if(ITestResult.FAILURE==result.getStatus());
{

	 webdrivercommonlib.capturescreenshot(driver, result.getName());
   
}  
  driver.quit();
}

}
  

  

