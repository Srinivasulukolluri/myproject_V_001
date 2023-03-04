import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runtestsonexistingsesiion {

	public static void main(String[] args) {
		
		//localhost path= /Applications/Google\ Chrome.app/Contents/MacOS/Google\ Chrome  --remote-debugging-port=9988 --user-data-dir=/Applications/Google\ Chrome.app/Contents/Chromedata 
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("debuggerAddress", "Localhost:64794");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		//driver.findElement(By.id("//input[@name='firstname']")).sendKeys("kolluri");
		//driver.findElement(By.name("firstname")).sendKeys("kolluri");
		//driver.findElement(By.name("lastname")).sendKeys("srinivas");
		
		
		

	}

}
