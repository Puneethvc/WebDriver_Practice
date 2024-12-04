package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		String windowId = driver.getWindowHandle();
//		System.out.println(windowId);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowsIds = driver.getWindowHandles();
		/*
//		method1 --Iterator
		Iterator<String> it = windowsIds.iterator();
		String parentID = it.next();
		String ChildID = it.next();
		
		System.out.println("Parent window ID "+ parentID);
		System.out.println("Child Window ID "+ ChildID);
		
		*/
		/*
		List<String> window = new ArrayList(windowsIds);
		String parent = window.get(0);
		String child = window.get(1);
		
//		System.out.println(parent);
//		System.out.println(child);
		
		driver.switchTo().window(parent);
		System.out.println("title of Parent Window "+ driver.getTitle());
		
		driver.switchTo().window(child);
		System.out.println("Child Window "+ driver.getTitle());
		
		
		*/
		
		for(String web : windowsIds) {
			String parenttitle = driver.switchTo().window(web).getTitle();
			
		}
	}
}
