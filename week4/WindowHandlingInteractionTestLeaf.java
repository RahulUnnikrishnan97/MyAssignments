package Assignments.week4;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingInteractionTestLeaf {
	
	
	public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	//Load a URL
	driver.get("http://leaftaps.com/opentaps/");
	//Maximize the Window
	driver.manage().window().maximize();
	//Enter user Name
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	//Enter password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	//Login
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	//Click on the "CRM/SFA" link
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	//Click on the Contacts button
	WebElement contacts_button = driver.findElement(By.linkText("Contacts"));
	contacts_button.click();

	//Click on Merge Contacts
	WebElement merge_contacts_link = driver.findElement(By.linkText("Merge Contacts"));
	merge_contacts_link.click();

	//Click on the widget of the "From Contact"
	WebElement from_contact_widget = driver.findElement(By.xpath("//img[@alt='Lookup']"));
	from_contact_widget.click();

	//Handle the new window for "From Contact"
//	String mainWindow = driver.current_window_handle;
//	String all_windows = driver.window_handles;
//
	//for window in all_windows;
//	    if window != main_window;
//	        driver.switch_to.window(window);
//	        break;

	//Click on the first resulting contact
	WebElement first_contact = driver.findElement(By.xpath("//a[@class='linktext']"));
	first_contact.click();

	//Switch back to the main window
	//driver.switch_to.window(main_window);
	driver.switchTo().window(mainWindow);

	//Click on the widget of the "To Contact"
	WebElement to_contact_widget = driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]"));
	to_contact_widget.click();

	//Handle the new window for "To Contact"
	//all_windows = driver.window_handles
	Set<String> allWindows = driver.getWindowHandles();

//	for Window in all_windows;
//	    if window != mainWindow;
//	        driver.switchTo().window(window);
//	        break;

	//Click on the second resulting contact
	WebElement second_contact = driver.findElement(By.xpath("(//a[@class='linktext'])[2]"));
	second_contact.click();

	//Switch back to the main window
	driver.switchTo().window(mainWindow);

	//Click on the Merge button
	WebElement merge_button = driver.findElement(By.className("buttonDangerous"));
	merge_button.click();

	//Accept the alert
	Alert simpleAlert = driver.switchTo().alert().accept();
	//alert = WebDriverWait(driver, 10).until(EC.alert_is_present());
	
	

	//Verify the title of the page
	String expected_title = "View Contact | opentaps CRM";
	String actual_title = driver.getTitle();


	//Print a success message if the title matches
	System.out.println("Title verification successful!");

	//Close the browser
	driver.quit();

}
}
