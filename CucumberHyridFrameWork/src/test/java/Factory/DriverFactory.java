package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	 static WebDriver driver = null;
	
	public static void initilizeBrowser(String browser) {
		
		if(browser.equals("chrome")) {
			 driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			 driver = new FirefoxDriver();
					
		}else if(browser.equals("edge")) {
			 driver = new EdgeDriver();
		}
	}
	
		public static WebDriver getDriver() {
			return driver;
			
		}
	}

