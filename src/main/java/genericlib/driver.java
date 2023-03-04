package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.constants;

public class driver {
	
	public static WebDriver driver;
	
	static String projectpath = System.getProperty("user.dir") + "\"/Users/srinivasulukolluri/Downloads/chromedriver";
	
	
	public static void getBrowser(){

		
		if (constants.browser.equals("chrome"));{
	System.setProperty("webdriver.driver.chromedriver", "/Users/srinivasulukolluri/Downloads/chromedriver");
	
	WebDriver driver = new ChromeDriver();

}
}
}