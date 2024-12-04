package com_bank_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInpage {
	
	public WebDriver ldriver;
	public  LogInpage(WebDriver rdriver) {
	
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name ="uid")
	WebElement nameTxt;
	
	@FindBy(name="password")
	WebElement passTxt;
	
	@FindBy(name="btnLogin")
	WebElement logInBtn;
	
	public void setUserName(String uname) {
		nameTxt.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		passTxt.sendKeys(pwd);
	}
	
	public void clickSubmit() {
		logInBtn.click();
	}
	

}
