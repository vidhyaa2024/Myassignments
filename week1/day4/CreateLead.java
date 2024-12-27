package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver(); // Initialize the WebDriver
		driver.get("http://leaftaps.com/opentaps/control/main"); // Load the URL
		driver.manage().window().maximize();// Maximize
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); //username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); //password
		driver.findElement(By.className("decorativeSubmit")).click(); // Click Login Button
		driver.findElement(By.linkText("CRM/SFA")).click(); // "CRM/SFA" link
        driver.findElement(By.linkText("Leads")).click(); // Leads tab
        driver.findElement(By.linkText("Create Lead")).click(); // Create Lead Button
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf"); // Company name
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidhyaa"); // First Name
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("JanakiRaman");// last Name
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Create Lead"); // Title name
        driver.findElement(By.name("submitButton")).click(); // Create Lead Button
        //driver.findElement(By.className("frameSectionExtra"));
        Thread.sleep(10000);
        driver.close();
        
        
        
        
        }

}
