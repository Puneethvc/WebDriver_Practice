package WebDriverMethods;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class links {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            
            driver.get("http://www.deadlinkcity.com/");
            
            List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println("Total links-- " + links.size());
            
            int brokenLinksCount = 0;
            
            for (WebElement ele : links) {
                String hrefValue = ele.getAttribute("href");
                
                if (hrefValue != null && !hrefValue.isEmpty()) {
                    try {
                        URL url = new URL(hrefValue);
                        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
//                        httpConn.setRequestMethod("HEAD");
//                        httpConn.setConnectTimeout(3000); // 3 seconds timeout for connection
                        httpConn.connect();
                        
//                        int responseCode = httpConn.getResponseCode();
                        
                        if (httpConn.getResponseCode() >= 400) {
                            System.out.println(hrefValue + " is a broken link");
                            brokenLinksCount++;
                        }else {
                        	System.out.println(httpConn+"not broken link");
                        }
                        
//                        httpConn.disconnect(); // Close the connection
                    } catch (Exception e) {
//                        System.out.println(hrefValue + " is a broken link (Exception: " + e.getMessage() + ")");
//                        brokenLinksCount++;
                    }
                }
            }
            
            System.out.println("Total broken links-- " + brokenLinksCount);
        } finally {
            driver.quit(); // Ensure the WebDriver session is closed properly
        }
    }
}
