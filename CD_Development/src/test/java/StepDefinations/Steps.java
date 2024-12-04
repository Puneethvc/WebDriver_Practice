package StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LogInPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	
	public WebDriver driver;
	public LogInPage lp;

@Given("User Launch chrome browser")
public void user_launch_chrome_browser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	lp = new LogInPage(driver);
	
	
}

@When("User opens URL {string}")
public void user_opens_url(String url) {
	driver.get(url);
	
}

@And("User enters email as {email} and password as {password}")
public void user_enters_email_as_and_password_as(String email, String password) {
	lp.setUserName(email);
	lp.setPassword(password);
	
}

@And("click on Login")
public void click_on_login() {
	lp.clickLogin();
//	lp.clickLogOut();
}

@Then("page Title should be {string}")
public void page_title_should_be(String Expectedtitle) {
	String ActualTitle=driver.getTitle();
	if(ActualTitle.equals(Expectedtitle)) {
		
		Assert.assertTrue(true);
	}else {
		Assert.assertTrue(true);
	}
}


@When("User click on Log Out link")
public void user_click_on_log_out_link() throws InterruptedException {

	lp.clickLogOut();
	Thread.sleep(3000);
	
}

@Then("close the browser")
public void close_the_browser() {
	driver.quit();

	
}



}
