package Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("https://amazon.in");
		
		/*
		// capturing the full page 
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenShots\\amazon.png");
		
		FileUtils.copyFile(src, dest);
		*/
		
		// capturer specfic field of the page
		
		WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenShots\\amazonLogo.png");
		
		FileUtils.copyFile(src, dest);
		/*
		
		 * WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest =new File(System.getProperty("user.dir")+"\\ScreenShots\\puni.png");
		src.renameTo(dest);
//		FileUtils.copyFile(src, dest);
		System.out.println();
		
		
		 */
		
	}

}
