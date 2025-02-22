package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Allert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		String s = "You successfully clicked an alert";
		
		WebElement text = driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']"));
		String a = text.getText();
		
		if(a.equals(s)) {
			System.out.println("text compared success----" + a);
		}else
			System.out.println("failed");
		
		driver.close();
		
	}

}
