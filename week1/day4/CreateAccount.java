package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver driver = new ChromeDriver(); // Initialize the WebDriver (ChromeDriver)

		driver.get("http://leaftaps.com/opentaps/control/main"); 	// Load the URL
		driver.manage().window().maximize(); // Maximize 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); // username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // Password
		driver.findElement(By.className("decorativeSubmit")).click(); // Click the Login
		driver.findElement(By.linkText("CRM/SFA")).click(); // "CRM/SFA
		driver.findElement(By.partialLinkText("Accounts")).click(); // Account Module
	    driver.findElement(By.linkText("Create Account")).click(); // Create account 
	    driver.findElement(By.id("accountName")).sendKeys("Vidhyaa.M"); // Enter the Account Name 
	    driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");    //  Site Name
	    driver.findElement(By.id("numberEmployees")).sendKeys("20"); // Number of Employee
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");  // description
	    driver.findElement(By.className("smallSubmit")).click(); 
	    // Click the create Account button
	    Thread.sleep(10000);
	    driver.close(); // close the Window
	    
	    
	   
	    
	   
				

	}

}
