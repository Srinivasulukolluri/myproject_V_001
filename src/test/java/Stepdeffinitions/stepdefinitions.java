package Stepdeffinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobjects.Loginpage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinitions {
	
	public WebDriver driver;
	public Loginpage lp;

	@Given("user launch chrome webbrowser")
	public void user_launch_chrome_webbrowser() throws Exception {
	  System.setProperty("webdriver.driver.chromedriver", 
			  "/Users/srinivasulukolluri/eclipse-workspace/demoblazeproject/drivers/chromedriver");
      driver = new ChromeDriver(); 
	  
      lp = new Loginpage(driver);
      
	}

@When("user openes Url {string}")
public void user_openes_Url(String Url) throws Exception {
       driver.get(Url);
       Thread.sleep(3000);
      
}

@When("Click on the login")
public void click_on_the_login() throws Exception {
   lp.clickLogin();
   Thread.sleep(3000);
}

@When("user enters user name as srinivas123 and  password as mynameissrinivas")
public void user_enters_user_name_as_srinivas123_and_password_as_mynameissrinivas(String username, String password){
 lp.setUserName(username);
 lp.setPassword(password);

	
}

@Then("page title should be {string}")
public void page_title_should_be(String title) {
   
	if(driver.getPageSource().contains("Wrong password")) {
		driver.close();
		Assert.assertTrue(false);
		
	}else {
		Assert.assertEquals(title, driver.getTitle());
	}
}

@When("user click on log out link")
public void user_click_on_log_out_link() throws Exception {
   lp.clickLogout();
	Thread.sleep(3000);
}

@Then("close browser")
public void close_browser() {
 driver.quit();  
}		
	
}
