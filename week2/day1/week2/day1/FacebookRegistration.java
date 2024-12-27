package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver(); // chrome driver
		driver.get("https://www.facebook.com/"); // facebook Url
		driver.manage().window().maximize(); // Window Maximization
		driver.findElement(By.xpath("//a[text()='Create new account']")).click(); // Create New Account Button
		driver.findElement(By.name("firstname")).sendKeys("Vidhyaa"); // First name using Locator
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Janakiraman"); // Lastname using attribute based X-path
		
		// Birthday dropdown with select Class
		WebElement BDay = driver.findElement(By.id("day"));
		Select obj1 = new Select(BDay);
		obj1.selectByIndex(11);
		
		// Month Dropdown 
		
	/*	WebElement BMon = driver.findElement(By.id("month"));
		Select obj2 = new Select(BMon);
		obj2.selectByVisibleText("November");*/
		
		// year Dropdown
		
		WebElement Byear = driver.findElement(By.id("year"));
		Select obj3 = new Select(Byear);
		obj3.selectByVisibleText("1998");
		
		// Select the Gender
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
				
		// enter the Email address
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("VidJanaki@gmail.com");
		
		// Enter the New Password
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Welcome@123");
		
		// Click Signup Button
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		

	}

}
