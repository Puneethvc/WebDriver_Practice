package Practice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrames {

	public static void main(String[] args) {
	
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames");
//		driver.get("https://demo.automationtesting.in/Frames.html");
//		driver.get("https://www.countries-ofthe-world.com/flags-of-asia.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		/*
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outer);
		String text = driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
		System.out.println(text);
		WebElement innerFrame =driver.findElement(By.xpath("//div[@class='iframe-container']//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerFrame);
		System.out.println("switched");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Helo");
	
		*/
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// method1-- scrolling to pixel
//		js.executeScript("window.scrollBy(0,1000)", "");
		
		//method2-- scrolling page till element find
//		WebElement flag = driver.findElement(By.xpath("//img[@src='flags-normal/flag-of-India.png']"));
//		js.executeScript("arguments[0].scrollIntoView()",flag);
		
//		method3 --- scroll page till bottom
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
