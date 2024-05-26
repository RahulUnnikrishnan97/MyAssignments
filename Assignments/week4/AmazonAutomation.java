package Assignments.week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AmazonAutomation {
    public static void main(String[] args) throws IOException {
        // Set up ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        	ChromeOptions options = new ChromeOptions();
        	WebDriver driver = new ChromeDriver(options);
        	driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Step 1: Load the URL
            driver.get("https://www.amazon.in/");

            // Step 2: Search for "oneplus 9 pro"
            WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
            searchBar.sendKeys("oneplus 9 pro");
            searchBar.submit();

            // Step 3: Get the Price of the First Product
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstProductPrice = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("(//span[@class='a-price-whole'])[1]")
            ));
            System.out.println("Price of the first product: " + firstProductPrice.getText());

            // Step 4: Print the Number of Customer Ratings for the First Displayed Product
            WebElement customerRatings = driver.findElement(By.xpath("(//span[@class='a-size-base'])[1]"));
            System.out.println("Number of customer ratings for the first product: " + customerRatings.getText());

            // Step 5: Click the First Text Link of the First Image
            WebElement firstImageLink = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[1]//a"));
            firstImageLink.click();

            // Step 6: Take a Screenshot of the Product Displayed
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("productTitle"))); // Wait for product page to load
            //File src = driver.getScreenshotAs(OutputType.FILE);
            File src = ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);
    		File destination = new File("./Snaps/Webpage1.jpg");
    		FileUtils.copyFile(src,destination);

            // Step 7: Click the 'Add to Cart' Button
            WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button")));
            addToCartButton.click();

            // Step 8: Get the Cart Subtotal and Verify if it is Correct
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("attach-accessory-cart-subtotal"))); // Wait for cart to update
            WebElement cartSubtotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']//span[@class='a-price-whole']"));
            System.out.println("Cart subtotal: " + cartSubtotal.getText());

            // Step 9: Close the Browser
            driver.quit();
        }
    }
