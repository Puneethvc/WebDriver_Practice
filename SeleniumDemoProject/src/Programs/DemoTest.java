package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumDemoProject\\Drivers\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setBinary("D:\\selenium\\Drivers\\chromedriver-win64\\chromedriver-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("www.https//amazon.in");

	}

}
