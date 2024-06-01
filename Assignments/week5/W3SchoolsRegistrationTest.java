package Assignments.week5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class W3SchoolsRegistrationTest {
    WebDriver driver;
    @DataProvider()
	public String[][] data() throws IOException
	{
		return ReadExcel.readexcel();
	}

    @BeforeTest
    public void setUp() {
    	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
    }

    @Test(dataProvider = "registrationData")
    public void fillRegistrationForm(String fullName, String email, String address, String city, String state, String zip, String cvv, String creditCardNumber, String nameOnCard) {
        driver.switchTo().frame("iframeResult");

      //Name on Card: [Provide a data from Excel sheet]
      		driver.findElement(By.id("cname")).sendKeys(nameOnCard);
      		
      		//Credit card number: [Provide a data from Excel sheet]
      		driver.findElement(By.id("ccnum")).sendKeys(creditCardNumber);
      		
      		//Exp Month: Oct
      		driver.findElement(By.id("expmonth")).sendKeys("September");
      		
      		//CVV: [Provide a data from Excel sheet]
      		driver.findElement(By.id("cvv")).sendKeys(cvv);
      		
      		//Exp Year: 2018
      		driver.findElement(By.id("expyear")).sendKeys("2018");
      		
      		//Full Name: [Provide a data from Excel sheet]
      		driver.findElement(By.id("fname")).sendKeys(fullName);
      		
      		//Email: [Provide a data from Excel sheet ]
      		driver.findElement(By.id("email")).sendKeys(email);
      		
      		//Address: [Provide a data from Excel sheet]
      		driver.findElement(By.id("adr")).sendKeys(address);
      		
      		//City: [Provide a data from Excel sheet]
      		driver.findElement(By.id("city")).sendKeys(city);
      		
      		//Zip: [Provide a data from Excel sheet]
      		driver.findElement(By.id("zip")).sendKeys(zip);
      		
      		//State: [Provide a data from Excel sheet]
      		driver.findElement(By.id("state")).sendKeys(state); 
      		
    }}
      		



