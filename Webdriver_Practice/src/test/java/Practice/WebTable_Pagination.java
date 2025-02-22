
package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_Pagination {
	
	public static void main(String[] args) {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://demo.opencart.com/admin/index.php");
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.clear();
	username.sendKeys("demo");
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.clear();
	password.sendKeys("demo");
	
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
	driver.findElement(By.xpath("//button[@id='button-menu']")).click();
	driver.findElement(By.xpath("//a[@class='parent']")).click();
	driver.findElement(By.xpath("//a[text()='Customers']")).click();
	
	
	
}
}