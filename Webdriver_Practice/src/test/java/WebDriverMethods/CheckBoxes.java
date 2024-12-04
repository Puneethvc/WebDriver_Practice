
package WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Practice.Allert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
	}
	
	@Test
	public void checkbox() {

		driver.switchTo().newWindow(WindowType.TAB);
		
//		WebElement box = driver.findElement(By.id("my-check-1"));
//		box.click();
//		
//		if(box.isSelected()) {
//			System.out.println("check box selected");
//		}else {
//			System.out.println("not selected");
//		}
		
	}
	
	@Test
	public void dropdown() {
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='my-select']"));
		
		Select s = new Select(dropdown);
		if(dropdown.getText().equals("One")){
			s.deselectByVisibleText("One");
		}
	}
		@Test
	public void searchShoe() {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		WebElement scroll = driver.findElement(By.xpath("//span[text()='ASIAN']/ancestor::div[@class='sg-col-inner']/descendant::span[text()='574']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",scroll);
		
	}
		
	}

