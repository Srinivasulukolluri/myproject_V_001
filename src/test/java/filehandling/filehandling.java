package filehandling;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class filehandling {
	
	static File file =null;
  
	@Test
  public void inputdata() throws Exception {
  
      //WebDriver driver = new ChromeDriver();
      
      File file = new File("/Users/srinivasulukolluri/eclipse-workspace/demoblazeproject/excelldata/Testdata.xlsx");
      
      FileInputStream fis = new FileInputStream(file);
      
      XSSFWorkbook workbook = new XSSFWorkbook(fis);
      
      XSSFSheet sheet = workbook.getSheet("Sheet1");
      
      XSSFRow row = sheet.getRow(2);
      
      String Url = row.getCell(2).getStringCellValue();
      String username = row.getCell(3).getStringCellValue();
      String password = row.getCell(4).getStringCellValue();
      
      System.out.println("Url is " + Url);
      System.out.println("Username is " + username);
      System.out.println("Password is " + password);
      
     // System.setProperty("webdriver.driver.chromedriver","/Users/srinivasulukolluri/Downloads/chromedriver");
	 
      WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.demoblaze.com/");
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("login2")).click();
	driver.findElement(By.xpath("//div[@class='form-group']//input[@id='loginusername']")).sendKeys("username");
	driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("password");
	driver.findElement(By.xpath("//button[normalize-space()='Log in'][1]")).click();
	
	
	
	}		
	
	@Test
	
	public void writeexcelldata() throws Exception {
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		XSSFRow row = sheet.getRow(2);
		
		XSSFCell cell = row.createCell(5);
		
		FileOutputStream fos = new FileOutputStream(file);
		
		cell.setCellValue("edureka");
		
		workbook.write((fos));
		
		workbook.close();
		
		
		
	}
	
	
}
	
	


