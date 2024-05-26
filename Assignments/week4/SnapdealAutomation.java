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
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class SnapdealAutomation {
    public static void main(String[] args) throws IOException {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

            // Precondition setup
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Step 1: Launch Snapdeal
            driver.get("https://www.snapdeal.com/");

            // Step 2: Go to "Men's Fashion"
            WebElement mensFashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
            Actions actions = new Actions(driver);
            actions.moveToElement(mensFashion).perform();

            // Step 3: Go to "Sports Shoes"
            WebElement sportsShoes = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
            sportsShoes.click();

            // Step 4: Get the count of sports shoes
            WebElement sportsShoesCount = driver.findElement(By.xpath("//span[@class='category-count']"));
            System.out.println("Count of sports shoes: " + sportsShoesCount.getText());

            // Step 5: Click on "Training Shoes"
            WebElement trainingShoes = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
            trainingShoes.click();

            // Step 6: Sort the products by "Low to High"
            WebElement sortDropdown = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']"));
            sortDropdown.click();
            WebElement lowToHighOption = driver.findElement(By.xpath("//li[@data-sorttype='plth']"));
            lowToHighOption.click();

            // Step 7: Check if the displayed items are sorted correctly
            List<WebElement> prices = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
            boolean isSorted = true;
            for (int i = 0; i < prices.size() - 1; i++) {
                if (Integer.parseInt(prices.get(i).getText().replaceAll("[^0-9]", "")) >
                        Integer.parseInt(prices.get(i + 1).getText().replaceAll("[^0-9]", ""))) {
                    isSorted = false;
                    break;
                }
            }
            System.out.println("Products are sorted by Low to High: " + isSorted);

            // Step 8: Select any price range ex:(500-700)
            WebElement priceRange = driver.findElement(By.xpath("//input[@name='fromVal']"));
            priceRange.clear();
            priceRange.sendKeys("500");
            WebElement toPriceRange = driver.findElement(By.xpath("//input[@name='toVal']"));
            toPriceRange.clear();
            toPriceRange.sendKeys("700");
            WebElement goButton = driver.findElement(By.xpath("//div[contains(text(),'GO')]"));
            goButton.click();

            // Step 9: Filter by any colour
            WebElement colorFilter = driver.findElement(By.xpath("//label[@for='Color_s-Black']"));
            colorFilter.click();

            // Step 10: Verify all the applied filters
            List<WebElement> appliedFilters = driver.findElements(By.xpath("//div[@class='filters-top-selected']//a"));
            System.out.println("Applied Filters:");
            for (WebElement filter : appliedFilters) {
                System.out.println(filter.getText());
            }

            // Step 11: Mouse hover on the first resulting "Training Shoes"
            WebElement firstTrainingShoe = driver.findElement(By.xpath("//picture[@class='picture-elem']//img"));
            actions.moveToElement(firstTrainingShoe).perform();

            // Step 12: Click the "Quick View" button
            WebElement quickViewButton = driver.findElement(By.xpath("//div[@class='clearfix row-disc']//div[@class='center quick-view-bar  btn btn-theme-secondary  ']"));
            quickViewButton.click();

            // Step 13: Print the cost and the discount percentage
            WebElement priceElement = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
            WebElement discountElement = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
            System.out.println("Cost: " + priceElement.getText());
            System.out.println("Discount Percentage: " + discountElement.getText());

            // Step 14: Take a snapshot of the shoes
            File src = ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);
    		File destination = new File("./Snaps/Webpage2.jpg");
    		FileUtils.copyFile(src,destination);

            // Step 15: Close the current window
            driver.close();

            // Step 16: Close the main window
            for (String windowHandle : driver.getWindowHandles()) {
                driver.switchTo().window(windowHandle);
            }
            driver.quit();
        
        }
    }
