package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="Email")
	WebElement Emailtxt;
	
	@FindBy(id="Password")
	WebElement Passwordtxt;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement LoginBtn;
	
	@FindBy(linkText="Logout")
	WebElement LogoutBtn;
	
	
	public void setUserName(String uname) {
		Emailtxt.clear();
		Emailtxt.sendKeys(uname);
	}
	
	public void setPassword(String password) {
		Passwordtxt.clear();
		Passwordtxt.sendKeys(password);
	}
	
	public void clickLogin() {
		LoginBtn.click();
	}
	
	public void clickLogOut() {
		LogoutBtn.click();
	}
	
	

}
