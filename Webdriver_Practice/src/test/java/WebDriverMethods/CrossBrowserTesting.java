package WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	
	public WebDriver driver;
	
	@BeforeTest
	
	public void setUp(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
		else {
			driver= new EdgeDriver();
		}
	}	
	
	 @BeforeMethod
	 public void launchApp() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	 }
	 
	 @Test
	 @Parameters("browser")
	 public void LogInPage() {
		 
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.name("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		 
		 
	 }
	 @AfterMethod
	 public void TearDown() {
		 driver.quit();
	 }
	 
	 
	 
	 
	}


