package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement dropdown = driver.findElement(By.id("input-country"));
		
		Select s = new Select(dropdown);
		s.selectByValue("10");
		s.selectByVisibleText("India");
		s.selectByIndex(2);
		
		//without using methos
		
		List<WebElement> alloptions = s.getOptions();
		
		for(WebElement op : alloptions) {
			if(op.getText().equalsIgnoreCase("India")) {
				op.click();
				break;
			}
		}
*/
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		WebElement options = driver.findElement(By.name("Country"));
		
		Select s = new Select(options);
		// to get all the options from drop down
//		List<WebElement> all = s.getOptions();
//		  for (WebElement option : all) {
//	            System.out.println(option.getText());
//	        }
		List<WebElement> list = s.getOptions();
		
		for(WebElement ele : list) {
			if(ele.getText().contains("India")){
				ele.click();
			}
		}
	}

}
