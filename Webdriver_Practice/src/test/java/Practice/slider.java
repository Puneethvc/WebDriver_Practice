package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
//		 WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
//		 System.out.println("location of min slider"+ min_slider);
		 
//		 Actions act = new Actions(driver);
//		 act.moveToElement(min_slider, 150, 0);
		 
//		 driver.close();
	

	}

}
