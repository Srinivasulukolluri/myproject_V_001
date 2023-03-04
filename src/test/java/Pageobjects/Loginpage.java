package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public WebDriver chromedriver;
	
	public Loginpage(WebDriver chromedriver) {
		
		chromedriver = chromedriver;
		
		PageFactory.initElements(chromedriver, this);
		
		
	}
	
	@FindBy(id = "login2")
	@CacheLookup
	WebElement login;
	
     @FindBy(id = "username")
     @CacheLookup
     WebElement txtusername;
     
     @FindBy(id = "password")
     @CacheLookup
     WebElement txtpassword;
     
     
	@FindBy(xpath = "\"//li[@class='nav-item']//a[normalize-space()='Sign up']\"")
	@CacheLookup
	WebElement signup;
	
	@FindBy(xpath = "//div[@class='modal-body']//input[@id='sign-username']")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath ="//div[@class='modal-body']//input[@id='sign-password']")
	@CacheLookup
	WebElement password;
	

	@FindBy(xpath ="//a[normalize-space()='Log out']")
	@CacheLookup
	WebElement logout;
	
	
	

public void setUserName(String Uname) {
	
	txtusername.clear();
	txtusername.sendKeys(Uname);
}
public void setPassword(String pwd) {
	
	txtpassword.clear();
	txtpassword.sendKeys(pwd);
}

public void clickLogin() {
	
	login.click();
}

public void clickLogout(){
logout.click();
}



}
	

