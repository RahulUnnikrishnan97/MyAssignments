package Assignments.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountTestLeaf {
	
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
		//Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		//Enter an account name
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Sathish");
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//Select "ComputerSoftware" as the industry.
		WebElement sourceI = driver.findElement(By.name("industryEnumId"));
		Select sec = new Select(sourceI);
		sec.selectByIndex(3);
		//Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement sourceO = driver.findElement(By.name("ownershipEnumId"));
		Select sec1 = new Select(sourceO);
		sec1.selectByVisibleText("S-Corporation");
		//Select "Employee" as the source using SelectByValue
		WebElement sourceS = driver.findElement(By.id("dataSourceId"));
		Select sec2 = new Select(sourceS);
		sec2.selectByValue("LEAD_EMPLOYEE");
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement sourceM = driver.findElement(By.id("marketingCampaignId"));
		Select sec3 = new Select(sourceM);
		sec3.selectByIndex(6);
		//Select "Texas" as the state/province using SelectByValue.
		WebElement sourceSt = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sec4 = new Select(sourceSt);
		sec4.selectByValue("TX");
		//Click the "Create Account" button.
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		//Verify that the account name is displayed correctly.
		System.out.println(driver.getTitle());
		//Close the browser window.
		driver.close();
		
	}

}