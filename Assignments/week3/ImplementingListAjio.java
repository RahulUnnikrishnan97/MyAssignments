package Assignments.week3;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class ImplementingListAjio {
	public static void main(String[] args) {
	       
	        ChromeDriver driver = new ChromeDriver();

	        // Launch the Ajio website
	        driver.get("https://www.ajio.com/");
	        driver.manage().window().maximize();

	        // Find the search box and type "bags", then press Enter
//	        WebElement searchBox = driver.findElement(By.cssSelector("input.search-bar"));
//	        searchBox.sendKeys("bags");
//	        searchBox.sendKeys(org.openqa.selenium.Keys.ENTER);
	        
	        driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
	        driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
	        //driver.findElement(By.xpath("//label[@class = 'facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags' and @for = 'Men Fashion Bags']")).click();
	        driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']/preceding-sibling::input[@type='checkbox']"));
	        List<WebElement> itemsfound = driver.findElements(By.xpath("//div[@class='length' and @aria-label='1,193 Items Found']"));
	        System.out.println("The total items found is" +itemsfound);
	        
	        List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
	        System.out.print("List of brands: ");
	        for (WebElement brand : brands) {
	            System.out.print(brand.getText() + ", ");
	        }
	        System.out.println();

	        // Get the list of names of the bags
	        List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
	        System.out.print("List of bag names: ");
	        for (WebElement bagName : bagNames) {
	            System.out.print(bagName.getText() + ", ");
	        }
	        System.out.println();

	        //Close the browser
	        driver.quit();
	    }

}
