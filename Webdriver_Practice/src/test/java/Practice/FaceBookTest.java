package Practice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	
	}
	
	@Test
	public void verifyLoginPageTitle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		
	}
	
	@Test
	public void verifyForgotPassword() {
		String Forgettext = (driver.findElement(By.xpath("//a[text()='Forgotten password?']"))).getText();
		org.testng.Assert.assertEquals(Forgettext, "Forgotten password?");
	}
	
	@Test
	public void verifyCreateLabel() {
		String LabelText = (driver.findElement(By.xpath("//a[text()='Create new account']"))).getText();
		org.testng.Assert.assertEquals(LabelText, "Create new account");
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
