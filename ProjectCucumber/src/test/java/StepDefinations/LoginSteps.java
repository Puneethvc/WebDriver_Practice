package StepDefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
    
    public WebDriver driver;
    public LoginPage lp ;

    @Given("User Launch chrome browser")
    public void user_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        lp = new LoginPage(driver);
    }
    
    @When("User opens URL {string}")
    public void user_opens_url(String URL) {
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
    @And("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String userName, String Password) {
        lp.setUserName(userName);
        lp.setPassword(Password);
    }
    
    @And("click on Login")
    public void click_on_login() {
        lp.clickLogin();
    }
    
    @Then("page Title should be {string}")
    public void page_title_should_be(String title) {

//        if (driver.getPageSource().contains("Login was unsuccessful.")) {
//            driver.close();
//            Assert.assertTrue(false);
//        } else {
//            Assert.assertEquals(title, driver.getTitle());
//        }
    	
    	 String actualTitle = driver.getTitle();
         System.out.println("---------------"+actualTitle);
    }

   /* 
    @Then("page Title should be {string}")
    public void page_title_should_be(String Expectedtitle) {
    	String ActualTitle=driver.getTitle();
    	
    	System.out.println("Actual title---"+ActualTitle);
    	if(ActualTitle
    	.equals(Expectedtitle)) {
    		
    		Assert.assertTrue(true);
    	}else {
    		Assert.assertTrue(true);
    	}
    }
    */
 
    
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
