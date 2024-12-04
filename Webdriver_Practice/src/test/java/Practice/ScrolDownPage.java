
package Practice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ScrolDownPage {
	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://amazon.in");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//method 1
//	js.executeScript("window.ScrollBy(0,10000)","");
	
	// method 2
//	WebElement ele = driver.findElement(By.xpath("//span[@id='a-autoid-1']"));
//	js.executeScript("arguments[0].scrollIntoView();", ele);
	
	//method3 
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
}