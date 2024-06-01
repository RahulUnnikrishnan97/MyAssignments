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
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class W3SchoolsRegistrationTest {
    WebDriver driver;

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

        driver.findElement(By.name("fname")).sendKeys(fullName);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("adr")).sendKeys(address);
        driver.findElement(By.name("city")).sendKeys(city);
        driver.findElement(By.name("state")).sendKeys(state);
        driver.findElement(By.name("zip")).sendKeys(zip);
        driver.findElement(By.name("expyear")).sendKeys("2018");
        driver.findElement(By.name("cvv")).sendKeys(cvv);
        driver.findElement(By.name("expmonth")).sendKeys("Oct");
        driver.findElement(By.name("ccnum")).sendKeys(creditCardNumber);
        driver.findElement(By.name("cname")).sendKeys(nameOnCard);
    }

    @DataProvider(name = "registrationData")
    public Object[][] getRegistrationData() {
        // Read data from Excel file
        String excelPath = "path/to/your/excel/file.xlsx";
        Object[][] testData = null;
        try {
            FileInputStream file = new FileInputStream(new File(excelPath));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            int rowCount = sheet.getLastRowNum();
            int colCount = sheet.getRow(0).getLastCellNum();
            testData = new Object[rowCount][colCount];
            for (int i = 1; i <= rowCount; i++) {
                XSSFRow row = sheet.getRow(i);
                for (int j = 0; j < colCount; j++) {
                    Cell cell = row.getCell(j);
                    testData[i - 1][j] = cell.getStringCellValue();
                }
            }
            workbook.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return testData;
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
