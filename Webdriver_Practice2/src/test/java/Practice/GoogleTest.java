package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("https://amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("proter k");
		List<WebElement> sug = driver.findElements(By.xpath("//div[@class='s-suggestion-container']//span"));
		System.out.println(" Size of the list --"+sug.size());
		
		for(WebElement ele : sug) {
			if(ele.getText().equals("protar k")) {
				ele.click();
				break;
				
			}
		}
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//method1
		JavascriptExecutor jse =  (JavascriptExecutor) driver;		
		jse.executeScript("window.scroolBy(0,1500)");
		
		//method2
//		WebElement elment = driver.findElement(by.)
//		jse.executeScript("arguments[0].scrollIntoView();", element);
		
		
		
		
	}

}
