package StepDefinations;



import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
    
    public WebDriver driver;
    public LogInPage lp ;

    @Given("User Launch chrome browser")
    public void user_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        lp = new LogInPage(driver);
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

    
    @And("User click on Log Out link")
    public void user_click_on_log_out_link() throws InterruptedException {
        lp.clickLogOut();
        Thread.sleep(3000);
    }
    
    @Then("close the browser")
    public void close_the_browser() {
        driver.quit();
    }

}
