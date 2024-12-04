package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickers {
    
    public static WebDriver driver;
    
    public static void SelectMonthAndYear(String month, String year) {

        while (true) {
            String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String current_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            
            System.out.println("Current month: " + current_month);
            System.out.println("Current year: " + current_year);
            
            if (month.equalsIgnoreCase(current_month) && year.equals(current_year)) {
                break;
            }
            
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
    }
    
    public static void SelectDate(String date) {
        List<WebElement> Dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
        
        for (WebElement dt : Dates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }
    }

    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); // Assigning to the static 'driver' variable
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Use a reasonable timeout value
        
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        
        String year = "2025";
        String month = "June";
        String date = "4";
        
        SelectMonthAndYear(month, year);
        SelectDate(date);
        
        System.out.println("Date selected successfully");
        
        driver.quit();  // It's a good practice to quit the driver at the end of the execution
    }
}
