package googletest;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class googlesearch {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("demoblaze");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']")).click();
		
        java.util.List<WebElement> allSuggestions = driver.findElements(By.xpath("//a"));

        for (WebElement suggestion : allSuggestions) {

        System.out.println(suggestion.getText());

}

	}
}
