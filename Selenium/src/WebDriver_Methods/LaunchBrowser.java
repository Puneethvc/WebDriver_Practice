package WebDriver_Methods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://selenium//Drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver .get("https://www.google.com/");

	}

}