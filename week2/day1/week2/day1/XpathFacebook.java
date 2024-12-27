package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFacebook {

	public static void main(String[] args) 
	
	{
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/"); // Get the URL
		driver.manage().window().maximize(); // Maximize the Window
		
		// Username - Attribute X-path type
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("olaytel@gmail.com"); 
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Success10$");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		

	}

}
