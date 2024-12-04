package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	//	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//		Method 1
//		for(int i=0;i<checkbox.size();i++) {
//		checkbox.get(i).click();
//		}
		// Method 2
//		for(WebElement checkboxes: checkbox) {
//			checkboxes.click();
//			}
		
//		Method 3 Select last 3 check boxes
		
		// formula = total number of check boxes - number of checkboxes to select
		/*
		for(int i=4;i<checkbox.size();i++) {
			checkbox.get(i).click();
			}
		
		System.out.println("operation complete");
		Thread.sleep(10000);
		driver.close();
		*/
	List<WebElement> nextbox = driver.findElements(By.xpath("//ul[@class='pagination']/li"));
	for(int i=0;i<nextbox.size();i++) {
		nextbox.get(i).click();
		Thread.sleep(10000);
		}
	}

}
