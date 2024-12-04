package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sugestions {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("https://google.in");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		List<WebElement> sug = driver.findElements(By.xpath("//li[@role='presentation']//div[@class='wM6W7d']//span"));
		System.out.println("Size of the elements availabe in "+ sug.size());
		
		for(int i=0;i<sug.size();i++) {
			String text = sug.get(i).getText();
			if(text.contains("selenium")){
				sug.get(i).click();break;
			}
		}
	
	}

}
