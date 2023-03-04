package genericlib;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class webdrivercommonlib {

	public static WebDriver driver;
	public static webdrivercommonlib wlib = new webdrivercommonlib();	
	
	public static void capturescreenshot(WebDriver driver, String demoblaze) {
			
			try
			{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/"+demoblaze+ " pmg"));
			System.out.println("screeshot taken");
		}
			catch(Exception e)
			{
				System.out.println("Exception while taking screenshot"+e.getMessage());

				driver.quit();
			}

		}
	
	
}
