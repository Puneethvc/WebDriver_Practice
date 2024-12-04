package Practice;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderLogInTest {

	public static WebDriver driver;
		
		@BeforeClass
		void setUp() {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
				
		}
		
		@Test(dataProvider ="login")		
		public void logintest(String name,String pwd) throws InterruptedException {
			
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(name);
			driver.findElement(By.id("input-password")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
			boolean status = driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
			if(status==true) {
				driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
				Assert.assertTrue(true);
				System.out.println("clicked logout successfully");
			}else {
				Assert.fail();
			}
		}	
		
		@DataProvider
		public Object[][] login(){
			Object obj[][]={
					{"puneethvcvivek@gmail.com","Puneeth@4441"},
					{"puneeth@gmail.com","puneeth123"}
			
							};
						
			return obj;
			
		}
		
		@AfterClass
		void tearDown() {
			driver.quit();
		}
}

