package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LocusFlipCartAssignment {


    public static void main(String[] args) {
       
       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open Flipkart website
        driver.get("https://www.flipkart.com/");

        // Close popup if displayed
        try {
            WebElement popupCloseButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
            if (popupCloseButton.isDisplayed()) {
                popupCloseButton.click();
            }
        } catch (Exception e) {
            // Popup not displayed
        }

	        // Test Case 1: Verify that the search bar is present on the homepage
	        WebElement searchBar = driver.findElement(By.name("q"));
	        assert searchBar.isDisplayed();
	
	        // Test Case 2: Perform a search for term 'shoes'
	        searchBar.sendKeys("shoes");
	        searchBar.submit();

        // Test Case 3: Verify that the search check the results page is displayed after searching for 'shoes'
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement searchResultsTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("_1S7OK2")));
        assert searchResultsTitle.getText().contains("shoes");

        // Test Case 4: Apply price filter
        WebElement priceFilter = driver.findElement(By.xpath("//div[@title='Price']"));
        priceFilter.click();
        WebElement minPriceInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_1YAKP4']/input[@type='text'][1]")));
        minPriceInput.sendKeys("500");
        WebElement maxPriceInput = driver.findElement(By.xpath("//div[@class='_1YAKP4']/input[@type='text'][2]"));
        maxPriceInput.sendKeys("1000");
        WebElement applyButton = driver.findElement(By.xpath("//button[text()='APPLY']"));
        applyButton.click();

        // Test Case 5: Verify that the price filter is applied successfully
        WebElement appliedFilters = driver.findElement(By.className("_1AtVbE"));
        assert appliedFilters.getText().contains("₹500 to ₹1,000");

        // Test Case 6: Apply brand filter
        WebElement brandFilter = driver.findElement(By.xpath("//div[@title='Brand']"));
        brandFilter.click();
        WebElement pumaBrandCheckbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Puma']/preceding-sibling::div")));
        pumaBrandCheckbox.click();

        // Test Case 7: Verify that the brand filter is applied successfully
        assert appliedFilters.getText().contains("Puma");

        // Test Case 8: Click on the first search result to open the product detail page
        WebElement firstSearchResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_2pi5LC col-12-12']/div[1]")));
        firstSearchResult.click();

        // Test Case 9: Verify that the product detail page is displayed successfully
        WebElement productDetailTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='B_NuCI']")));
        assert productDetailTitle.getText().contains("shoes");

        // Test Case 10: Select size of the item on the product detail page
        WebElement sizeDropdown = driver.findElement(By.xpath("//div[@class='_3oW6G6']/select"));
        sizeDropdown.click();
        WebElement sizeOption = driver.findElement(By.xpath("//option[text()='8']"));
        sizeOption.click();

        // Test Case 11: Click 'Buy Now' button
        WebElement buyNowButton = driver.findElement(By.xpath("//button[text()='BUY NOW']"));
        buyNowButton.click();

        // Test Case 12: Verify that the user is redirected to the login page
        WebElement loginPageTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_39M2dM JB4AMj']")));
        assert loginPageTitle.getText().contains("Login");

        // Close the browser
        driver.quit();
    }
}

