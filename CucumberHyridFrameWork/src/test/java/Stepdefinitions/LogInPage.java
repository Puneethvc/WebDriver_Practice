package Stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInPage {
	public WebDriver driver;
	
	@Given("User navigate to login page")
	public void user_navigate_to_login_page() {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		
	}

	@When("User has enteres valid email address {string} into email field")
	public void user_has_enteres_valid_email_address_into_email_field(String emailText) {
		driver.findElement(By.id("input-email")).sendKeys(emailText);	    
	}

	@And("User has enterd valid password {string} into password field")
	public void user_has_enterd_valid_password_into_password_field(String Password) {
	   
		driver.findElement(By.id("input-password")).sendKeys(Password);
	}

//	@And("User click on Login button")
//	public void user_click_on_login_button_login() {
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//	}

	@Then("User get Successfully Logged in")
	public void user_get_successfully_logged_in() {
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
	}
	

@Given("User navigatated login page")
public void user_navigatated_login_page() {
	
}

@When("User has enteres invalid email address {string} into email field")
public void user_has_enteres_invalid_email_address_into_email_field(String invalidemail) {
	driver.findElement(By.id("input-email")).sendKeys(invalidemail);	
	
	
}

@When("User has enterd invalid password {string} into password field")
public void user_has_enterd_invalid_password_into_password_field(String invalidPasswors) {
	driver.findElement(By.id("input-password")).sendKeys(invalidPasswors);

}
@Then("User should get proper warning message about credentials missmatch")
public void user_should_get_proper_warning_message_about_credentials_missmatch() {
	//String WarningMsg=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
	Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
}

//@Given("User navigated to login page")
//public void user_navigated_to_login_page() {
//}

//@When("User enters valid email addres {string} into email field")
//public void user_enters_valid_email_addres_into_email_field(String string) {
//}

//@When("User enters invalid password {string} into password field")
//public void user_enters_invalid_password_into_password_field(String string) {
//}

//@And("User click on login button")
//public void user_click_on_login_button() {
//}

//@When("User enters invalid email addres {string} into email field")
//public void user_enters_invalid_email_addres_into_email_field(String string) {
//}
//
//@When("User does not enter email addres into email field")
//public void user_does_not_enter_email_addres_into_email_field() {
//}
//
//@When("User does not enter password into password field")
//public void user_does_not_enter_password_into_password_field() {
//}
	
	
	
	
	
	}
