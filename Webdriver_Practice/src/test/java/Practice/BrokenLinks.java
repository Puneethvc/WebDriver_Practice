package Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

    public static void main(String[] args) throws IOException {
        // Setting up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        try {
            // Maximize the window and set an implicit wait
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Open the test URL
            driver.get("http://www.deadlinkcity.com/");

            // Find all the anchor elements (links)
            List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println("Total links: " + links.size());

            int brokenLinksCount = 0;

            // Loop through all the links
            for (WebElement link : links) {
                String hrefValue = link.getAttribute("href");

                if (hrefValue != null && !hrefValue.isEmpty()) {
                    try {
                        URL url = new URL(hrefValue);
                        // Open an HTTP connection
                        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
                        httpConn.setConnectTimeout(5000);  // Set a timeout for the connection
                        httpConn.connect();

                        // Check if the response code is 400 or greater (indicating a broken link)
                        if (httpConn.getResponseCode() >= 400) {
                            System.out.println(hrefValue + " is a broken link");
                            brokenLinksCount++;
                        } else {
                            System.out.println(hrefValue + " is a valid link");
                        }
                    } catch (IOException e) {
//                        System.out.println(hrefValue + " is a broken link (Exception: " + e.getMessage() + ")");
//                        brokenLinksCount++;
                    }
                }
            }

            System.out.println("Number of broken links: " + brokenLinksCount);

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
