package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions act = new Actions(driver);
		// handle minimum slider		
		 WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		 System.out.println("location of min slider"+ min_slider.getLocation());
		 act.dragAndDropBy(min_slider, 150, 249).build().perform();
		 System.out.println("location of min slider"+ min_slider.getLocation());
		 
		 // maximum slider
		 
		 WebElement max_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		 System.out.println("location of min slider"+ max_slider.getLocation());
		 act.dragAndDropBy(max_slider, -100, 249).build().perform();
		 System.out.println("location of min slider"+ max_slider.getLocation());
		 
		 driver.close();
	}
}

