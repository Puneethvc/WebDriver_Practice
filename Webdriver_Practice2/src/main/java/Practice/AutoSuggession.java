package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggession {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		
		System.out.println("Size of list"+ list.size());
		
		for(WebElement listitem : list) {
			if(listitem.getText().contains("download")) {
				listitem.click();
				break;
			}
		}
		*/
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("java tutorials");
		Thread.sleep(3000);
		List<WebElement> list =driver.findElements(By.xpath("//ul[@class='G43f7e']//li[@class='sbct PZPZlf']//div[@class='wM6W7d']//span]"));
		System.out.println("total drop down list "+ list.size());
	
		for(WebElement lists : list)
		{
		if(lists.getText().contains("java tutorials")) {
			lists.click();
			break;
		}
		}
	
	}

}
