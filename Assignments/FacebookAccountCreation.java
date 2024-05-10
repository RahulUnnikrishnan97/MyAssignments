package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;


public class FacebookAccountCreation {
	
	public static void main(String[] args) {
		
		//Initialize chrome page
		ChromeDriver driver= new ChromeDriver();
	    //get URL
		driver.get("https://en-gb.facebook.com/");
		//Maximizes the screen
		driver.manage().window().maximize();
		//wait seconds added
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//create a new account using button
		driver.findElement(By.partialLinkText("Create new account")).click();
		//Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rahul");
		//Enter the surname
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Krishnan");
		//Enter Email Address
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("rahulnair1297@gmail.com");
		//Re-enter email address
		//driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("rahulnair1297@gmail.com");
		//Enter Password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Rahul@111");
		//Drop down method to choose date
		WebElement sourceD = driver.findElement(By.id("day"));
		//instantiate the select class
		Select secd = new Select(sourceD);
		// To select the dropdown options
		secd.selectByIndex(3);
		
		WebElement sourceM = driver.findElement(By.id("month"));
		Select secm = new Select(sourceM);
		secm.selectByIndex(4);
		
		WebElement sourceY = driver.findElement(By.id("year"));
		Select secy = new Select(sourceY);
		secy.selectByIndex(12);
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		System.out.println(driver.getTitle());
		
		
	}

}